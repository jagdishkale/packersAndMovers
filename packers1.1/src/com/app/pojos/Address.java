package com.app.pojos;

import javax.persistence.*;

@Embeddable
public class Address 
{	
	private String street, city, state, country;
	private int pinCode;
	
	public Address() {
		System.out.println("in address ctor");
	}

	public Address(String street, String city, String state, String country, int pinCode) 
	{
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pinCode = pinCode;
	}	
	@Column(length = 50)
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}
	@Column(length = 50)
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	@Column(length = 50)
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	@Column(length = 50)
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}	
	@Column(name = "pin_code")
	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return String.format("Address [street=%s, city=%s, state=%s, country=%s, pinCode=%s]", street, city, state,
				country, pinCode);
	}	
	
}
