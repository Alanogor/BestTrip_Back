package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.CommentaireGuide;
import com.inti.repositories.CommentaireGuideRepository;
import com.inti.service.interfaces.ICommentaireGuideService;
import com.inti.service.interfaces.IGuideService;

@Service
public class CommentaireGuideService implements ICommentaireGuideService {
	@Autowired
	CommentaireGuideRepository commentaireGuideRepository;
	
	@Override
	public List<CommentaireGuide> findAll() {
		
		return commentaireGuideRepository.findAll();
	}

	@Override
	public CommentaireGuide findOne(Long idCommentaireGuide) {
		
		return commentaireGuideRepository.findById(idCommentaireGuide).get();
	}

	@Override
	public CommentaireGuide save(CommentaireGuide commentaireGuide) {
		
		return commentaireGuideRepository.save(commentaireGuide);
	}

	@Override
	public void delete(Long idCommentaireGuide) {
		commentaireGuideRepository.deleteById(idCommentaireGuide);
		
	}

}
