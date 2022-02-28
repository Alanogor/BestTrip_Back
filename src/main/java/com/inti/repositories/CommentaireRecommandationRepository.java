package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.CommentaireRecommandation;

@Repository
public interface CommentaireRecommandationRepository extends JpaRepository<CommentaireRecommandation, Long>{

}
