package com.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.management.entity.Trainer;


public interface TrainerRepository extends JpaRepository<Trainer, Long> {

}
