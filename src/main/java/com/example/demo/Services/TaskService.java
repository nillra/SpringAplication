package com.example.demo.Services;

import java.util.List;

import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.TaskRepo;

import Mode.Tasks;

@Service
public class TaskService {

	@Autowired
	TaskRepo taskrep;
	
	public Tasks addnewtask(String taskwork, Date lastdate, String report, String status) {
		
		Tasks task=new Tasks();
		task.setTaskwork(taskwork);
		task.setLastdate(lastdate);
		task.setReport(report);
		task.setStatus(status);
		
		taskrep.save(task);
		return null;
	}
	public List<Tasks> getalltasks() {
		// TODO Auto-generated method stub
		return taskrep.findAll();
	}
	public String updatetask(Tasks updatetask) {
		if(taskrep.existsById(updatetask.getId())) {
			
			taskrep.save(updatetask);
			return "Update the details";
		}
		return "dont update";
	}
	public String deletetaskid(String id) {
		if(taskrep.existsById(id)) {
			taskrep.deleteById(id);
			return "Delete the task succesfully";
		}
		return "Something went wrong";
	}

}
