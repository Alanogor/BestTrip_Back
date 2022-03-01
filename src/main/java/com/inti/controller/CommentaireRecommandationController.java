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
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.CommentaireRecommandation;
import com.inti.entities.Role;
import com.inti.service.impl.CommentaireRecommandationService;
import com.inti.service.interfaces.ICommentaireRecommandationService;
import com.inti.service.interfaces.IRoleService;

@RestController
@CrossOrigin
public class CommentaireRecommandationController {
	@Autowired 
	ICommentaireRecommandationService commentaireRecommandationService;
	
	@GetMapping("commentaire_recommandation") 
	public List<CommentaireRecommandation> findAll() {
		return commentaireRecommandationService.findAll();
	}

	@GetMapping("commentaire_recommandation/{idCR}") 
	public CommentaireRecommandation findOne(@PathVariable("idCR") Long idCommentaireRecommandation) { 
		return commentaireRecommandationService.findOne(idCommentaireRecommandation);
	}

	@PostMapping("commentaire_recommandation")
	public CommentaireRecommandation save(@RequestBody CommentaireRecommandation commentaireRecommandation) {
		return commentaireRecommandationService.save(commentaireRecommandation);
	}

	@DeleteMapping("commentaire_recommandation/{idCommentaireRecommandation}")
	public void delete(@PathVariable("idCommentaireRecommandation") Long idCommentaireRecommandation) {
		commentaireRecommandationService.delete(idCommentaireRecommandation);
	}

	@PutMapping("commentaire_recommandation/{idCommentaireRecommandation}")
	public CommentaireRecommandation updateCommentaireRecommandation(@PathVariable("idCommentaireRecommandation") Long idCommentaireRecommandation, @RequestBody CommentaireRecommandation commentaireRecommandation) {
		commentaireRecommandation.setIdCommentaireRecommandation(idCommentaireRecommandation);
		return commentaireRecommandationService.save(commentaireRecommandation);
	}

}
