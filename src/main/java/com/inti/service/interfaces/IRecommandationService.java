package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Recommandation;

public interface IRecommandationService {
	List<Recommandation> findAll();

	Recommandation findOne(Long idRecommandation);

	Recommandation save(Recommandation recommandation);

	void delete(Long idRecommandation);

}
