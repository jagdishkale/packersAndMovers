package com.app.pojos;

import javax.persistence.*;

@Entity
@Table(name = "login")
public class Login 
{
	private int id;
	private User user;
	private String email, password;
	
	public Login() 
	{
		System.out.println("in login ctor");
	}

	public Login(String email, String password) {
		super();
		this.email = email;
		this.password = password;
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
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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

	@Override
	public String toString() {
		return "Login [user=" + user + ", email=" + email + ", password=" + password + "]";
	}
	
}
