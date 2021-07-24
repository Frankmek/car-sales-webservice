package com.aipalbot.carsales.webservice.service;

import java.util.List;

import com.aipalbot.carsales.webservice.entity.StockEntity;
import com.aipalbot.carsales.webservice.model.CarItem;
import com.aipalbot.carsales.webservice.request.CarRequest;

public interface CarService {

	// method signature ---- overloaded
	String addItem (CarItem carItem);
	void addItem (CarRequest carReq);
	List<CarItem> retrieveItems();
	List<StockEntity>retrieveCarEntities();
	CarItem getCar(String vin);
	
}
