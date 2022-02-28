package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Recommandation;
import com.inti.repositories.RecommandationRepository;
import com.inti.service.interfaces.IRecommandationService;

@Service
public class RecommandationService implements IRecommandationService{
	@Autowired
	RecommandationRepository recommandationRepository;

	@Override
	public List<Recommandation> findAll() {
		
		return recommandationRepository.findAll();
	}

	@Override
	public Recommandation findOne(Long idRecommandation) {
		// TODO Auto-generated method stub
		return recommandationRepository.findById(idRecommandation).get();
	}

	@Override
	public Recommandation save(Recommandation recommandation) {
		// TODO Auto-generated method stub
		return recommandationRepository.save(recommandation);
	}

	@Override
	public void delete(Long idRecommandation) {
		recommandationRepository.deleteById(idRecommandation);
		
	}

}
