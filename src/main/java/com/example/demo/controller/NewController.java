package com.example.demo.controller;


import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repository.UserRepository;
import com.example.demo.Services.DetailsService;

import Mode.User;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/task")
@Component
public class NewController {
	
	@Autowired
	DetailsService ds;
	

	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/get")
	public List<User> display(){
    	return ds.dis();
    }

	@DeleteMapping("/{id}")
    public String  delete(@PathVariable("id") int id) {
		
		return ds.delete(id);
    	
    }

	
	@PostMapping("/add")
    public String addStudent(
            @RequestParam String stdname,
            @RequestParam int stdid,
            @RequestParam String branch) {
		User user = new User();
		user.setId(stdid);
		user.setName(stdname);
		user.setEmail(branch);
		
		userRepository.save(user);

		return ds.added(stdname,stdid,branch);
        
    }
	
	@PutMapping("/{id}")
	public String update(@PathVariable("id") int id,
			             @RequestParam String stdname,
			             @RequestParam int stdid,
			             @RequestParam String branch) {
		return ds.updatedetails(id,stdname,stdid,branch);
	}

}
