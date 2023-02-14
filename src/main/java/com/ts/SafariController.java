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
import com.model.Beach;
import com.model.Safari;


@RestController
public class SafariController {
	@Autowired	//Dependency Injection
	SafariDAO safariDAO;

	@RequestMapping("/showAllSafari")
	public List<Safari> showAllSafari() {
		List<Safari> prodList = safariDAO.getAllSafari();
		return prodList;
	}
	@PostMapping("/registerSafari")
	public String registerBeach(@RequestBody Safari beach){
		
		Safari b = safariDAO.register(beach);

		if ( b.getProdId()!=-1 && b != null)
			return "Registration success";

		return "Registration Failed!!!";
	}
	
	@PutMapping("/updateSafari")
	public String updateBeach(@RequestBody Safari beach){

		Safari b = safariDAO.updateProduct(beach);

		if (b.getProdId()!=-1 && b != null)
			return "Updated success";

		return "Updation Failed!!!";
	}

	@DeleteMapping("/deleteSafari/{prodId}")
	public String deleteBeach(@PathVariable("prodId") int prodId) {
		safariDAO.deleteProduct(prodId);
		return "Product(" + prodId + ") Record Deleted Successfully!";
	}
}
