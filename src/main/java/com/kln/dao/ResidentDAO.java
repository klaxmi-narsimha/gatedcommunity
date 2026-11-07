package com.kln.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.kln.model.ResidentEntity;


public interface ResidentDAO extends JpaRepository<ResidentEntity, Integer> {
	
//	@Query("From ResidentEntity Where id=:id")
//	public ResidentEntity findById(int id);
//		
	

}
