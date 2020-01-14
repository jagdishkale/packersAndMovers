package com.app.pojos;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class Address 
{
	private int id;
	private User selectedUser;
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

	@Id
	@Column(name = "sr_no")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@OneToOne
	@JoinColumn(name = "user_id")	
	public User getSelectedUser() {
		return selectedUser;
	}

	public void setSelectedUser(User selectedUser) {
		this.selectedUser = selectedUser;
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
		return "Address [selectedUser=" + selectedUser + ", street=" + street + ", city=" + city + ", state=" + state
				+ ", country=" + country + ", pinCode=" + pinCode + "]";
	}

	
}
