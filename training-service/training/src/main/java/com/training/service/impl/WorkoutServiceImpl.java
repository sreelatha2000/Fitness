package com.training.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.entity.Workout;
import com.training.exception.ResourceNotFoundException;
import com.training.repository.WorkoutRepository;
import com.training.service.WorkoutService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class WorkoutServiceImpl implements WorkoutService {

	@Autowired
	private WorkoutRepository workoutRepository;
	
	@Override
	public void save(Workout workout) {
		workoutRepository.save(workout);
		System.out.println("Save success");
	}

	@Override
	public void update(Workout workout) {
		Optional<Workout> optional=workoutRepository.findById(workout.getWorkoutId());
		if(optional.isPresent()) {
			workoutRepository.save(workout);
			System.out.println("Update Success");
		}else {
			optional.orElseThrow(()->new ResourceNotFoundException("No Workout found to update for id : "+workout.getWorkoutId()));
		}
		
	}
	
	@Override
	public Workout getById(Long id) {
		Optional<Workout> optional=workoutRepository.findById(id);
		if(optional.isPresent()) {
			System.out.println("Fetch success");
			return optional.get();
		}else {
			optional.orElseThrow(()->new ResourceNotFoundException("No Workout found to fetch for id : "+id));
		}
		return null;
	}
	
	@Override
	public List<Workout> getAll() {
		 return workoutRepository.findAll();
	}
	
	@Override
	public Workout delete(Long id) {
		Optional<Workout> optional=workoutRepository.findById(id);
		if(optional.isPresent()) {
			workoutRepository.deleteById(id);
			System.out.println("Delete success");
			return optional.get();
		}else {
			optional.orElseThrow(()->new ResourceNotFoundException("No Workout found to delete for id : "+id));
		}
		return null;
	}

}
