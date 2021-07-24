package com.aipalbot.carsales.webservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CAR_STOCK_TBL")
public class StockEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long stockId;
	
	@Column
	private String vin;
	
	@Column
	private double price;
	
	@Column
	private int mileage;
	
	@Column
	private boolean status;
	
	@Column
	private String carImageUrl;
	
	@Column
	private String engine;
	
	@Column
	private String maker;
	
	@Column
	private int year;
	
	
	
	
	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

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

	public String getCarImageUrl() {
		return carImageUrl;
	}

	public void setCarImageUrl(String carImageUrl) {
		this.carImageUrl = carImageUrl;
	}

	

	@Override
    public String toString() {
        return "CarEntity [stockId=" + stockId + ", vin=" + vin + 
                ", price=" + price + ", mileage=" + mileage   + ", status = "+status + "]";
		}
	
	//@GenerateValue sets it to generate id automatically, remember it goes with @id.
	//  @Column(name="Car_Price") we use this if we want the column to have a different
	// name from the attribute price.
	
	
	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public Long getStockId() {
		return stockId;
	}

	public void setStockId(Long stockId) {
		this.stockId = stockId;
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

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	
}
	
