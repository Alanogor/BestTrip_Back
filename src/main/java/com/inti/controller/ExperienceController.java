package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.inti.entities.Experience;
import com.inti.service.impl.ExperienceService;

@RestController
@CrossOrigin
public class ExperienceController {
	@Autowired
	ExperienceService experienceService;
	
	@GetMapping("experience")
	public List<Experience> findAll() {
		return experienceService.findAll();
	}
	
	@GetMapping("experience/{id}")
	public Experience findOne(@PathVariable("id")Long id) {
		return experienceService.findOne(id);
	}
	
	/*@PostMapping("experience")
	public Experience save(@RequestBody Experience obj) {
		return experienceService.save(obj);
	}*/
	
	@DeleteMapping("experience/{id}")
	public void delete(@PathVariable("id")Long id) {
		experienceService.delete(id);
	}
	
	@PutMapping("experience/{id}")
	public Experience update(@PathVariable("id")Long id,@RequestBody Experience obj) {
		obj.setIdExperience(id);
		return experienceService.save(obj);
	}
	
	@PostMapping("experience")
    public String saveUtilisateur(@RequestParam ("TitreE") String titre, @RequestParam ("descriptionE")String description, 
            @RequestParam ("ratingE") Float rating, @RequestParam ("typeE")String type, @RequestParam ("prixE")Float prix, @RequestParam ("mediaU") MultipartFile file) {
        try {
            Experience currentExperience = new Experience();
            currentExperience.setTitreExperience(titre);
            currentExperience.setDescriptionExperience(description);
            currentExperience.setRatingExperience(rating);;
            currentExperience.setTypeExperience(type);
            currentExperience.setPrixExperience(prix);
            currentExperience.setMediasExperience(file.getBytes());
            experienceService.save(currentExperience);
            return "File uploaded successdully! filename"+file.getOriginalFilename();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return "fail mayeyou had uploaded the file before or the file's size > 500kb";
    }
}
