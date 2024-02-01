package com.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.management.entity.Doctor;
import com.management.entity.Trainer;

public interface DoctorRepository  extends JpaRepository<Doctor, Long> {

}
