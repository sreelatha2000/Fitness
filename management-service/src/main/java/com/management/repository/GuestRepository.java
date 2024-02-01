package com.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.management.entity.Guest;

public interface GuestRepository extends JpaRepository<Guest, Long>{

}
