package com.example.demo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import Mode.LoginUser;
//import Mode.User;

@Repository
public interface LoginUserRepository  extends MongoRepository<LoginUser, String> {

	
	LoginUser findByUsername(String username);

	LoginUser findByEmail(String email);
//	LoginUser findBy
}
