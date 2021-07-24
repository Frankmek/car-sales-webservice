package com.aipalbot.carsales.webservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aipalbot.carsales.webservice.entity.CustomerEntity;


@Repository
public interface CustomerRepository extends JpaRepository <CustomerEntity, Integer > {

	List<CustomerEntity> findAll();
}
