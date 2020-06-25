package com.wipro.Capstone.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Message {
	@Id
	@GeneratedValue
	Long id;
	String sender,msg_body;
	String [] Admin;
	String [] Motivator;
	String [] User;
	public Message()
	{
	
	}
	public Message(String sender, String msg_body, String[] admin,
			String[] motivator, String[] user) {
		super();
		this.sender = sender;
		this.msg_body = msg_body;
		Admin = admin;
		Motivator = motivator;
		User = user;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getMsg_body() {
		return msg_body;
	}
	public void setMsg_body(String msg_body) {
		this.msg_body = msg_body;
	}
	public String[] getAdmin() {
		return Admin;
	}
	public void setAdmin(String[] admin) {
		Admin = admin;
	}
	public String[] getMotivator() {
		return Motivator;
	}
	public void setMotivator(String[] motivator) {
		Motivator = motivator;
	}
	public String[] getUser() {
		return User;
	}
	public void setUser(String[] user) {
		User = user;
	}
	
	
	
}
