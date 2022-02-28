package com.inti.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class CommentaireRecommandation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCommentaireRecommandation;
	private String commentaireComRecommandation;
	private int ratingComRecommandation;
	
	@ManyToOne
	@JoinColumn(name="recommandation")
	private Recommandation recommandation;
	
	public CommentaireRecommandation() {
		super();
	}
	public CommentaireRecommandation(String commentaireComRecommandation, int ratingComRecommandation) {
		super();
		this.commentaireComRecommandation = commentaireComRecommandation;
		this.ratingComRecommandation = ratingComRecommandation;
	}
	public Long getIdCommentaireRecommandation() {
		return idCommentaireRecommandation;
	}
	public void setIdCommentaireRecommandation(Long idCommentaireRecommandation) {
		this.idCommentaireRecommandation = idCommentaireRecommandation;
	}
	public String getCommentaireComRecommandation() {
		return commentaireComRecommandation;
	}
	public void setCommentaireComRecommandation(String commentaireComRecommandation) {
		this.commentaireComRecommandation = commentaireComRecommandation;
	}
	public int getRatingComRecommandation() {
		return ratingComRecommandation;
	}
	public void setRatingComRecommandation(int ratingComRecommandation) {
		this.ratingComRecommandation = ratingComRecommandation;
	}
	@Override
	public String toString() {
		return "CommentaireRecommandation [idCommentaireRecommandation=" + idCommentaireRecommandation
				+ ", commentaireComRecommandation=" + commentaireComRecommandation + ", ratingComRecommandation="
				+ ratingComRecommandation + "]";
	}
	
	
	
}
