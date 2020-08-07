package com.capg.trainee.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.capg.trainee.bean.Trainee;
import com.capg.trainee.service.ITraineeService;

@Controller
@RequestMapping("/trainee")
public class TraineeController {

	@Autowired
	ITraineeService service;
	
	@GetMapping("/login")
	public String adminLogin()
	{
		return"login";
	}
	
	
	
	 @GetMapping("/manage") 
	 public String adminManage() 
	 {
		 return "manage"; 
		 } 
	
	 @GetMapping("/add") public String add() { return "add"; }
	 @GetMapping("/delete") public String delete() { return "delete"; }
	 @GetMapping("/modify") public String modify() { return "modify"; }
	 @GetMapping("/retrive") public String retrive() { return "retrive"; }
	 @GetMapping("/retriveall") public String retriveAll() { return "retriveall"; }
	
	 
	 @PostMapping("/addtrainee")
	 @ResponseBody
	public String addTrainee(@RequestParam("traineeId") int traineeId, @RequestParam("traineeName") String traineeName, 
			@RequestParam("traineeLocation") String traineeLocation,@RequestParam("traineeDomain") String traineeDomain)
	{
		 Trainee trainee=new Trainee();
		 trainee.setTraineeId(traineeId);
		 trainee.setTraineeName(traineeName);
		 trainee.setTraineeLocation(traineeLocation);
		 trainee.setTraineeDomain(traineeDomain);
		 
		 service.addTrainee(trainee);
		 
		return "Trainee Added";
	}
	 
	 @PostMapping("/deletetrainee")
	 @ResponseBody
	public String deleteTrainee(@RequestParam("traineeId") int traineeId)
	{
		 service.deleteTrainee(traineeId);
		return "Trainee Deleted";
	}
	 
	 @PutMapping("/modifytrainee")
	 @ResponseBody
	public String modifyTrainee()
	{
		return "trainee updated";
	}
	 
	 @GetMapping("/retrivetrainee")
	 @ResponseBody
	public String retriveTrainee()
	{
		return "trainee retrived";
	}
	 
	 @GetMapping("/retriveallTrainee")
	 @ResponseBody
	public String retriveAllTrainee()
	{
		return "all trainee's retrived ";
	}
}
