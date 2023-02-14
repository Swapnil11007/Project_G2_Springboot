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

import com.dao.AdventureDAO;
import com.model.Adventure;



@RestController
public class AdventureController {
	@Autowired	//Dependency Injection
	AdventureDAO adventureDAO;

	@RequestMapping("/showAllAdventure")
	public List<Adventure> showAllAdventure() {
		List<Adventure> prodList = adventureDAO.getAllAdventure();
		return prodList;
	}
	
	@PostMapping("/registerAdenture")
	public String registerCat(@RequestBody Adventure adventure){
		
		Adventure a = adventureDAO.registerUserDao(adventure);

		if ( a.getProdId()!=-1 && a != null)
			return "Registration success";

		return "Registration Failed!!!";
	}
	
	@PutMapping("/updateAdventure")
	public String updateAdventure(@RequestBody Adventure adventure) {

		Adventure a = adventureDAO.registerUserDao(adventure);

		if ( a.getProdId()!=-1 && a != null)
			return "Updated success";

		return "Updation Failed!!!";
	}

	@DeleteMapping("/deleteAdventure/{prodId}")
	public String deleteAdventure(@PathVariable("prodId") int prodId) {
		adventureDAO.deleteAdventureDAO(prodId);
		return "Employee(" + prodId + ") Record Deleted Successfully!";
	}
}
