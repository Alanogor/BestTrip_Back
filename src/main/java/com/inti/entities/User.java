package com.inti.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;

@Entity
public class User implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUtilisateur;
	private String nom;
	private String prenom;
	//@Column(unique = true)
	private String username;
	private String password;
	private String email;
	private boolean newsLetter = true;
	private boolean enabled = true;
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "profil", 
	joinColumns = @JoinColumn(name="id_utilisateur", referencedColumnName="idUtilisateur"),
	inverseJoinColumns = @JoinColumn(name="id_role", referencedColumnName="idRole"))
	private Set<Role> roles = new HashSet<>();

	@OneToMany(mappedBy="userExp")
	private List<Experience> experiences;
	
	@OneToMany(mappedBy="userRec")
	private List<Recommandation> recommandations;
	
	@OneToMany(mappedBy="userGui")
	private List<Guide> guides;
	
	public User() {
	}

	public User(String nom, String prenom, String username, String password, String email) {
		this.nom = nom;
		this.prenom = prenom;
		this.username = username;
		this.password = password;
		this.email = email;
	}

	
	public Long getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(Long idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isNewsLetter() {
		return newsLetter;
	}

	public void setNewsLetter(boolean newsLetter) {
		this.newsLetter = newsLetter;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "User [idUtilisateur=" + idUtilisateur + ", nom=" + nom + ", prenom=" + prenom + ", username=" + username
				+ ", password=" + password + ", email=" + email + "]";
	}

	

}
