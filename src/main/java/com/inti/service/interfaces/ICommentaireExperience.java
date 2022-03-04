package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.CommentaireExperience;

public interface ICommentaireExperience{
	List<CommentaireExperience> findAll();
	
	CommentaireExperience findOne(Long id);
	
	CommentaireExperience save(CommentaireExperience obj);
	
	void delete(Long id);
	
	List<CommentaireExperience> findByCommentaire(Long id);
}
