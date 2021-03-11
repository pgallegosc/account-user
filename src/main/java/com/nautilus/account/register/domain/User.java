package com.nautilus.account.register.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="User")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int id;
	private String user_name;
	private String email;
	private String name;
	private String last_name;
	private int phone_country_code;
	private int phone_number;
	private int security_code;
	private String device_fingerprints;
	public User(int id, String user_name, String email, String name, String last_name, int phone_country_code,
			int phone_number, int security_code, String device_fingerprints) {
		super();
		this.id = id;
		this.user_name = user_name;
		this.email = email;
		this.name = name;
		this.last_name = last_name;
		this.phone_country_code = phone_country_code;
		this.phone_number = phone_number;
		this.security_code = security_code;
		this.device_fingerprints = device_fingerprints;
	}
	
	 
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUser_name() {
		return user_name;
	}


	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLast_name() {
		return last_name;
	}


	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}


	public int getPhone_country_code() {
		return phone_country_code;
	}


	public void setPhone_country_code(int phone_country_code) {
		this.phone_country_code = phone_country_code;
	}


	public int getPhone_number() {
		return phone_number;
	}


	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}


	public int getSecurity_code() {
		return security_code;
	}


	public void setSecurity_code(int security_code) {
		this.security_code = security_code;
	}


	public String getDevice_fingerprints() {
		return device_fingerprints;
	}


	public void setDevice_fingerprints(String device_fingerprints) {
		this.device_fingerprints = device_fingerprints;
	}


	public User(){
		
		}


	@Override
	public String toString() {
		return "User [id=" + id + ", user_name=" + user_name + ", email=" + email + ", name=" + name + ", last_name="
				+ last_name + ", phone_country_code=" + phone_country_code + ", phone_number=" + phone_number
				+ ", security_code=" + security_code + ", device_fingerprints=" + device_fingerprints + "]";
	}
 

	

	
	
}

	