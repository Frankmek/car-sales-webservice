package com.aipalbot.carsales.webservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USERS_TBL")
public class UserEntity {
	
	/*
	 * @GeneratedValue(strategy = GenerationType.IDENTITY) private int userId;
	 */
	

	@Id
	@Column(unique = true)
	private String email;
	
	@Column
	private String password;
	
	@Column
	private String role; // admin or normal
	
	@Column
	private String firstName;
	
	@Column
	private String lastName;
	

	/*
	 * public int getUserId() { return userId; }
	 * 
	 * public void setUserId(int userId) { this.userId = userId; }
	 */

	
	public String getEmail() {
		return email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	
}
