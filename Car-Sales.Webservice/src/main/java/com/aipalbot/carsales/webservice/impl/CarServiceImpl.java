package com.aipalbot.carsales.webservice.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aipalbot.carsales.webservice.entity.StockEntity;
import com.aipalbot.carsales.webservice.model.CarItem;
import com.aipalbot.carsales.webservice.repository.CarRepository;
import com.aipalbot.carsales.webservice.request.CarRequest;
import com.aipalbot.carsales.webservice.service.CarService;

@Service
public class CarServiceImpl implements CarService{

	
	@Autowired
	CarRepository carRepository; // Dependency injection
	
	@Override //inheritance-- inheritance by interface.
	public String addItem(CarItem carItem) {
		StockEntity entity = new StockEntity();
		entity.setMaker(carItem.getMaker());
		entity.setMileage(carItem.getMileage());
		entity.setPrice(carItem.getPrice());
		entity.setStatus(carItem.isStatus());
		entity.setVin(carItem.getVin());
		entity.setCarImageUrl(carItem.getImgUrl());
		entity.setEngine(carItem.getEngine());
		entity.setYear(carItem.getYear());
		
		
		
		// save to the h2 database
		carRepository.save(entity);
		
		return "Successfully saved";
	}

	@Override
	public void addItem(CarRequest carReq) {
	
	}

	@Override
	public List<CarItem> retrieveItems() {
	List<StockEntity> items = carRepository.findAll();
		
		List<CarItem> carItems = new ArrayList<>();
		for(StockEntity item: items) {
			CarItem carItem = new CarItem(item.getVin());
			carItem.setImgUrl(item.getCarImageUrl());
			carItem.setMaker(item.getMaker());
			carItems.add(carItem);
		
	}

		return carItems;
		
	}
		@Override
		public List<StockEntity> retrieveCarEntities() {
			
			return carRepository.findAll();
		}

		@Override
		public CarItem getCar(String vin) {
			
			StockEntity entity = carRepository.findByVin(vin);
			
			CarItem carItem = new CarItem(vin);
			carItem.setMaker(entity.getMaker());
			carItem.setPrice(entity.getPrice());
			carItem.setYear(entity.getYear());
			
			return carItem;
		}
}
