package com.inti.controller;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.inti.service.interfaces.IRecommandationService;

@RestController
@CrossOrigin
public class RecommandationController {
	@Autowired 
	IRecommandationService recommandationService;
}
