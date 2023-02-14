package com.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.model.Dashboard;
import com.model.Users;
@Repository
public interface DashboardRepository extends JpaRepository <Dashboard, Integer>{
	@Query("from Dashboard p where p.prodName = :prodName")
	Dashboard findByName(@Param("prodName") String prodName);
	
	@Query("from Dashboard e where e.emailID=:emailID")
	List<Dashboard> getTripByEmailId(@Param("emailID") String emailID);
	
	@Modifying
	@Transactional
	@Query("delete from Dashboard e where e.emailID=:emailID and e.prodName=:prodName")
	void deleteTripRepo(@Param("emailID") String emailID, @Param("prodName") String prodName);

}

