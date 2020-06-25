package com.wipro.Capstone.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Request {
  @Id
  @GeneratedValue
  Long id;
  
  String user_name,user_email,status;
  
  public Request()
  {  
  }
public Request(String user_name, String user_email,
		String status) {
	super();
	this.user_name = user_name;
	this.user_email = user_email;
	this.status = status;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getUser_name() {
	return user_name;
}

public void setUser_name(String user_name) {
	this.user_name = user_name;
}
public String getUser_email() {
	return user_email;
}

public void setUser_email(String user_email) {
	this.user_email = user_email;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}
  
}
