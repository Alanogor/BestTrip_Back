package com.inti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Experience;

@Repository
public interface ExperienceRepository extends JpaRepository<Experience, Long>{

}
