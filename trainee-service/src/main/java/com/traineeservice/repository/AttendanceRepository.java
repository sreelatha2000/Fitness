package com.traineeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.traineeservice.entity.Attendance;

public interface AttendanceRepository extends JpaRepository<Attendance, Long> {

}
