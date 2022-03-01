package com.inti.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.User;
import com.inti.service.interfaces.IUserService;

@RestController
@RequestMapping(value="/login")
public class LoginController {
	
	@Autowired
	IUserService userService;
	
	@RequestMapping(value="/user")
	public User login(Principal principal) {
		return userService.findByNom(principal.getName());
	}

}
