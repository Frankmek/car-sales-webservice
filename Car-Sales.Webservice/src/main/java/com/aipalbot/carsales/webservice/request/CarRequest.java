package com.aipalbot.carsales.webservice.request;

public class CarRequest {
	
	private int stockId;
	private String fuelType;
	private String exteriorColor;
	private int cityMPG;
	private String interiorColor;
	private int highwayMPG; 
	private String stock;
	private String driveTrain;
	private String transmission;
	private String engine;
	private String vin;
	private double price;
	private int mileage;
	private String address;
	private String modelName;
	private int year;
	private String maker;
	private String ImgUrl; /// AWS S3
	private boolean status;
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	public CarRequest(String vin) {
		this.vin = vin;
	}
	public CarRequest() {
		
	} // if we still need java to recognize the default constructor after creating an overload constructor we put the code above.
	// anything that is sent from our UI, we need to allow those values to come in as they are. and we need the default constructor
	//if we want the value to become
	// immutable 
	public int getStockId() {
		return stockId;
	}
	public void setStockId(int stockId) {
		this.stockId = stockId;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public String getExteriorColor() {
		return exteriorColor;
	}
	public void setExteriorColor(String exteriorColor) {
		this.exteriorColor = exteriorColor;
	}
	public int getCityMPG() {
		return cityMPG;
	}
	public void setCityMPG(int cityMPG) {
		this.cityMPG = cityMPG;
	}
	public String getInteriorColor() {
		return interiorColor;
	}
	public void setInteriorColor(String interiorColor) {
		this.interiorColor = interiorColor;
	}
	public int getHighwayMPG() {
		return highwayMPG;
	}
	public void setHighwayMPG(int highwayMPG) {
		this.highwayMPG = highwayMPG;
	}
	public String getStock() {
		return stock;
	}
	public void setStock(String stock) {
		this.stock = stock;
	}
	public String getDriveTrain() {
		return driveTrain;
	}
	public void setDriveTrain(String driveTrain) {
		this.driveTrain = driveTrain;
	}
	public String getTransmission() {
		return transmission;
	}
	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getVin() {
		return vin;
	}
	/*public void setVin(String vin) {
		this.vin = vin;
	}*/
	public double getPrice() {
		return price;
	}

	
	public void setPrice(double price) { this.price = price;
	 
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getImgUrl() {
		return ImgUrl;
	}
	public void setImgUrl(String imgUrl) {
		ImgUrl = imgUrl;
	}

	
}
	

