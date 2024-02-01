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

import com.management.entity.Trainer;
import com.management.entity.User;
import com.management.exception.ResourceNotFoundException;
import com.management.service.TrainerService;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@RestController
@RequestMapping("/user")
public class UserController 
{
	public static Logger log=LoggerFactory.getLogger(User.class.getSimpleName());
	@Autowired
	private TrainerService trainerService;
	
	@PostMapping(path="/add")
	public ResponseEntity<Trainer>save(@RequestBody Trainer trainer){
		log.info("Saving trainer {}", trainer);
		trainerService.save(trainer);
		ResponseEntity<Trainer> responseEntity = new ResponseEntity<>(trainer,
				HttpStatus.CREATED);
		return responseEntity;
	}
	
	@GetMapping(path = "/getById/{id}")
	public ResponseEntity<Trainer> getTrainer(@PathVariable Long id) throws Exception{
		log.info("Fetching trainer  {}", id);
        try {
        	 Trainer trainer = trainerService.get(id);
        	 System.out.println("Getting trainer details  successfully");
        	 ResponseEntity<Trainer> responseEntity = new ResponseEntity<>(trainer,
     				HttpStatus.OK);
        	 return responseEntity;
        }catch (ResourceNotFoundException e) {
        	System.out.println(e.getMessage());
		}
		
             return null;	
	}
	
	@GetMapping(path="/getAll")
	public ResponseEntity <List<Trainer>> getAll()
	{
		log.info("getting all patients");
		List<Trainer> trainer=trainerService.getAll();
		ResponseEntity <List<Trainer>> responseEntity=new ResponseEntity<>(trainer,HttpStatus.OK);
		return responseEntity;
	}
	
	
	@DeleteMapping(path = "/deleteById/{id}")
	public String deleteById(@PathVariable Long id) {
		log.info("deleting patient {}", id);

		trainerService.deleteById(id);
		return "deleted successfully";
	}
	
	@PutMapping(path="/updateById/{id}")
	public Trainer update(@RequestBody Trainer trainer) {
		Trainer update = trainerService.update(trainer);
		System.out.println("updated successfully");
		return update;
	}

}
