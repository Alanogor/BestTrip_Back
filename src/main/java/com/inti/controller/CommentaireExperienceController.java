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

import com.inti.entities.CommentaireExperience;
import com.inti.service.impl.CommentaireExperienceService;

@RestController
@CrossOrigin
public class CommentaireExperienceController {
	@Autowired
	CommentaireExperienceService commentaireExperienceService;
	
	@GetMapping("commentaire_experience")
	public List<CommentaireExperience> findAll() {
		return commentaireExperienceService.findAll();
	}
	
	@GetMapping("commentaire_experience/{id}")
	public CommentaireExperience findOne(@PathVariable("id") Long id) {
		return commentaireExperienceService.findOne(id);
	}
	
	@DeleteMapping("commentaire_experience/{id}")
	public void delete(@PathVariable("id") Long id) {
		commentaireExperienceService.delete(id);
	}
	
	@PostMapping("commentaire_experience")
	public CommentaireExperience save(@RequestBody CommentaireExperience obj) {
		return commentaireExperienceService.save(obj);
	}
	
	@PutMapping("commentaire_experience/{id}")
	public CommentaireExperience update(@RequestBody CommentaireExperience obj,@PathVariable("id") Long id) {
		obj.setIdComExperience(id);
		return commentaireExperienceService.save(obj);
	}
}
