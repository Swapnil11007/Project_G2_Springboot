package com.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.model.Checkout;

@Repository
public interface CheckoutRepository extends JpaRepository <Checkout, Integer>{
	@Query("from Checkout p where p.prodName = :prodName")
	Checkout findByName(@Param("prodName") String prodName);
	
	@Query("from Checkout e where e.emailID=:emailID")
	List<Checkout> getCheckOutByEmailId(@Param("emailID") String emailID);

	@Modifying
	@Transactional
	@Query("delete from Checkout e where e.emailID=:emailID and e.prodName=:prodName")
	void deleteCheckOutRepo(@Param("emailID") String emailID, @Param("prodName") String prodName);
}
