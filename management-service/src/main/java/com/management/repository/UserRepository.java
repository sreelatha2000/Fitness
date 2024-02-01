package com.management.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.management.entity.User;

import jakarta.persistence.Id;

public interface UserRepository extends JpaRepository<User, Long>{

	

}
