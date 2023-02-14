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

import com.dao.CheckoutDAO;
import com.model.Checkout;
import com.model.Dashboard;

@RestController
public class CheckoutController {
	@Autowired
	CheckoutDAO checkoutDAO;
	
	@RequestMapping("/showCheckout")
	public List<Checkout> showDashboard() {
		List<Checkout> prodList = checkoutDAO.getDashboard();
		return prodList;
	}
	@GetMapping("/getCheckOutByEmailId/{emailID}")
	public List<Checkout> getCheckOutByEmailId(@PathVariable("emailID") String emailID) {
		return checkoutDAO.getCheckOutByEmailId(emailID);
	}
	@PostMapping("/registerCheckout")
	public String registerDashboard(@RequestBody Checkout dashboard){
		checkoutDAO.register(dashboard);
		 return "success"; 
	}
	@DeleteMapping("/deleteCheckOut/{emailID}/{prodName}")
	public String deleteCheckOut(@PathVariable("emailID") String emailID, @PathVariable("prodName") String prodName){
		checkoutDAO.deleteCheckOutDAO(emailID,prodName);
		
		return "success";
	}
}
