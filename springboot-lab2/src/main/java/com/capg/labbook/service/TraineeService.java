package com.capg.labbook.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.labbook.dao.TraineeDao;
import com.capg.labbook.model.Trainee;


@Service
public class TraineeService {

	@Autowired
	TraineeDao dao;
	
	public Trainee addTrainee(Trainee t)
	{
		return dao.addTrainee(t);
	}
	
	public int deleteTrainee(int id)
	{
		return dao.deleteTrainee(id);
	}
	
	
	public boolean loginValidation(String uName,String password)
	{
		return dao.validateLogin(uName, password);
		
	}

	public Trainee find(int id) {
		return dao.findTrainee(id);
		
	}

	public Trainee updateTrainee(Trainee t) {

		return dao.updateTrainee(t);
	}
	
	public List<Trainee> findAllTrainees()
	{
		return dao.viewTrainees();
	}
}
