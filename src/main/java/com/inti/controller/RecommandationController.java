package com.inti.controller;



import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

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

import com.inti.entities.CommentaireRecommandation;
import com.inti.entities.Recommandation;
import com.inti.service.interfaces.ICommentaireRecommandationService;
import com.inti.service.interfaces.IRecommandationService;

@RestController
@CrossOrigin
public class RecommandationController {
	@Autowired 
	IRecommandationService recommandationService;
	
	@GetMapping("recommandation") 
	public List<Recommandation> findAll() {
		return recommandationService.findAll();
	}

	@GetMapping("recommandation/{idR}") 
	public Recommandation findOne(@PathVariable("idR") Long idRecommandation) { 
		return recommandationService.findOne(idRecommandation);
	}
	
/*
	@PostMapping("recommandation")
	public Recommandation save(@RequestBody Recommandation Recommandation) {
		return recommandationService.save(Recommandation);
	}*/
	
	@PostMapping("recommandation")
    public String saveRecommandation(@RequestParam ("titreR") String titre,@RequestParam ("descriptionR") String description,@RequestParam ("typeR") String type, @RequestParam ("paysR")String pays, 
            @RequestParam ("prixR")String prix,@RequestParam ("ratingR") String rating, @RequestParam ("fileU") MultipartFile file) {
        try {
            Recommandation currentRecommandation = new Recommandation();
            currentRecommandation.setTitreRecommandation(titre);
            currentRecommandation.setDescriptionRecommandation(description);
            currentRecommandation.setTypeRecommandation(type);
            currentRecommandation.setPaysRecommandation(pays);
            currentRecommandation.setPrixRecommandation(Float.parseFloat(prix));
            currentRecommandation.setRatingRecommandation(Float.parseFloat(rating));
            currentRecommandation.setMediaRecommandation(file.getBytes());
            recommandationService.save(currentRecommandation);
            return "File uploaded successdully! filename"+file.getOriginalFilename();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return "fail maybe you had uploaded the file before or the file's size > 500kb";
    }
	@DeleteMapping("recommandation/{idRecommandation}")
	public void delete(@PathVariable("idRecommandation") Long idRecommandation) {
		recommandationService.delete(idRecommandation);
	}

	@PutMapping("recommandation/{idRecommandation}")
	public Recommandation update(@PathVariable("idRecommandation") Long idRecommandation, @RequestBody Recommandation recommandation) {	
		recommandation.setIdRecommandation(idRecommandation);
		return recommandationService.save(recommandation);
	}

}
