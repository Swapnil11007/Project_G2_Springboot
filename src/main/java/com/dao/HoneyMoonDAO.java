package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.model.HoneyMoon;



@Service
public class HoneyMoonDAO {

	@Autowired
	HoneyMoonRepository honeymoonRepository;
	
	public List<HoneyMoon> getAllHoneyMoon() {
		List<HoneyMoon> prodList = honeymoonRepository.findAll();
		return prodList;
	}
	
	public HoneyMoon register(HoneyMoon product) {
		return honeymoonRepository.save(product);
	}

	public HoneyMoon updateProduct(HoneyMoon product) {
		return honeymoonRepository.save(product);
	}

	public String deleteProduct(int prodId) {
		System.out.println("Delete Product: " + prodId);
		honeymoonRepository.deleteById(prodId);
		return "Product Deleted!!!";
	}
}
