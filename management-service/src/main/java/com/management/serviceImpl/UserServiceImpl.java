package com.management.serviceImpl;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.management.entity.Trainer;
import com.management.entity.User;
import com.management.exception.ResourceNotFoundException;
import com.management.repository.UserRepository;
import com.management.service.UserService;

import jakarta.persistence.Id;
import lombok.extern.slf4j.Slf4j;
@Service
@Slf4j
public class UserServiceImpl  implements UserService{

	@Autowired
	private UserRepository userRepository;
	@Override
	public void save(User user) {
		userRepository.save(user);
	}

	@Override
	public User get(Long id) {
		 Optional<User> optional = userRepository.findById(id);	
		  if(optional.isEmpty()) {
			  try {
				  optional.orElseThrow(()->new ResourceNotFoundException("No user found to fetch for id:"+id));
			  }catch (ResourceNotFoundException e) {
				throw e;
			}
		  }
		  System.out.println("fetching successfully");
		  return optional.get();
		  
	}

	@Override
	public List<User> getAll() {
		return userRepository.findAll();
	}

	@Override
	public User deleteById(Long id) {
		
		  Optional<User> optional = userRepository.findById(id);	
		  if(optional.isEmpty()) {
			  try {
				  optional.orElseThrow(()->new ResourceNotFoundException("No user found to delete for id:"+id));
			  }catch (ResourceNotFoundException e) {
				throw e;
			}
		  }
		  userRepository.deleteById(id);
		  System.out.println("fetching successfully");
		  return optional.get();
	}

	@Override
	public User update(User user) {
		Optional<User> optional = userRepository.findById(user.getId());
		if(optional.isEmpty()) {
		try {
			optional.orElseThrow(()-> new ResourceNotFoundException("No user found to update :"+user.getId()
			));
		}catch (ResourceNotFoundException e) {
			throw e;
		}
	}
		userRepository.save(user);
		System.out.println("updated successfully");
		return user;


	}
	
	



}
