package com.inti.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.inti.entities.Recommandation;

@Repository
public interface RecommandationRepository extends JpaRepository<Recommandation, Long>{

}
