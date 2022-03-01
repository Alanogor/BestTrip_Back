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

import com.inti.entities.CommentaireGuide;
import com.inti.entities.Guide;
import com.inti.service.interfaces.ICommentaireGuideService;


@RestController
@CrossOrigin
public class CommentaireGuideController {
	@Autowired 
	ICommentaireGuideService commentaireGuideService;

	//@Autowired
	//PasswordEncoder passwordEncoder;
	
	
	@GetMapping("commentaire_guide") 
	public List<CommentaireGuide> findAll() {
		return commentaireGuideService.findAll();
	}

	@GetMapping("commentaire_guide/{id}")
	public CommentaireGuide findOne(@PathVariable("id") Long idCommentaireGuide) { 
		return commentaireGuideService.findOne(idCommentaireGuide);
	}

	@PostMapping("commentaire_guide")
	public CommentaireGuide saveCommentaireGuide(@RequestBody CommentaireGuide commentaireGuide) {
		return commentaireGuideService.save(commentaireGuide);
	}
	/*@PostMapping("commentaire_guide")
	public CommentaireGuide saveCommentaireGuide(@RequestBody CommentaireGuide commentaireGuide) {
		CommentaireGuide currentCommentaireGuide=new CommentaireGuide(commentaireGuide.getCommentaireComGuide(), 
				commentaireGuide.getRatingComGuide());
		return commentaireGuideService.save(currentCommentaireGuide);
	}*/

	@DeleteMapping("commentaire_guide/{id}")
	public void deleteCommentaireGuide(@PathVariable("id") Long idCommentaireGuide) {
		commentaireGuideService.delete(idCommentaireGuide);
	}
	
	@PutMapping("commentaire_guide/{id}")
	public CommentaireGuide updateCommentaireGuide(@PathVariable("id") Long idCommentaireGuide, @RequestBody CommentaireGuide commentaireGuide) {
		commentaireGuide.setIdCommentaireGuide(idCommentaireGuide);
		return commentaireGuideService.save(commentaireGuide);
	} 

	/*@PutMapping("commentaire_guide/{id}")
	public CommentaireGuide updateCommentaireGuide(@PathVariable("id") Long idCommentaireGuide, @RequestBody CommentaireGuide commentaireGuide) {
		CommentaireGuide currentCommentaireGuide = commentaireGuideService.findOne(idCommentaireGuide);
		currentCommentaireGuide.setCommentaireComGuide(commentaireGuide.getCommentaireComGuide());
		currentCommentaireGuide.setRatingComGuide(commentaireGuide.getRatingComGuide());
		return commentaireGuideService.save(currentCommentaireGuide);
	}*/
}
