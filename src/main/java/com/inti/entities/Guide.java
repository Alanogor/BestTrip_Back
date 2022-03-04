package com.inti.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Guide implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idGuide;
	private String descriptionGuide;
	private String paysGuide;
	private String villeGuide;
	private float prixGuide;
	@Lob
	private byte[] mediasGuide;
	
	@OneToMany (mappedBy="guide")
	List<CommentaireGuide> commentairesGuide = new ArrayList<>();
	
	@ManyToOne
	@JoinColumn(name="id_users")
	private User userGui;
	
	public Guide() {
		super();
	}


	public Guide(String descriptionGuide, String paysGuide, String villeGuide, float prixGuide, byte[] mediasGuide) {
		super();
		this.descriptionGuide = descriptionGuide;
		this.paysGuide = paysGuide;
		this.villeGuide = villeGuide;
		this.prixGuide = prixGuide;
		this.mediasGuide = mediasGuide;
	}

	public Long getIdGuide() {
		return idGuide;
	}


	public void setIdGuide(Long idGuide) {
		this.idGuide = idGuide;
	}


	public String getDescriptionGuide() {
		return descriptionGuide;
	}


	public void setDescriptionGuide(String descriptionGuide) {
		this.descriptionGuide = descriptionGuide;
	}


	public String getPaysGuide() {
		return paysGuide;
	}


	public void setPaysGuide(String paysGuide) {
		this.paysGuide = paysGuide;
	}


	public String getVilleGuide() {
		return villeGuide;
	}


	public void setVilleGuide(String villeGuide) {
		this.villeGuide = villeGuide;
	}


	public float getPrixGuide() {
		return prixGuide;
	}


	public void setPrixGuide(float prixGuide) {
		this.prixGuide = prixGuide;
	}


	public byte[] getMediasGuide() {
		return mediasGuide;
	}


	public void setMediasGuide(byte[] mediasGuide) {
		this.mediasGuide = mediasGuide;
	}


	public List<CommentaireGuide> getCommentairesGuide() {
		return commentairesGuide;
	}


	public void setCommentairesGuide(List<CommentaireGuide> commentairesGuide) {
		this.commentairesGuide = commentairesGuide;
	}


	public User getUserGui() {
		return userGui;
	}


	public void setUserGui(User userGui) {
		this.userGui = userGui;
	}


	@Override
	public String toString() {
		return "Guide [idGuide=" + idGuide + ", descriptionGuide=" + descriptionGuide + ", paysGuide=" + paysGuide
				+ ", villeGuide=" + villeGuide + ", prixGuide=" + prixGuide + ", mediasGuide="
				+ Arrays.toString(mediasGuide) + ", commentairesGuide=" + commentairesGuide + "]";
	}


	
	
}
