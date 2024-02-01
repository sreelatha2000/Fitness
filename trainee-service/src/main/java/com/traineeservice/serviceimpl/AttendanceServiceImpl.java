package com.traineeservice.serviceimpl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.traineeservice.entity.Achievement;
import com.traineeservice.entity.Attendance;
import com.traineeservice.exception.NoSuchRecordFoundException;
import com.traineeservice.repository.AttendanceRepository;
import com.traineeservice.service.AttendanceService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class AttendanceServiceImpl implements AttendanceService {
	@Autowired

	private AttendanceRepository attendanceRepository;

	@Override
	public void save(Attendance attendance) {
		attendanceRepository.save(attendance);
		log.info("attendance details saved ", attendance);
	}

	@Override
	public Attendance get(Long id) {
		Optional<Attendance> optional = attendanceRepository.findById(id);
		if (optional.isEmpty()) {
			try {
				optional.orElseThrow(() -> new NoSuchRecordFoundException("Provide correct details "));
			} catch (NoSuchRecordFoundException e) {
				throw e;
			}
		}
		System.out.println("fetched successfully");
		return optional.get();

	}

	@Override
	public List<Attendance> getAll() {

		return attendanceRepository.findAll();

	}

	@Override
	public String deleteById(Long id) {
		Optional<Attendance> optional = attendanceRepository.findById(id);
		if (optional.isEmpty()) {
			try {
				optional.orElseThrow(() -> new NoSuchRecordFoundException("Provide correct details "));
			} catch (NoSuchRecordFoundException e) {
				throw e;
			}

		} else {
			attendanceRepository.deleteById(id);

		}

		return "deleted";
	}

	@Override
	public void deleteAll() {
		attendanceRepository.deleteAll();
	}

	@Override
	public Attendance update(Attendance attendance) {
		Optional<Attendance> optional = attendanceRepository.findById(attendance.getId());
		if (optional.isEmpty()) {
			try {
				optional.orElseThrow(() -> new NoSuchRecordFoundException("Provide correct details "));

			} catch (NoSuchRecordFoundException e) {
				throw e;
			}
		} else {
			attendanceRepository.save(attendance);

		}
		return attendance;
	}
		
	

}
