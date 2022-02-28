package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.CommentaireExperience;
import com.inti.repositories.CommentaireExperienceRepository;
import com.inti.service.interfaces.ICommentaireExperience;

@Service
public class CommentaireExperienceService implements ICommentaireExperience{
	@Autowired
	CommentaireExperienceRepository commentaireExperienceRepository;
	
	@Override
	public List<CommentaireExperience> findAll() {
		return commentaireExperienceRepository.findAll();
	}

	@Override
	public CommentaireExperience findOne(Long id) {
		return commentaireExperienceRepository.findById(id).get();
	}

	@Override
	public CommentaireExperience save(CommentaireExperience obj) {
		return commentaireExperienceRepository.save(obj);
	}

	@Override
	public void delete(Long id) {
		commentaireExperienceRepository.deleteById(id);
	}


}
