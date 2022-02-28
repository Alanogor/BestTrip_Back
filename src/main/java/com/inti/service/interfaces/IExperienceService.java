package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Experience;

public interface IExperienceService{
	List<Experience> findAll();
	
	Experience findOne(Long id);
	
	Experience save(Experience obj);
	
	void delete(Long id);
}
