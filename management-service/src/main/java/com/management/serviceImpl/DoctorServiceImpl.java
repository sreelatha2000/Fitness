package com.management.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.entity.Doctor;
import com.management.entity.Guest;
import com.management.entity.Membership;
import com.management.entity.Trainer;
import com.management.entity.User;
import com.management.exception.ResourceNotFoundException;
import com.management.repository.DoctorRepository;
import com.management.repository.TrainerRepository;
import com.management.service.DoctorService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class DoctorServiceImpl implements DoctorService {

	@Autowired
	private DoctorRepository doctorRepository;

	@Override
	public void save(Doctor doctor) {
		doctorRepository.save(doctor);
	}

	@Override
	public Doctor get(Long id) {
		Optional<Doctor> optional = doctorRepository.findById(id);
		if (optional.isEmpty()) {
			try {
				optional.orElseThrow(() -> new ResourceNotFoundException("No doctor found to delete for id:" + id));
			} catch (ResourceNotFoundException e) {
				throw e;
			}
		}
		doctorRepository.deleteById(id);
		System.out.println("fetching successfully");
		return optional.get();
	}

	@Override
	public List<Doctor> getAll() {
		return doctorRepository.findAll();
	}

	public Doctor deleteById(Long id) {
		Optional<Doctor> optional = doctorRepository.findById(id);
		if (optional.isEmpty()) {
			try {
				optional.orElseThrow(() -> new ResourceNotFoundException("No doctor found to delete for id:" + id));
			} catch (ResourceNotFoundException e) {
				throw e;
			}
		}
		doctorRepository.deleteById(id);
		System.out.println("fetching successfully");
		return optional.get();
	}

	public Doctor update(Doctor doctor) {
		Optional<Doctor> optional = doctorRepository.findById(doctor.getDoctorId());
		if (optional.isEmpty()) {
			try {
				optional.orElseThrow(
						() -> new ResourceNotFoundException("No guest found to update :" + doctor.getDoctorId()));
			} catch (ResourceNotFoundException e) {
				throw e;
			}
		}
		doctorRepository.save(doctor);
		System.out.println("updated successfully");
		return doctor;
	}

}
