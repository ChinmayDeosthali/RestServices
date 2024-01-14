package com.todo.rest.webservices.restservices.basic.auth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@CrossOrigin(origins="http://localhost:4200")
@CrossOrigin(origins = "https://todos-management.vercel.app/")
@RestController
public class BasicAuthenticationController {

	//@CrossOrigin(origins = "http://localhost:4200")
	@CrossOrigin(origins = "https://todos-management.vercel.app/")
	@GetMapping(path="/jpa/basicauth")
	public AuthenticationBean checkAuthentication() {
		System.out.println("----In checkAuthentication");
		System.out.println();
		return new AuthenticationBean("You are authenticated");
	}
	

	
}
