package com.management.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.management.entity.Trainer;
import com.management.entity.User;

import jakarta.persistence.Id;

public interface UserService  {
	void save(User user);
	User get(Long id);
	//void delete(Long id);
	List<User> getAll();
	User deleteById(Long id);
	User update(User user);

}
