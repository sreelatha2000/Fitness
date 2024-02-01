package com.training.service;

import java.util.List;

import com.training.entity.Progress;

public interface ProgressService {

	void save(Progress progress);

	void update(Progress progress);
	
	Progress getById(Long id);

	List<Progress> getAll();

	Progress delete(Long id);

	

}
