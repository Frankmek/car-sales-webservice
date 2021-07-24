package com.aipalbot.carsales.webservice.response;

public class CarResponse {
	
		private String fuelType;
		private String exteriorColor;
		private String interiorColor;
		private String vin;
		private String transmission;
		private double price;
		private int mileage;
		private boolean isNew;
		private String modelName;
		private int year;
		private String maker;
		
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
		public String getInteriorColor() {
			return interiorColor;
		}
		public void setInteriorColor(String interiorColor) {
			this.interiorColor = interiorColor;
		}
		public String getVin() {
			return vin;
		}
		public void setVin(String vin) {
			this.vin = vin;
		}
		public String getTransmission() {
			return transmission;
		}
		public void setTransmission(String transmission) {
			this.transmission = transmission;
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
		public boolean isNew() {
			return isNew;
		}
		public void setNew(boolean isNew) {
			this.isNew = isNew;
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
		
}
