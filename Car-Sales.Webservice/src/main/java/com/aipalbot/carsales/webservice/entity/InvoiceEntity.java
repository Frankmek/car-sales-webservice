package com.aipalbot.carsales.webservice.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "INVOICE_TBL")
public class InvoiceEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int invoiceId;
	
	@Column
	private String vin;
	
	@Column
	private String modelName;
	
	@Column
	private String carYear;
	
	@Column
	private String make;
	
	@Column
	private String customerName;
	
	@Column
	private String salesAddress;
	
	@Column
	private String salesPhoneNumber;
	
	@Column
	private double amount;
	
	@Column
	private double tax;
	
	@Column
	private double totalAmount;
	
	@Column
	private Timestamp paidDate;
	
	@Column
	private Timestamp deliveryDate;
}
