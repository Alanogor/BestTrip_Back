package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Experience;
import com.inti.repository.ExperienceRepository;
import com.inti.service.interfaces.IExperienceService;

@Service
public class ExperienceService implements IExperienceService{
	@Autowired
	ExperienceRepository experienceRepository;
	
	@Override
	public List<Experience> findAll() {
		return experienceRepository.findAll();
	}

	@Override
	public Experience findOne(Long id) {
		return experienceRepository.findById(id).get();
	}

	@Override
	public Experience save(Experience obj) {
		return experienceRepository.save(obj);
	}

	@Override
	public void delete(Long id) {
		experienceRepository.deleteById(id);
	}

}
