package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.CommentaireGuide;
@Repository
public interface CommentaireGuideRepository extends JpaRepository<CommentaireGuide, Long>{

}
