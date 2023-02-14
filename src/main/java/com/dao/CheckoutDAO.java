package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Checkout;


@Service
public class CheckoutDAO {
	@Autowired
CheckoutRepository checkoutRepository;
	
	public List<Checkout> getDashboard() {
		List<Checkout> prodList = checkoutRepository.findAll();
		return prodList;
	}

	public Checkout getProduct(int prodId) {
		return checkoutRepository.findById(prodId).orElse(null);
	}

	public Checkout getProdByName(String prodName) {
		return checkoutRepository.findByName(prodName);
	}

	public void register(Checkout product) {
		checkoutRepository.save(product);
	}
	public List<Checkout> getCheckOutByEmailId(String emailID) {
		// TODO Auto-generated method stub
		return checkoutRepository.getCheckOutByEmailId(emailID);
	}

	public void deleteCheckOutDAO(String emailID, String prodName) {
		// TODO Auto-generated method stub
		checkoutRepository.deleteCheckOutRepo(emailID,prodName);
		
	}

}
