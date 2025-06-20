package com.example.demo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import Mode.User;


@Repository
public interface UserRepository extends MongoRepository<User, Integer> {
    
}