package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.CommentaireRecommandation;
import com.inti.repositories.CommentaireRecommandationRepository;
import com.inti.service.interfaces.ICommentaireRecommandationService;

@Service
public class CommentaireRecommandationService implements ICommentaireRecommandationService{

	@Autowired
	CommentaireRecommandationRepository commentaireRecommandationRepository;

	@Override
	public List<CommentaireRecommandation> findAll() {
		
		return commentaireRecommandationRepository.findAll();
	}

	@Override
	public CommentaireRecommandation findOne(Long idCommentaireRecommandation) {
		return commentaireRecommandationRepository.findById(idCommentaireRecommandation).get();
	}

	@Override
	public CommentaireRecommandation save(CommentaireRecommandation commentairerecommandation) {
		return commentaireRecommandationRepository.save(commentairerecommandation);
	}

	@Override
	public void delete(Long idCommentaireRecommandation) {
		commentaireRecommandationRepository.deleteById(idCommentaireRecommandation);
		
	}
}
