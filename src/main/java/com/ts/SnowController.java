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

import com.dao.SafariDAO;
import com.dao.SnowDAO;
import com.model.Beach;
import com.model.Safari;
import com.model.Snow;

@RestController
public class SnowController {
	
	@Autowired	//Dependency Injection
	SnowDAO snowDAO;

	@RequestMapping("/showAllSnowsites")
	public List<Snow> showAllSnowsites() {
		List<Snow> prodList = snowDAO.getAllSnowsites();
		return prodList;
	}
	@PostMapping("/registerSnowsites")
	public String registerBeach(@RequestBody Snow snow){
		
		Snow b = snowDAO.register(snow);

		if ( b.getProdId()!=-1 && b != null)
			return "Registration success";

		return "Registration Failed!!!";
	}
	
	@PutMapping("/updateSnowsites")
	public String updateBeach(@RequestBody Snow snow){

		Snow b = snowDAO.updateProduct(snow);

		if (b.getProdId()!=-1 && b != null)
			return "Updated success";

		return "Updation Failed!!!";
	}

	@DeleteMapping("/deleteSnowsites/{prodId}")
	public String deleteBeach(@PathVariable("prodId") int prodId) {
		snowDAO.deleteProduct(prodId);
		return "Product(" + prodId + ") Record Deleted Successfully!";
	}
}

