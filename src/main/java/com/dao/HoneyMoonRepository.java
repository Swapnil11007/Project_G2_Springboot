package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.model.HoneyMoon;


@Repository
public interface HoneyMoonRepository extends JpaRepository <HoneyMoon, Integer>{

	@Query("from HoneyMoon p where p.DestinationName = :DestinationName")
	HoneyMoon findByName(@Param("DestinationName") String DestinationName);
	
}
