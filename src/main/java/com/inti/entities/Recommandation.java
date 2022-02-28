package com.inti.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Recommandation implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idRecommandation;
	private String titreRecommandation;
	private String descriptionRecommandation;
	private String typeRecommandation;
	private String paysRecommandation;
	private Float prixRecommandation;
	private Float ratingRecommandation;
	@Lob
	private byte[] mediaRecommandation;
	
	@OneToMany(mappedBy="recommandation")
	List <CommentaireRecommandation> liste_commentaire_recommandation = new ArrayList<>();
	@ManyToOne
	@JoinColumn(name="user")
	private User userRec;
	
	public Recommandation() {
		super();
	}
	public Recommandation(String titreRecommandation, String descriptionRecommandation, String typeRecommandation,
			String paysRecommandation, Float prixRecommandation, Float ratingRecommandation) {
		super();
		this.titreRecommandation = titreRecommandation;
		this.descriptionRecommandation = descriptionRecommandation;
		this.typeRecommandation = typeRecommandation;
		this.paysRecommandation = paysRecommandation;
		this.prixRecommandation = prixRecommandation;
		this.ratingRecommandation = ratingRecommandation;
	}
	public Long getIdRecommandation() {
		return idRecommandation;
	}
	public void setIdRecommandation(Long idRecommandation) {
		this.idRecommandation = idRecommandation;
	}
	public String getTitreRecommandation() {
		return titreRecommandation;
	}
	public void setTitreRecommandation(String titreRecommandation) {
		this.titreRecommandation = titreRecommandation;
	}
	public String getDescriptionRecommandation() {
		return descriptionRecommandation;
	}
	public void setDescriptionRecommandation(String descriptionRecommandation) {
		this.descriptionRecommandation = descriptionRecommandation;
	}
	public String getTypeRecommandation() {
		return typeRecommandation;
	}
	public void setTypeRecommandation(String typeRecommandation) {
		this.typeRecommandation = typeRecommandation;
	}
	public String getPaysRecommandation() {
		return paysRecommandation;
	}
	public void setPaysRecommandation(String paysRecommandation) {
		this.paysRecommandation = paysRecommandation;
	}
	public Float getPrixRecommandation() {
		return prixRecommandation;
	}
	public void setPrixRecommandation(Float prixRecommandation) {
		this.prixRecommandation = prixRecommandation;
	}
	public Float getRatingRecommandation() {
		return ratingRecommandation;
	}
	public void setRatingRecommandation(Float ratingRecommandation) {
		this.ratingRecommandation = ratingRecommandation;
	}
	
	
	public byte[] getMediaRecommandation() {
		return mediaRecommandation;
	}
	public void setMediaRecommandation(byte[] mediaRecommandation) {
		this.mediaRecommandation = mediaRecommandation;
	}
	public List<CommentaireRecommandation> getListe_commentaire_recommandation() {
		return liste_commentaire_recommandation;
	}
	public void setListe_commentaire_recommandation(List<CommentaireRecommandation> liste_commentaire_recommandation) {
		this.liste_commentaire_recommandation = liste_commentaire_recommandation;
	}
	@Override
	public String toString() {
		return "Recommandation [idRecommandation=" + idRecommandation + ", titreRecommandation=" + titreRecommandation
				+ ", descriptionRecommandation=" + descriptionRecommandation + ", typeRecommandation="
				+ typeRecommandation + ", paysRecommandation=" + paysRecommandation + ", prixRecommandation="
				+ prixRecommandation + ", ratingRecommandation=" + ratingRecommandation + ", mediaRecommandation="
				+ Arrays.toString(mediaRecommandation) + "]";
	}
	
	
	
}
