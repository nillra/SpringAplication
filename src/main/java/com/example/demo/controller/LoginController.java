package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Services.LoginServices;
//import org.springframework.web.bind.annotation.RequestParam;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/welcome")
public class LoginController {

	@Autowired
	LoginServices loginser;
	
	@PostMapping("/login")
	public String logining(@RequestParam String username,
			               @RequestParam String password) {
		return loginser.checkvailuser(username,password);
		
	}
	
	@PostMapping("/register")
	public String register(@RequestParam String username,
			               @RequestParam String password,
			               @RequestParam String reenterpass,
			               @RequestParam String email) {
	
		if (password.equals(reenterpass)) {
			return loginser.reg(username,password,email);
		}
		else {
			System.out.println(username+" "+password+" "+reenterpass+" "+email);
			return "Invaild ReEnter password";
		}
	
		
	
	}

	
	
	
}
