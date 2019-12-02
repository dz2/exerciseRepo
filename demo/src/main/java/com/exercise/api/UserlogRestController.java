package com.exercise.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exercise.model.Userlog;
import com.exercise.service.GetService;

@RestController
public class UserlogRestController {
	@Autowired
	GetService getservice;
	
	
	@GetMapping("/getTest")
	public Userlog getTestUserlog() {
		
		return getservice.getTestUserlogs();
	}

}
