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

import com.dao.PiligrimageDAO;
import com.model.Beach;
import com.model.Piligrimage;


@RestController
public class PiligrimageController {
	@Autowired	//Dependency Injection
	PiligrimageDAO piligrimageDAO;

	@RequestMapping("/showAllPiligrimages")
	public List<Piligrimage> showAllPiligrimage() {
		List<Piligrimage> prodList = piligrimageDAO.getAllPiligrimage();
		return prodList;
	}
	
	@PostMapping("/registerPiligrimages")
	public String registerBeach(@RequestBody Piligrimage piligrimage){
		
		Piligrimage p = piligrimageDAO.register(piligrimage);

		if ( p.getProdId()!=-1 && p != null)
			return "Registration success";

		return "Registration Failed!!!";
	}
	
	@PutMapping("/updatePiligrimages")
	public String updateBeach(@RequestBody Piligrimage piligrimage){

		Piligrimage p = piligrimageDAO.updateProduct(piligrimage);

		if (p.getProdId()!=-1 && p != null)
			return "Updated success";

		return "Updation Failed!!!";
	}

	@DeleteMapping("/deletePiligrimages/{prodId}")
	public String deleteBeach(@PathVariable("prodId") int prodId) {
		piligrimageDAO.deleteProduct(prodId);
		return "Product(" + prodId + ") Record Deleted Successfully!";
	}
}
