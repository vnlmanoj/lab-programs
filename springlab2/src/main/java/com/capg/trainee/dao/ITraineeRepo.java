package com.capg.trainee.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.trainee.bean.Trainee;

@Repository
public interface ITraineeRepo extends JpaRepository<Trainee, Integer> {

}
