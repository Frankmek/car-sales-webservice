package com.aipalbot.carsales.webservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aipalbot.carsales.webservice.constant.CommonConstant;
import com.aipalbot.carsales.webservice.request.UserRequest;
import com.aipalbot.carsales.webservice.response.UserResponse;
import com.aipalbot.carsales.webservice.service.UserService;

@CrossOrigin(origins = CommonConstant.REACT_APP_URL)
@RestController
@RequestMapping("user/") 
public class UserController {
	
	@Autowired
	UserService userService;
	
	// postmapping is used to bring in the data from our UserRequest.	
	// we will talk about ResponseEntity
	

	@PostMapping("create") // This code is for adding new user.
	public String addNewCustomer(@RequestBody UserRequest request) { 
		
		userService.registerUser(request); // this has no return because from UserService it is void
		
		return CommonConstant.ADD_NEW_USER_MSG;

	}

		@PostMapping("sign-in")
		public UserResponse signIn(@RequestBody UserRequest request) {
			UserResponse response = userService.signIn(request);
			
			return response;
		}
		@GetMapping("auth")
		public String auth(@RequestHeader(value = "Authorization") String header) {
			return header;
		}
		
}