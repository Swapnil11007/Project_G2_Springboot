package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.model.PlaceHolder;

@Service
public class PlaceHolderDAO {

	@Autowired
	PlaceHolderRepository placeholderrepository;
	
	public void registerInDAO(PlaceHolder placeHolder) {
		
		placeholderrepository.save(placeHolder);
	}

	public List<PlaceHolder> getPlaceHolderDAO() {
		List<PlaceHolder> prodList = placeholderrepository.findAll();
		return prodList;
	}

	public void deleteTripDAO(String emailID, String prodName) {
		
		placeholderrepository.deleteTripRepo(emailID,prodName);
		
	}

	public List<PlaceHolder> getTicketByEmailId(String emailID) {
		return placeholderrepository.getTripByEmailId(emailID);
	}

}
