package com.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.model.PlaceHolder;

public interface PlaceHolderRepository  extends JpaRepository <PlaceHolder, Integer>{

	@Modifying
	@Transactional
	@Query("delete from PlaceHolder e where e.emailID=:emailID and e.prodName=:prodName")
	void deleteTripRepo(@Param("emailID") String emailID, @Param("prodName") String prodName);

	@Query("from PlaceHolder e where e.emailID=:emailID")
	List<PlaceHolder> getTripByEmailId(String emailID);
}
