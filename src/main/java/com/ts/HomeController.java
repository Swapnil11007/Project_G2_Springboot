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

import com.dao.HomeDAO;
import com.model.Home;
import com.model.Users;

@RestController
public class HomeController {
	
	@Autowired
	HomeDAO homeDAO;
	
	@RequestMapping("/showAllCat")
	public List<Home> showAllCategories() {
		List<Home> catList = homeDAO.getAllCategories();
		return catList;
	}

	@RequestMapping("/getByRating")
	public List<Home> getByRating(){
		List<Home> catList =homeDAO.getAllProdByRating();
		return catList;
	}
	
	@PostMapping("/registerCat")
	public String registerCat(@RequestBody Home home){
		
		Home h = homeDAO.registerUserDao(home);

		if ( h.getId()!=-1 && h != null)
			return "Registration success";

		return "Registration Failed!!!";
	}
	
	@PutMapping("/updateCat")
	public String updateCat(@RequestBody Home home) {

		Home h = homeDAO.registerUserDao(home);

		if ( h.getId()!=-1 && h != null)
			return "Update success";

		return "Update Failed!!!";
	}

	@DeleteMapping("/deleteCat/{id}")
	public String deleteCat(@PathVariable("id") int id) {
		homeDAO.deleteCatDAO(id);
		return "Employee(" + id + ") Record Deleted Successfully!";
	}
	
}
