package com.inti.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Experience implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idExperience;
	private String titreExperience;
	private String descriptionExperience;
	private Float ratingExperience;
	private String typeExperience;
	private Float prixExperience;
	@Lob
	private byte[] mediasExperience;
	@OneToMany(mappedBy = "experience")
	private List<CommentaireExperience> comExperience=new ArrayList<>();
	@ManyToOne
	private User user;
	
	
	public Experience() {}

	public Long getIdExperience() {
		return idExperience;
	}

	public void setIdExperience(Long idExperience) {
		this.idExperience = idExperience;
	}

	public String getTitreExperience() {
		return titreExperience;
	}

	public void setTitreExperience(String titreExperience) {
		this.titreExperience = titreExperience;
	}

	public String getDescriptionExperience() {
		return descriptionExperience;
	}

	public void setDescriptionExperience(String descriptionExperience) {
		this.descriptionExperience = descriptionExperience;
	}

	public Float getRatingExperience() {
		return ratingExperience;
	}

	public void setRatingExperience(Float ratingExperience) {
		this.ratingExperience = ratingExperience;
	}

	public String getTypeExperience() {
		return typeExperience;
	}

	public void setTypeExperience(String typeExperience) {
		this.typeExperience = typeExperience;
	}

	public Float getPrixExperience() {
		return prixExperience;
	}

	public void setPrixExperience(Float prixExperience) {
		this.prixExperience = prixExperience;
	}

	public byte[] getMediasExperience() {
		return mediasExperience;
	}

	public void setMediasExperience(byte[] media) {
		this.mediasExperience = media;
	}
	
	
}
