package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.model.Waterfall;



@Service
public class WaterfallDAO {
	
	@Autowired
	WaterfallRepository waterfallRepository;
	
	public List<Waterfall> getAllWaterfall() {
		List<Waterfall> prodList = waterfallRepository.findAll();
		return prodList;
	}

	public Waterfall getProduct(int prodId) {
		return waterfallRepository.findById(prodId).orElse(null);
	}

	public Waterfall getProdByName(String prodName) {
		return waterfallRepository.findByName(prodName);
	}

	public Waterfall register(Waterfall product) {
		return waterfallRepository.save(product);
	}

	public Waterfall updateProduct(Waterfall product) {
		return waterfallRepository.save(product);
	}

	public String deleteProduct(int prodId) {
		System.out.println("Delete Product: " + prodId);
		waterfallRepository.deleteById(prodId);
		return "Product Deleted!!!";
	}
	
}
