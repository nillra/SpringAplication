package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.mongodb.core.messaging.Task;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Services.TaskService;

import Mode.Tasks;


@CrossOrigin(origins="*")
@RestController
public class TaskController {
	
	@Autowired
	TaskService taskser;
	
	@PostMapping("/work")
	public Tasks add(@RequestBody Tasks newTask) {
		return taskser.addnewtask(newTask.getTaskwork(),newTask.getLastdate(),newTask.getReport(),
				                  newTask.getStatus());
		
	}
	
	@GetMapping("/getall")
	public List<Tasks> getalltask(){
		return taskser.getalltasks();
	}
	
	@PutMapping("/update")
	public String updatetask(@RequestBody Tasks updatetask) {
		return taskser.updatetask(updatetask);
	}

	
	@DeleteMapping("/delete/{id}")
	public String deletetask(@PathVariable String id) {
		return taskser.deletetaskid(id);
	}
}
