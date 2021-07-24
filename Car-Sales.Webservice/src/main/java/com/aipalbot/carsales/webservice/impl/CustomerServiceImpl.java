package com.aipalbot.carsales.webservice.impl;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aipalbot.carsales.webservice.entity.CustomerEntity;
import com.aipalbot.carsales.webservice.repository.CustomerRepository;
import com.aipalbot.carsales.webservice.request.CustomerRequest;
import com.aipalbot.carsales.webservice.service.CustomerService;
import com.aipalbot.carsales.webservice.util.CommonUtil;


@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerRepository customerRepository;
	Random rand = new Random();
	
	//obtain a number between [ 0 - 49999999].
	int n = rand.nextInt(50000000);
	
	
	@Override
	public int addCustomer(CustomerRequest request) {
		
		CustomerEntity customerEntity = new CustomerEntity();
		customerEntity.setAddress(request.getAddress());
		customerEntity.setCustomerEmail(request.getCustomerEmail());
		customerEntity.setCustomerId(CommonUtil.generateNumber());
		customerEntity.setFirstName(request.getFirstName());
		customerEntity.setLastName(request.getLastName());
		customerEntity.setPhoneNumber(request.getLastName());
		
		customerRepository.save(customerEntity);
		
		return customerEntity.getCustomerId();
	}

}
