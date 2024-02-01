package com.management.service;

import java.util.List;

import com.management.entity.Doctor;
import com.management.entity.Trainer;

public interface DoctorService {
	
	void save(Doctor doctor);
	Doctor get(Long id);
	//void delete(Long id);
	List<Doctor> getAll();
	Doctor deleteById(Long id);
	Doctor update(Doctor doctor);

}
