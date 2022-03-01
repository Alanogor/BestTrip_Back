package com.inti.controller;

<<<<<<< HEAD
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecommandationController {
=======
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
>>>>>>> 4185006dc87e833d530c4553c30fcfdc4068c12f

import com.inti.service.interfaces.IRecommandationService;
@RestController
@CrossOrigin
public class RecommandationController {
	@Autowired 
	IRecommandationService recommandationService;
}
