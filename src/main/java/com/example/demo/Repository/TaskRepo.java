package com.example.demo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import Mode.Tasks;

@Repository
public interface TaskRepo extends MongoRepository<Tasks,String>{

}
