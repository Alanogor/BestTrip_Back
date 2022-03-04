package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

/*import org.springframework.security.crypto.password.PasswordEncoder;*/

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.User;
import com.inti.service.interfaces.IUserService;

@RestController
@CrossOrigin
public class UserController {
	@Autowired 
	IUserService userService;

	
	//@Autowired
	//PasswordEncoder passwordEncoder;


	@GetMapping("users") 
	public List<User> findAll() {
		return userService.findAll();
	}

	@GetMapping("users/{idU}")
	public User findOne(@PathVariable("idU") Long idUser) { 
		return userService.findOne(idUser);
	}

	
	/*@PostMapping("users")

	public User saveUser(@RequestBody User user) {
		User currentUser = new User(user.getNom(), user.getPrenom(),user.getUsername(), 
				passwordEncoder.encode(user.getPassword()), user.getEmail());
		return userService.save(currentUser);

	}*/
	
	@PostMapping("users")
    public User saveUser(@RequestBody User user) {
        return userService.save(user);
    }

	@DeleteMapping("users/{idUser}")
	public void deleteUser(@PathVariable("idUser") Long idUser) {
		userService.delete(idUser);
	}

	@PutMapping("users/{idU}")
	public User updateUser(@PathVariable("idU") Long idUser, @RequestBody User user) {
		User currentUser = userService.findOne(idUser);
		currentUser.setNom(user.getNom());
		currentUser.setPrenom(user.getPrenom());
		currentUser.setUsername(user.getUsername());
		currentUser.setPassword(user.getPassword());
		currentUser.setEmail(user.getEmail());
		currentUser.setRoles(user.getRoles());
		return userService.save(currentUser);
	}
	
	/*@GetMapping("users")
	public int nbrUsers() {
		return UserService.nbrUsers();
	}*/
}

