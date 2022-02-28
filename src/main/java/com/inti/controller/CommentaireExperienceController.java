package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.CommentaireExperience;
import com.inti.service.impl.CommentaireExperienceService;

@RestController
public class CommentaireExperienceController {
	@Autowired
	CommentaireExperienceService commentaireExperienceService;
	
	@GetMapping("/commentaire_experience")
	public List<CommentaireExperience> findAll() {
		return commentaireExperienceService.findAll();
	}
}
