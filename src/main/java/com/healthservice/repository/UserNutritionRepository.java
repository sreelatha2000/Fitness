package com.healthservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.healthservice.entity.Nutrition;

public interface UserNutritionRepository extends JpaRepository<Nutrition, Integer> {

}
