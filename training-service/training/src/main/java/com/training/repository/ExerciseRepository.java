package com.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.entity.Exercise;

public interface ExerciseRepository extends JpaRepository<Exercise, Long> {

}
