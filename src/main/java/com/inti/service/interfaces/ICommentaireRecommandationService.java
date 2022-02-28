package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.CommentaireRecommandation;

public interface ICommentaireRecommandationService {
	List<CommentaireRecommandation> findAll();

	CommentaireRecommandation findOne(Long idCommentaireRecommandation);

	CommentaireRecommandation save(CommentaireRecommandation commentairerecommandation);

	void delete(Long idCommentaireRecommandation);

}
