package com.inti.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class CommentaireGuide implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idCommentaireGuide;
	private String commentaireComGuide;
	private int ratingComGuide;
	
	@ManyToOne
	@JoinColumn(name="id_guide")
	private Guide guide;

	public CommentaireGuide() {
		super();
	}

	public CommentaireGuide(String commentaireComGuide, int ratingComGuide, Guide guide) {
		super();
		this.commentaireComGuide = commentaireComGuide;
		this.ratingComGuide = ratingComGuide;
		this.guide = guide;
	}

	public CommentaireGuide(String commentaireComGuide, int ratingComGuide) {
		super();
		this.commentaireComGuide = commentaireComGuide;
		this.ratingComGuide = ratingComGuide;
	}

	public Long getIdCommentaireGuide() {
		return idCommentaireGuide;
	}

	public void setIdCommentaireGuide(Long idCommentaireGuide) {
		this.idCommentaireGuide = idCommentaireGuide;
	}

	public String getCommentaireComGuide() {
		return commentaireComGuide;
	}

	public void setCommentaireComGuide(String commentaireComGuide) {
		this.commentaireComGuide = commentaireComGuide;
	}

	public int getRatingComGuide() {
		return ratingComGuide;
	}

	public void setRatingComGuide(int ratingComGuide) {
		this.ratingComGuide = ratingComGuide;
	}

	public Guide getGuide() {
		return guide;
	}

	public void setGuide(Guide guide) {
		this.guide = guide;
	}

	@Override
	public String toString() {
		return "CommentaireGuide [idCommentaireGuide=" + idCommentaireGuide + ", commentaireComGuide="
				+ commentaireComGuide + ", ratingComGuide=" + ratingComGuide + "]";
	}
	
	
}
