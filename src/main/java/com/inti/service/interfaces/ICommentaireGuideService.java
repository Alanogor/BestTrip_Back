package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.CommentaireGuide;

public interface ICommentaireGuideService {
	List<CommentaireGuide> findAll();

	CommentaireGuide findOne (Long idCommentaireGuide);
	
	CommentaireGuide save(CommentaireGuide commentaireGuide);
	
	void delete(Long idCommentaireGuide);
}
