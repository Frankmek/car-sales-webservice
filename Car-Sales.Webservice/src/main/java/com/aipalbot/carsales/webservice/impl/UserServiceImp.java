package com.aipalbot.carsales.webservice.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aipalbot.carsales.webservice.entity.UserEntity;
import com.aipalbot.carsales.webservice.repository.UserRepository;
import com.aipalbot.carsales.webservice.request.UserRequest;
import com.aipalbot.carsales.webservice.response.UserResponse;
import com.aipalbot.carsales.webservice.service.UserService;

@Service
public class UserServiceImp implements UserService{

	
	@Autowired
	UserRepository userRepository;
	
	// Create a user
	
	@Override
	public void registerUser(UserRequest request) {
		UserEntity userEntity = new UserEntity();
		userEntity.setEmail(request.getEmail());
		userEntity.setPassword(request.getPassword());
		userEntity.setRole(request.getRole());
		userEntity.setFirstName(request.getFirstName());
		userEntity.setLastName(request.getLastName());
		
		
		userRepository.save(userEntity);
	
		
	}


	
	@Override
	public boolean deleteUser(String email) {
		return false;

	}

	@Override
	public boolean updateUser(UserRequest request) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public UserEntity retrieveUser(String email) {
		
		UserEntity userEntity = userRepository.findByEmail(email);
		
		return userEntity;
	}



	@Override
	public UserResponse signIn(UserRequest request) {
		
		UserResponse userResponse = new UserResponse();
		
		//get user detail from database using user email
		UserEntity userEntity = retrieveUser(request.getEmail());
		// compare what we retrieved from the database with what the user provided for login
		if(userEntity == null) {
			//when the user does not exist - the user hasn't signed up before.
			 userResponse.setAuthenticated(false);
			 return userResponse;
			 	
		}
		
		// set others values
		
		userResponse.setFirstName(userEntity.getFirstName());
		userResponse.setLastName(userEntity.getLastName());
		userResponse.setEmail(userEntity.getEmail());
		
		if(userEntity.getPassword().equals(request.getPassword())) {
			
			userResponse.setAuthenticated(true);
			
			
			
		} else if (!userEntity.getPassword().equals(request.getPassword()))
		{
		
		userResponse.setAuthenticated(false);
		
	}
		
	// is the user a normal or admin
	if(userEntity.getRole().equalsIgnoreCase("Admin"))
	{
		userResponse.setAdmin(true);
	}
	
	return userResponse;
	}
}
