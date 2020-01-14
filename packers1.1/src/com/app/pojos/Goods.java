package com.app.pojos;

import javax.persistence.*;

@Entity
@Table(name = "goods")
public class Goods 
{
	private int id;
	private String name;
	private double charges;
	
	public Goods() 
	{
		System.out.println("in ctor of "+getClass().getName());
	}

	public Goods(String name, double charges) {
		super();		
		this.name = name;
		this.charges = charges;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sr_no")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "item_name", length = 50)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Column(name = "charges_per_kg")
	public double getCharges() {
		return charges;
	}

	public void setCharges(double charges) {
		this.charges = charges;
	}

	@Override
	public String toString() {
		return String.format("Goods [id=%s, name=%s, charges=%s]", id, name, charges);
	}	
	
}
