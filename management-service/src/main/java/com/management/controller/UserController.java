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

import com.management.entity.User;
import com.management.exception.ResourceNotFoundException;
import com.management.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {
	public static Logger log = LoggerFactory.getLogger(User.class.getSimpleName());
	@Autowired
	private UserService userService;

	@PostMapping(path = "/add")
	public ResponseEntity<User> save(@RequestBody User user) {
		log.info("Saving User {}", user);
		userService.save(user);
		ResponseEntity<User> responseEntity = new ResponseEntity<>(user, HttpStatus.CREATED);
		return responseEntity;
	}

	@GetMapping(path = "/getById/{id}")
	public ResponseEntity<User> getUser(@PathVariable Long id) throws Exception {
		log.info("Fetching User  {}", id);
		try {
			User user = userService.get(id);
			System.out.println("Getting User details  successfully");
			ResponseEntity<User> responseEntity = new ResponseEntity<>(user, HttpStatus.OK);
			return responseEntity;
		} catch (ResourceNotFoundException e) {
			System.out.println(e.getMessage());
		}

		return null;
	}

	@GetMapping(path = "/getAll")
	public ResponseEntity<List<User>> getAll() {
		log.info("getting all patients");
		List<User> user = userService.getAll();
		ResponseEntity<List<User>> responseEntity = new ResponseEntity<>(user, HttpStatus.OK);
		return responseEntity;
	}

	@DeleteMapping(path = "/deleteById/{id}")
	public String deleteById(@PathVariable Long id) {
		log.info("deleting patient {}", id);

		userService.deleteById(id);
		return "deleted successfully";
	}

	@PutMapping(path = "/updateById/{id}")
	public User update(@RequestBody User user) {
		User update = userService.update(user);
		System.out.println("updated successfully");
		return update;
	}

}
