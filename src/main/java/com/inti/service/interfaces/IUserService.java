package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.User;

public interface IUserService {
	List<User> findAll();

	User findOne(Long idUser);

	User save(User User);

	void delete(Long idUser);

	User findByUsername(String username);
	
	int nbrUsers();
}
