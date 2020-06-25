package com.wipro.Capstone.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Motivator {
	@Id
	@GeneratedValue
	Long id;
	String fname,email,mobile, password;

	

	public Motivator(String fname, String email, String mobile, String password) {
		super();
		this.fname = fname;
		this.email = email;
		this.mobile = mobile;
		this.password = password;
	}

	public Motivator() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
