package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.User;
import com.inti.repositories.UserRepository;
import com.inti.service.interfaces.IUserService;

@Service
public class UserService implements IUserService {
	@Autowired
	UserRepository userRepository;

	@Override
	public List<User> findAll() {

		return userRepository.findAll();
	}

	@Override
	public User findOne(Long idUtilisateur) {

		return userRepository.findById(idUtilisateur).get();
	}

	@Override
	public User save(User User) {

		return userRepository.save(User);
	}

	@Override
	public void delete(Long idUtilisateur) {
		userRepository.deleteById(idUtilisateur);

	}

	@Override
	public User findByUsername(String username) {

		return userRepository.findByUsername(username);
	}

	@Override
	public int nbrUsers() {
		return userRepository.nbrUsers();
	}
	
}
