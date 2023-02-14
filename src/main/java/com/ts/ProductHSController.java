
package com.ts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.ProductHSDAO;
import com.model.Beach;
import com.model.ProductHS;

@RestController
public class ProductHSController {
	
	@Autowired	//Dependency Injection
	ProductHSDAO prodHSDAO;

	@RequestMapping("/showAllProducts")
	public List<ProductHS> showAllProducts() {
		List<ProductHS> prodList = prodHSDAO.getAllProducts();
		return prodList;
	}
	
	@PostMapping("/registerProductHS")
	public String registerBeach(@RequestBody ProductHS productHS){
		
		ProductHS b = prodHSDAO.register(productHS);

		if ( b.getProdId()!=-1 && b != null)
			return "Registration success";

		return "Registration Failed!!!";
	}
	
	@PutMapping("/updateProductHS")
	public String updateBeach(@RequestBody ProductHS productHS){

		ProductHS b = prodHSDAO.updateProduct(productHS);

		if (b.getProdId()!=-1 && b != null)
			return "Updated success";

		return "Updation Failed!!!";
	}

	@DeleteMapping("/deleteProductHS/{prodId}")
	public String deleteBeach(@PathVariable("prodId") int prodId) {
		prodHSDAO.deleteProduct(prodId);
		return "Product(" + prodId + ") Record Deleted Successfully!";
	}
	
}
	