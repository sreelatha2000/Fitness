package com.traineeservice.controller;

import java.util.List;

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

import com.traineeservice.entity.Achievement;
import com.traineeservice.exception.NoSuchRecordFoundException;
import com.traineeservice.service.AchievementService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(path = "achievement")
public class AchievementController {
	@Autowired
	private AchievementService achievementService;

	@PostMapping("/save")
	public ResponseEntity<Achievement> save(@RequestBody Achievement achievement) {
		log.info("Saving achievement1", achievement);
		log.info("Saving achievement2", achievement);

		achievementService.save(achievement);

		ResponseEntity<Achievement> responseEntity = new ResponseEntity<>(achievement, HttpStatus.CREATED);

		return responseEntity;
	}

	@GetMapping(path = "/getById/{id}")
	public ResponseEntity<Achievement> get(@PathVariable Long id) {
		log.info("Fetching achievement by id {}", id);
		
			Achievement achievement = achievementService.get(id);

			ResponseEntity<Achievement> responseEntity = new ResponseEntity<>(achievement, HttpStatus.OK);

			return responseEntity;
		
		
	}

	@GetMapping(path = "/getAll")
	public ResponseEntity<List<Achievement>> getAll() {
		log.info("getting all achievement");
		List<Achievement> achievement = achievementService.getAll();
		ResponseEntity<List<Achievement>> responseEntity = new ResponseEntity<>(achievement, HttpStatus.OK);
		return responseEntity;
	}

	@DeleteMapping(path = "/deleteById/{id}")
	public String deleteById(@PathVariable Long id) {
		
		log.info("deleting achievement{}", id);
		achievementService.deleteById(id);
		return "deleted";

	}

	@DeleteMapping(path = "/deleteAll")
	public void deleteAll() {

		achievementService.deleteAll();

	}

	@PutMapping(path = "/updateById/{id}")
	public ResponseEntity<Achievement> update(@RequestBody Achievement achievement) {
		
			Achievement achievementUpdate = achievementService.update(achievement);

			ResponseEntity<Achievement> responseEntity = new ResponseEntity<>(achievementUpdate, HttpStatus.OK);
			return responseEntity;

	}

}
