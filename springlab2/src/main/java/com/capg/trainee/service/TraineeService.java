package com.capg.trainee.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.trainee.bean.Trainee;
import com.capg.trainee.dao.ITraineeRepo;
@Service
public class TraineeService implements ITraineeService {

	@Autowired
	ITraineeRepo repo;
	
	@Override
	public Trainee addTrainee(Trainee trainee) {
		// TODO Auto-generated method stub
		return repo.save(trainee);
	}

	@Override
	public Trainee updateTrainee(Trainee trainee) {
		// TODO Auto-generated method stub
		return repo.save(trainee);
	}

	@Override
	public void deleteTrainee(int traineeId) {
		// TODO Auto-generated method stub
		repo.deleteById(traineeId);

	}

	@Override
	public Optional<Trainee> retriveTrainee(int traineeId) {
		// TODO Auto-generated method stub
		
		return repo.findById(traineeId);
	}

}
