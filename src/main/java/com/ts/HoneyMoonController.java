package com.ts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.HoneyMoonDAO;
import com.model.HoneyMoon;

@RestController
public class HoneyMoonController {

	@Autowired	//Dependency Injection
	HoneyMoonDAO honeymoondao;

	@GetMapping("/showAllHoneyMoon")
	public List<HoneyMoon> showAllHoneyMoon() {
		List<HoneyMoon> prodList = honeymoondao.getAllHoneyMoon();
		return prodList;
	}
	
}
