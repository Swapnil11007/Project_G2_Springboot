package com.ts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.PlaceHolderDAO;
import com.model.Dashboard;
import com.model.PlaceHolder;

@RestController
public class PlaceHolderController {

	@Autowired
	PlaceHolderDAO placeholderDAO;
	
	@PostMapping("/registerPlaceHolder")
	public String registerPlaceHolder(@RequestBody PlaceHolder placeHolder){
		placeholderDAO.registerInDAO(placeHolder);
		return "success"; 
	}
	
	@RequestMapping("/showPlaceHolder")
	public List<PlaceHolder> showPlaceHolder() {
		List<PlaceHolder> prodList = placeholderDAO.getPlaceHolderDAO();
		return prodList;
	}
	
	@DeleteMapping("/deletePlaceHolder/{emailID}/{prodName}")
	public String deleteTrip(@PathVariable("emailID") String emailID, @PathVariable("prodName") String prodName){
		placeholderDAO.deleteTripDAO(emailID,prodName);
		
		return "success";
	}
	@GetMapping("/getTicketByEmailId/{emailID}")
	public List<PlaceHolder> getTicketByEmailId(@PathVariable("emailID") String emailID) {
		return placeholderDAO.getTicketByEmailId(emailID);
	}
}
