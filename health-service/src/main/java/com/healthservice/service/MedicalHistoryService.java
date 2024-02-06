package com.healthservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.healthservice.bean.ResponseDto;
import com.healthservice.entity.MedicalHistory;


@Service
public interface MedicalHistoryService {

	MedicalHistory saveNewMedicalHistory(MedicalHistory bean);

	ResponseDto getById(Long memberId);

	List<MedicalHistory> getAllMedicalHistory();

	MedicalHistory updateMedicalHistory(MedicalHistory bean);

	void deleteById(Long memberId);

	
}
