package com.app.pojos;

import javax.persistence.*;

@Entity
@Table(name = "feedback")
public class Feedback 
{
	private int id;
	private User selectedUser;
	private String comments;
	
	public Feedback() 
	{
		System.out.println("in ctor of "+getClass().getName());
	}

	public Feedback(String comments) 
	{		
		this.comments = comments;
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
	@ManyToOne
	@JoinColumn(name = "user_id")
	public User getSelectedUser() {
		return selectedUser;
	}

	public void setSelectedUser(User selectedUser) {
		this.selectedUser = selectedUser;
	}
	@Column(name = "comments", length = 50)
	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return String.format("Feedback [selectedUser=%s, comments=%s]", selectedUser, comments);
	}
	
	
}
