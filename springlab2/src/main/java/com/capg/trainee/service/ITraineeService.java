package com.capg.trainee.service;

import java.util.Optional;

import com.capg.trainee.bean.Trainee;



public interface ITraineeService {

	public Trainee addTrainee(Trainee trainee);
	public Trainee updateTrainee(Trainee trainee);
	public void deleteTrainee(int traineeId);
	
	public Optional<Trainee> retriveTrainee(int traineeId);
	
}
