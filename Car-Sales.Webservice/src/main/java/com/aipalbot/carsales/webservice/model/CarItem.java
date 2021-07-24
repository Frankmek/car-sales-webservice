package com.aipalbot.carsales.webservice.model;

//import com.aipalbot.carsales.webservice.repository.CarRepository;

public class CarItem {
	private String vin;
	private int stockId;
	private double price;
	private String maker;
	private int year;
	private int mileage;
	private boolean status;
	private String imgUrl;
	private String engine;
	
	
	
	
	
	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public CarItem(String vin) {	
		this.vin = vin;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	public boolean isStatus() { //boolean always comes with is instead of get for the getter.
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public int getStockId() {
		return stockId;
	}
	public void setStockId(int stockId) {
		this.stockId = stockId;
	}
	public String getVin() {
		return vin;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}
	
	//public void initializeRepository(CarRepository repo) { this is method dependency injection
	//}
}

