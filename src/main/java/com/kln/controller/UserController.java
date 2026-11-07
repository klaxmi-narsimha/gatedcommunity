package com.kln.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kln.model.ResidentEntity;
import com.kln.service.ResidentService;

import lombok.RequiredArgsConstructor;

@Controller

public class UserController {
	
	@Autowired
	ResidentService residentServive;
	
	
	@GetMapping("/login")
	@ResponseBody
	public String login() {
		
		
		return "login";
	}
	
	@GetMapping("/signup")
	@ResponseBody
	public ResidentEntity signup() {
		
		ResidentEntity residentEntity = new ResidentEntity("rohith",3,403);
	
		return residentServive.signup(residentEntity);
	}

	@GetMapping("/findById")
	@ResponseBody
	public ResidentEntity findById() {
		
		return residentServive.findById(1);
	}
	
	
}
