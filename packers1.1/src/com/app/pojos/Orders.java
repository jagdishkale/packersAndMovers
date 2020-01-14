package com.app.pojos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class Orders 
{
	private User selectedUser;
	private int id;
	private String shiftFrom, shiftTo;
	private ServiceType service;
	private LocalDate orderDate;	
	private Charges charges;
	private List<Goods>listOfGoods = new ArrayList<Goods>();
	
	public Orders() {
	System.out.println("in orders ctor");
	}
	
	public Orders(String shiftFrom, String shiftTo, ServiceType service, LocalDate orderDate) {
		super();
		this.shiftFrom = shiftFrom;
		this.shiftTo = shiftTo;
		this.service = service;
		this.orderDate = orderDate;
	}	
	@OneToMany
	@JoinColumn(name = "goods_id")
	public List<Goods> getListOfGoods() {
		return listOfGoods;
	}

	public void setListOfGoods(List<Goods> listOfGoods) {
		this.listOfGoods = listOfGoods;
	}

	@OneToOne
	@JoinColumn(name = "charges_id")
	public Charges getCharges() {
		return charges;
	}

	public void setCharges(Charges charges) {
		this.charges = charges;
	}

	@ManyToOne()
	@JoinColumn(name = "user_id")
	public User getSelectedUser() {
		return selectedUser;
	}

	public void setSelectedUser(User selectedUser) {
		this.selectedUser = selectedUser;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@Column(name = "shift_from", length = 50)
	public String getShiftFrom() {
		return shiftFrom;
	}

	public void setShiftFrom(String shiftFrom) {
		this.shiftFrom = shiftFrom;
	}
	@Column(name = "shift_to", length = 50)
	public String getShiftTo() {
		return shiftTo;
	}

	public void setShiftTo(String shiftTo) {
		this.shiftTo = shiftTo;
	}
	@Enumerated(EnumType.STRING)
	@Column(name = "service_type")
	public ServiceType getService() {
		return service;
	}

	public void setService(ServiceType service) {
		this.service = service;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	@Override
	public String toString() {
		return String.format(
				"Orders [selectedUser=%s, id=%s, shiftFrom=%s, shiftTo=%s, service=%s, orderDate=%s, charges=%s]",
				selectedUser, id, shiftFrom, shiftTo, service, orderDate, charges);
	}

	
}
