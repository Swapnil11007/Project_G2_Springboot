package com.ts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.AdventureDAO;
import com.model.Adventure;



@RestController
public class AdventureController {
	@Autowired	//Dependency Injection
	AdventureDAO adventureDAO;

	@RequestMapping("/showAllAdventure")
	public List<Adventure> showAllAdventure() {
		List<Adventure> prodList = adventureDAO.getAllAdventure();
		return prodList;
	}
}
