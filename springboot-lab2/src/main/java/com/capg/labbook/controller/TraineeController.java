package com.capg.labbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.capg.labbook.model.Trainee;
import com.capg.labbook.service.TraineeService;
import com.fasterxml.jackson.annotation.JsonCreator.Mode;


@Controller
public class TraineeController {

	@Autowired
	TraineeService service;
	
	@GetMapping
	public String loginPage()
	{
		return "login";
	}
	
	@PostMapping("/home")
	public String homePage(@RequestParam("uname") String name, @RequestParam("password") String password, Model m)
	{
	boolean flag=service.loginValidation(name, password);
	if(flag==true)
	{
		return "manage";
	}
	else {
		m.addAttribute("login","invalid Login");
		return "login";
	}
		
	}
	
	@PostMapping("/add")
	public String addTrainee(@ModelAttribute Trainee t1,Model m)
	{
		service.addTrainee(t1);
		m.addAttribute("traineeid", t1.getTraineeId());
		m.addAttribute("operation", "added successfullly");
		
		return "view";
	}
	
	@GetMapping("/deletetrainee")
	public String deleteTrainee(@RequestParam("traineeId") int id,Model m)
	{
		service.deleteTrainee(id);
		m.addAttribute("traineeid",id);
		m.addAttribute("operation", "deleted successfullly");

		return "view";
	}
	
	@PostMapping("/find")
	public String findTrainee(@RequestParam("traineeId") int id, Model m)
	{
		Trainee tr =service.find(id);
		if(tr!=null)
		{
		m.addAttribute("trainee",tr);
         m.addAttribute("traineeId", id);
		return "delete-trainee";
		}
		else
		{
			m.addAttribute("traineeid", id);
			m.addAttribute("operation", " Not Found");
return "view";
		}
	}
	
	@PostMapping("/modifytrainee")
	public String modifyTrainee(@RequestParam("traineeId") int id, Model m)
	{
		m.addAttribute("trainee", service.find(id));
		return "update-trainee";
	}
	
	@PostMapping("/updatetrainee")
	public String updateTrainee(@ModelAttribute Trainee t, Model m)
	{
		Trainee tr =service.updateTrainee(t);
		if(tr!=null)
		{
		m.addAttribute("traineeid", tr.getTraineeId());
		m.addAttribute("operation", "updated successfullly");
		
		return "view";	
		}
		else
		{
			m.addAttribute("traineeid", t.getTraineeId());
			m.addAttribute("operation", " Not Found");
return "view";
		}
	}
	
	@PostMapping("/retrivetrainee")
	public String getTrainee(@RequestParam("traineeId") int id,Model m)
	{
		Trainee tr =service.find(id);
		if(tr!=null)
		{
		m.addAttribute("trainee",tr);
         m.addAttribute("traineeId", id);
		return "retrive";
		}
		else
		{
			m.addAttribute("traineeid", id);
			m.addAttribute("operation", " Not Found");
return "view";
		}
	}
	
	@GetMapping("/retriveAll")
	public String getAllTrainees(Model m)
	{
		List <Trainee> traineeList=service.findAllTrainees();
		if(traineeList.isEmpty())
		{
			m.addAttribute("operation", " No Trainees Found");
			return "view";
		}
		else
		{
		m.addAttribute("traineelist", traineeList);
		return "retriveAll";		
		}
	}
}
