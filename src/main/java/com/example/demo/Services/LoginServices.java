package com.example.demo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.Repository.LoginUserRepository;

import Mode.LoginUser;

@Component
public class LoginServices {

	
	@Autowired
	LoginUserRepository loginUserRepo;
	

	
	public String checkvailuser(String username, String password) {
	    LoginUser user = loginUserRepo.findByUsername(username); // correct method now

	    if (user != null) {
	        // ✅ getPassword() is called on the user object
	        if (user.getPassword().equals(password)) {
	            return "Login Successful!";
	        } else {
	            return "Incorrect password!";
	        }
	    } else {
	        return "User does not exist!";
	    }
	}

	public String reg(String username, String password, String email) {
		
		LoginUser user = loginUserRepo.findByUsername(username);
		
		if(user!=null) {
			return " User name already exsit could u please change it";
		}
		
		LoginUser Email=loginUserRepo.findByEmail(email);
		if (Email!=null) {
			return "Email is already exist..!  Please try other email.. ";
		}
		
		
			LoginUser loguser=new LoginUser();
			loguser.setUsername(username);
			loguser.setEmail(email);
			loguser.setPassword(password);
			
			loginUserRepo.save(loguser);
			
			return "Now u can login....";
		
	}

}
