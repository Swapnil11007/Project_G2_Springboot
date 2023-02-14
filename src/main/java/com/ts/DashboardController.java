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

import com.dao.DashboardDAO;
import com.model.Dashboard;
import com.model.Users;


@RestController
public class DashboardController {
	@Autowired
	DashboardDAO dashDAO;
	
	@RequestMapping("/showDashboard")
	public List<Dashboard> showDashboard() {
		List<Dashboard> prodList = dashDAO.getDashboard();
		return prodList;
	}
	@GetMapping("/getTripByEmailId/{emailID}")
	public List<Dashboard> getTripByEmailId(@PathVariable("emailID") String emailID) {
		return dashDAO.getTripByEmailId(emailID);
	}
	
	@PostMapping("/registerDashboard")
	public String registerDashboard(@RequestBody Dashboard dashboard){
		 dashDAO.register(dashboard);
		 return "success"; 
	}
	
	@DeleteMapping("/deleteTrip/{emailID}/{prodName}")
	public String deleteTrip(@PathVariable("emailID") String emailID, @PathVariable("prodName") String prodName){
		dashDAO.deleteTripDAO(emailID,prodName);
		
		return "success";
	}
	
}
