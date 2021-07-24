package com.aipalbot.carsales.webservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aipalbot.carsales.webservice.constant.CommonConstant;
import com.aipalbot.carsales.webservice.entity.StockEntity;
import com.aipalbot.carsales.webservice.model.CarItem;
import com.aipalbot.carsales.webservice.request.CarRequest;
import com.aipalbot.carsales.webservice.response.CarResponse;
import com.aipalbot.carsales.webservice.service.CarService;



@RestController
@RequestMapping("stock/") 
public class StockController {

	@Autowired
	CarService carService;// we have added dependency to carService
	
	
	// stock/new
	@CrossOrigin(origins = CommonConstant.REACT_APP_URL)
	@PostMapping("new") // This code is for adding new stock.
	public String addNewItem(@RequestBody CarRequest request) { //the CarRequest data will come from outside. The RequestBody annotation helps
		// to call the data from outside using our postman json
		// extract needed attributes.
		CarItem item = new CarItem(request.getVin()); // we use the get to retrieve the value for the vin number and use it as
		// our default constructor.Once that is done we can start using setter for any other thing. Note that anything boolean
		// does not use getter and setter even though we set it for them.
		item.setMileage(request.getMileage());
		item.setStatus(request.isStatus());
		//item.setStockId(100); // we set the value for this from the backend.
		item.setPrice(request.getPrice());
		item.setImgUrl(request.getImgUrl());
		item.setEngine(request.getEngine());
		item.setYear(request.getYear());
		item.setMaker(request.getMaker());
		
		
		String response = carService.addItem(item);
		
		return response;
	} 
	
// null is the default value for string if no value is given to it, and 0 is the default value of integer if no value is given to it.
	
//stock/update
	@CrossOrigin(origins = CommonConstant.REACT_APP_URL)
	@PutMapping("update") // Putmapping is for update 	// put our method below	
	public String updateItem(@RequestBody CarRequest request) { //the CarRequest data will come from outside. The RequestBody annotation helps
		// to call the data from outside using our postman json
		
		CarRequest cr = new CarRequest("23328848499399"); // this is creatable because we have an overload constructor for vin
		// and this makes the vin immutable we can define other properties below because we have setters for them.
		cr.setModelName("Toyota");
		
		return request.getModelName() +"is successfully updated";
	} 
	

	//stock/item/24324234
	@CrossOrigin(origins = CommonConstant.REACT_APP_URL)
	@GetMapping("item/{vin}") // Getmapping helps us to send data out		// put our method below		
	public CarResponse getItem(@PathVariable String vin) { 
		CarItem carItem = carService.getCar(vin);
		CarResponse response = new CarResponse();
		response.setPrice(carItem.getPrice());
		response.setYear(carItem.getYear());
		response.setMaker(carItem.getMaker());
		response.setVin(vin);
		
		return response;
		
		
	} 
		
	//stock/item?modelName=camry&make=toyota
	@CrossOrigin(origins = CommonConstant.REACT_APP_URL)
	@GetMapping("item") // Getmapping helps us to send data out	// put our method below	
	public CarResponse getItemByModelMaker(@RequestParam String modelName, @RequestParam String make) { //		
		
		return null;
	} 
		
	
	@GetMapping("items")
	public List<CarItem> getItems(){
		
		List<CarItem> items = carService.retrieveItems();
		
		return items;
		
	}
	
	@CrossOrigin(origins = CommonConstant.REACT_APP_URL)
	@GetMapping("items/all")
	public List<StockEntity> getAllItems(){
		
		List<StockEntity> items = carService.retrieveCarEntities();
		
		return items;
	}
	
	
}
	


