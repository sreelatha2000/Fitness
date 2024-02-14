package com.management.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.management.entity.User;

import jakarta.persistence.Id;

@EnableJpaRepositories
public interface UserRepository extends JpaRepository<User, Long>{

	User findByName(String name);

	

	

	

}
