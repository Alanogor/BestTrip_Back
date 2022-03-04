package com.inti.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.inti.entities.CommentaireExperience;

@Repository
public interface CommentaireExperienceRepository extends JpaRepository<CommentaireExperience, Long>{
	
	@Query(value = "select * from commentaire_experience where experience_id_experience=?;",nativeQuery = true)
	public List<CommentaireExperience> findByComment(Long id);
}
