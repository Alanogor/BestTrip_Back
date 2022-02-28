package com.inti.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class CommentaireExperience {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idComExperience;
	private String commentaireComExperience;
	private int ratingComExperience;
	@ManyToOne
	private Experience experience;
	
	public CommentaireExperience(){}
	
	public Long getIdComExperience() {
		return idComExperience;
	}
	public void setIdComExperience(Long idComExperience) {
		this.idComExperience = idComExperience;
	}
	public String getCommentaireComExperience() {
		return commentaireComExperience;
	}
	public void setCommentaireComExperience(String commentaireComExperience) {
		this.commentaireComExperience = commentaireComExperience;
	}
	public int getRatingComExperience() {
		return ratingComExperience;
	}
	public void setRatingComExperience(int ratingComExperience) {
		this.ratingComExperience = ratingComExperience;
	}
	
	
}
