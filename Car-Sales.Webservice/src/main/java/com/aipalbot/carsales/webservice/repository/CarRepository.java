package com.aipalbot.carsales.webservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aipalbot.carsales.webservice.entity.StockEntity;

@Repository
public interface CarRepository  extends JpaRepository <StockEntity, Integer > {
	
	List<StockEntity> findAll();
	
	StockEntity findByVin(String vin);
	
}
