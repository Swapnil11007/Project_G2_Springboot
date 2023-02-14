package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Dashboard;
import com.model.Users;


@Service
public class DashboardDAO {
	@Autowired
	DashboardRepository dashRepository;
	
	public List<Dashboard> getDashboard() {
		List<Dashboard> prodList = dashRepository.findAll();
		return prodList;
	}

	public Dashboard getProduct(int prodId) {
		return dashRepository.findById(prodId).orElse(null);
	}

	public Dashboard getProdByName(String prodName) {
		return dashRepository.findByName(prodName);
	}

	public void register(Dashboard product) {
		dashRepository.save(product);
	}

	public Dashboard updateProduct(Dashboard product) {
		return dashRepository.save(product);
	}

	public String deleteProduct(int prodId) {
		System.out.println("Delete Product: " + prodId);
		dashRepository.deleteById(prodId);
		return "Product Deleted!!!";
	}

	public List<Dashboard> getTripByEmailId(String emailID) {
		// TODO Auto-generated method stub
		return dashRepository.getTripByEmailId(emailID);
	}

	public void deleteTripDAO(String emailID, String prodName) {
		dashRepository.deleteTripRepo(emailID,prodName);
	}

}
