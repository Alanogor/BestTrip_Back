package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.inti.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	User findByNom(String nom);

	@Query(value = "SELECT count(*) FROM User", nativeQuery = true)
	int nbrUsers();
}
