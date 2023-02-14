package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.model.Waterfall;

public interface WaterfallRepository extends JpaRepository <Waterfall, Integer>{
		@Query("from Waterfall p where p.waterfallName = :waterfallName")
		Waterfall findByName(@Param("waterfallName") String waterfallName);
	
}
