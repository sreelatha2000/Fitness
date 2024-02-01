package com.management.service;

import java.util.List;

import com.management.entity.Trainer;

public interface TrainerService {

	void save(Trainer trainer);
	Trainer get(Long id);
	List<Trainer> getAll();
	Trainer deleteById(Long id);
	Trainer update(Trainer trainer);

}
