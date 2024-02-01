package com.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.entity.Equipment;

public interface EquipmentRepository extends JpaRepository<Equipment, Long> {

}
