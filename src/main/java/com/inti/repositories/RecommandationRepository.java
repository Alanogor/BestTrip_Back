package com.inti.repositories;

<<<<<<< HEAD
import org.springframework.stereotype.Repository;

@Repository
public interface RecommandationRepository {
=======

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Recommandation;

@Repository
public interface RecommandationRepository extends JpaRepository<Recommandation, Long>{



>>>>>>> 4185006dc87e833d530c4553c30fcfdc4068c12f

}
