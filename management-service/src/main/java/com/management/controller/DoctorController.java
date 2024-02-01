package com.management.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.management.entity.Doctor;
import com.management.entity.Trainer;
import com.management.service.DoctorService;
import com.management.service.TrainerService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/doctor_profile")
public class DoctorController {
	public static Logger log = LoggerFactory.getLogger(Doctor.class.getSimpleName());
	@Autowired
	private DoctorService doctorService;

	@PostMapping(path = "/add")
	public ResponseEntity<Doctor> save(@RequestBody Doctor doctor) {
		log.info("Saving doctor {}", doctor);
		doctorService.save(doctor);
		ResponseEntity<Doctor> responseEntity = new ResponseEntity<>(doctor, HttpStatus.CREATED);
		return responseEntity;
	}

	@GetMapping(path = "/getById/{id}")
	public ResponseEntity<Doctor> get(@PathVariable Long id) {
		log.info("Fetching doctor  {}", id);

		Doctor doctor = doctorService.get(id);

		ResponseEntity<Doctor> responseEntity = new ResponseEntity<>(doctor, HttpStatus.OK);
		return responseEntity;
	}

	@GetMapping(path = "/getAll")
	public ResponseEntity<List<Doctor>> getAll() {
		log.info("getting all doctors");
		List<Doctor> doctor = doctorService.getAll();
		ResponseEntity<List<Doctor>> responseEntity = new ResponseEntity<>(doctor, HttpStatus.OK);
		return responseEntity;
	}

	@DeleteMapping(path = "/deleteById/{id}")
	public String deleteById(@PathVariable Long id) {
		log.info("deleting doctor {}", id);

		doctorService.deleteById(id);
		return "deleted successfully";
	}

	@PutMapping(path = "/updateById/{id}")
	public Doctor update(@RequestBody Doctor doctor) {
		Doctor update = doctorService.update(doctor);
		System.out.println("updated successfully");
		return update;

	}

}
