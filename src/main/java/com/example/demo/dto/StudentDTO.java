package com.example.demo.dto;

import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentDTO {
	
	String name;
	String pass;
	int rollno;
	
	@RequestMapping("/s")
	public String greet() {
		return "Welcome to new world";
	}

}
