package com.aipalbot.carsales.webservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "INSURANCE_TBL")

public class InsuranceEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int insureId;
	
	@Column
	private String vin;
	
	@Column
	private String insureName;
	
	@Column
	private String insureEmail;
	
	@Column
	private String insurePhoneNumber;
	
	@Column
	private String insureDuration;
	
	@Column
	private String insureExtension;
	
}
