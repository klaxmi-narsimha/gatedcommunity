package com.kln.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.kln.dao.ResidentDAO;
import com.kln.model.ResidentEntity;

@Component
public class ResidentService {
	
	@Autowired
	ResidentDAO resDAO;
	
	public ResidentEntity signup(ResidentEntity res) {
		
		resDAO.save(res);
		
		return res;
	}
	
	public ResidentEntity findById(int id) {
		
		Optional<ResidentEntity> resident= resDAO.findById(id);
		
		ResidentEntity residentEntity = resident.get();
		
		return residentEntity;
		
	}

}
