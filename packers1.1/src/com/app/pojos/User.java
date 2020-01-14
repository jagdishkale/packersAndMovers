package com.app.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User 
{
	private int id;
	private String name, email, password;
	private Address address;
	private String phoneNo;
	private List<Orders>orderList = new ArrayList<>();	
	List<Feedback>listOfFeedbacks = new ArrayList<>();
	
	public User() 
	{
		System.out.println("in user ctor");
	}

	public User(String name, String email, String password, String phoneNo) 
	{
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.phoneNo = phoneNo;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(length = 50)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Column(length = 50, unique = true)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	@Column(length = 50)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@OneToOne(mappedBy = "selectedUser", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	@Column(length = 50)
	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	@OneToMany(mappedBy = "selectedUser", cascade = CascadeType.ALL,  orphanRemoval = true)
	public List<Orders> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<Orders> orderList) {
		this.orderList = orderList;
	}
	@OneToMany(mappedBy = "selectedUser", cascade = CascadeType.ALL, orphanRemoval = true)
	public List<Feedback> getListOfFeedbacks() {
		return listOfFeedbacks;
	}

	public void setListOfFeedbacks(List<Feedback> listOfFeedbacks) {
		this.listOfFeedbacks = listOfFeedbacks;
	}

	@Override
	public String toString() 
	{
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + ", phoneNo="
				+ phoneNo + "]";
	}	
}
