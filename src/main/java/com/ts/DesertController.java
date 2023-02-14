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

import com.dao.DesertDAO;
import com.model.Adventure;
import com.model.Desert;



@RestController
public class DesertController {
	@Autowired	//Dependency Injection
	DesertDAO desertDAO;

	@RequestMapping("/showAllDesert")
	public List<Desert> showAllDesert() {
		List<Desert> prodList = desertDAO.getAllDesert();
		return prodList;
	}
	
	@PostMapping("/registerDesert")
	public String registerCat(@RequestBody Desert desert){
		
		Desert d = desertDAO.register(desert);

		if ( d.getProdId()!=-1 && d != null)
			return "Registration success";

		return "Registration Failed!!!";
	}
	
	@PutMapping("/updateDesert")
	public String updateDesert(@RequestBody Desert desert) {

		Desert d = desertDAO.updateProduct(desert);

		if ( d.getProdId()!=-1 && d != null)
			return "Updated success";

		return "Updation Failed!!!";
	}

	@DeleteMapping("/deleteDesert/{prodId}")
	public String deleteAdventure(@PathVariable("prodId") int prodId) {
		desertDAO.deleteProduct(prodId);
		return "Employee(" + prodId + ") Record Deleted Successfully!";
	}
}
