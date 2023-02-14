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

import com.dao.BeachDAO;
import com.model.Adventure;
import com.model.Beach;

@RestController
public class BeachController {
	@Autowired	//Dependency Injection
	BeachDAO beachDAO;

	@RequestMapping("/showAllBeach")
	public List<Beach> showAllBeach() {
		List<Beach> prodList = beachDAO.getAllBeach();
		return prodList;
	}
	
	
	@PostMapping("/registerBeach")
	public String registerBeach(@RequestBody Beach beach){
		
		Beach b = beachDAO.register(beach);

		if ( b.getProdId()!=-1 && b != null)
			return "Registration success";

		return "Registration Failed!!!";
	}
	
	@PutMapping("/updateBeach")
	public String updateBeach(@RequestBody Beach beach){

		Beach b = beachDAO.updateProduct(beach);

		if (b.getProdId()!=-1 && b != null)
			return "Updated success";

		return "Updation Failed!!!";
	}

	@DeleteMapping("/deleteBeach/{prodId}")
	public String deleteBeach(@PathVariable("prodId") int prodId) {
		beachDAO.deleteProduct(prodId);
		return "Product(" + prodId + ") Record Deleted Successfully!";
	}
}
