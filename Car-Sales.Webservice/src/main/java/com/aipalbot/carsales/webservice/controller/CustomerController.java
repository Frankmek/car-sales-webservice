package com.aipalbot.carsales.webservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aipalbot.carsales.webservice.request.CustomerRequest;
import com.aipalbot.carsales.webservice.service.CustomerService;

// this will help us Delete, Update customer info

@RestController
@RequestMapping("customer/") 
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@PostMapping("new") // This code is for adding new customer.
	// postmapping is used to bring in the data from our CustomerRequest.
	
	public String addNewCustomer(@RequestBody CustomerRequest request) { 
		
		int customerId = customerService.addCustomer(request);
		
		return "CustomerId:" + customerId + ", saved successfully";

	}
	
	
}
