package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Experience;
import com.inti.service.impl.ExperienceService;

@RestController
@CrossOrigin
public class ExperienceController {
	@Autowired
	ExperienceService experienceService;
	
	@GetMapping("/experience")
	public List<Experience> findAll() {
		return experienceService.findAll();
	}
	
	@GetMapping("/experience/{id}")
	public Experience findOne(@PathVariable("id")Long id) {
		return experienceService.findOne(id);
	}
	
	@PostMapping("/experience")
	public Experience save(@RequestBody Experience obj) {
		return experienceService.save(obj);
	}
	
	@DeleteMapping("/experience/{id}")
	public void delete(@PathVariable("id")Long id) {
		experienceService.delete(id);
	}
	
	@PutMapping("/experience/{id}")
	public Experience update(@PathVariable("id")Long id,@RequestBody Experience obj) {
		obj.setIdExperience(id);
		return experienceService.save(obj);
	}
}
