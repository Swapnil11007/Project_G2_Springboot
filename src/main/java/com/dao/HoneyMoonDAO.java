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
	
}
