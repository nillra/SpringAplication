package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.Repository.UserRepository;

import Mode.User;

@Component
public class DetailsService {
	
	@Autowired
	UserRepository userRepository;
	
	public List<User> dis(){
		return userRepository.findAll();
//		System.out.println(userRepository.findAll());
	}

	public String added(String stdname, int stdid, String branch) {
		// TODO Auto-generated method stub
		User user = new User();
		user.setId(stdid);
		user.setName(stdname);
		user.setEmail(branch);
		
		userRepository.save(user);
        return "Succesfully added student";
	}

	 public String delete(int id) {
	        if (userRepository.existsById(id)) {
	            userRepository.deleteById(id);
	            return "Student with ID " + id + " deleted successfully.";
	        } else {
	            return "Student with ID " + id + " not found.";
	        }
	    }

	 public String updatedetails(int id, String newname, int newid, String newbranch) {
	        if (userRepository.existsById(id)) {
	            User user = new User();
	            user.setId(newid); // or keep original id if you don't want to change
	            user.setName(newname);
	            user.setEmail(newbranch);
	            userRepository.save(user);
	            return "Student with ID " + id + " updated successfully.";
	        } else {
	            return "Student with ID " + id + " not found.";
	        }
	    }
}
