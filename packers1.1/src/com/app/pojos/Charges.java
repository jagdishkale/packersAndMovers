package com.app.pojos;

import javax.persistence.*;

@Entity
@Table(name = "charges")
public class Charges 
{
	private int id;
	private String from, to;
	private double deliveryCharges;
	
	public Charges() 
	{
		System.out.println("in ctor of "+getClass().getName());
	}

	public Charges(String from, String to, double deliveryCharges) {
		super();
		this.from = from;
		this.to = to;
		this.deliveryCharges = deliveryCharges;
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

	@Column(name = "from_city", length = 50)
	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}
	@Column(name = "to_city", length = 50)
	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}
	@Column(name = "delivery_charges")
	public double getDeliveryCharges() {
		return deliveryCharges;
	}

	public void setDeliveryCharges(double deliveryCharges) {
		this.deliveryCharges = deliveryCharges;
	}

	@Override
	public String toString() {
		return String.format("Charges [from=%s, to=%s, deliveryCharges=%s]", from, to, deliveryCharges);
	}
	
}
