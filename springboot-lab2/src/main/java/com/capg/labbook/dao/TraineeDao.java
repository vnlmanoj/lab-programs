package com.capg.labbook.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.capg.labbook.model.Trainee;

@Repository
public class TraineeDao {

Map<Integer, Trainee> traineeList =new HashMap<Integer, Trainee>();
	Map<String, String> logins= new HashMap<>();
	public Trainee addTrainee(Trainee t)
	{
		traineeList.put(t.getTraineeId(), t);
		return t;
	}
	
	public int  deleteTrainee(int id)
	{ 
				traineeList.remove(id);
				return id;
	}
	
	public boolean validateLogin(String uName,String password)
	{
		
		boolean flag=false;
		if(logins.containsKey(uName) && logins.get(uName).equals(password))
		{
			flag=true;
			return flag;
		}
		else
		{
			return flag;

		}		
	}
	
//	public HashMap<String, String> loginId() {
//		HashMap<String, String> loginIds=new HashMap<String,String>();
//		loginIds.put("praveen","12345678");
//		loginIds.put("king","1234");
//		return loginIds;
//		}

	public Trainee findTrainee(int tid) {

		if(traineeList.containsKey(tid))
		{
			return traineeList.get(tid);
	
		}
		else
		{
			return null;
		}

	}
	
	public List< Trainee> viewTrainees()
	{
		//Set set=traineeList.keySet();
		return traineeList.values().stream().collect(Collectors.toList());
		

	}
	public TraineeDao() {

		logins.put("praveen","12345678");
		logins.put("king","1234");

	}

	public Trainee updateTrainee(Trainee t) {
	
		System.out.println(t);
		if(traineeList.containsKey(t.getTraineeId()))
		{
			traineeList.replace(t.getTraineeId(), t);
			System.out.println(traineeList.get(t.getTraineeId()));
			return t;
			
		}
		else
			return null;
		
	}
}
