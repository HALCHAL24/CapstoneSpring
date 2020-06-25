package com.wipro.Capstone.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue
	Long id;
	String  name, gender, email, address, city, state, country,reason,
			existing_Medical, existing_Diet, pregnant,password,challenge_name,challenge_batch,challenge_group;
	int age, mobile, pincode, height, weight, u_BMI, code;
    public User()
    {
    	
    }
	public User(String name, String gender, String email, String address,
			String city, String state, String country, String reason,
			String existing_Medical, String existing_Diet, String pregnant,
			String password, String challenge_name, String challenge_batch,
			String challenge_group, int age, int mobile, int pincode,
			int height, int weight, int u_BMI, int code) {
		super();
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.address = address;
		this.city = city;
		this.state = state;
		this.country = country;
		this.reason = reason;
		this.existing_Medical = existing_Medical;
		this.existing_Diet = existing_Diet;
		this.pregnant = pregnant;
		this.password = password;
		this.challenge_name = challenge_name;
		this.challenge_batch = challenge_batch;
		this.challenge_group = challenge_group;
		this.age = age;
		this.mobile = mobile;
		this.pincode = pincode;
		this.height = height;
		this.weight = weight;
		this.u_BMI = u_BMI;
		this.code = code;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getExisting_Medical() {
		return existing_Medical;
	}
	public void setExisting_Medical(String existing_Medical) {
		this.existing_Medical = existing_Medical;
	}
	public String getExisting_Diet() {
		return existing_Diet;
	}
	public void setExisting_Diet(String existing_Diet) {
		this.existing_Diet = existing_Diet;
	}
	public String getPregnant() {
		return pregnant;
	}
	public void setPregnant(String pregnant) {
		this.pregnant = pregnant;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getChallenge_name() {
		return challenge_name;
	}
	public void setChallenge_name(String challenge_name) {
		this.challenge_name = challenge_name;
	}
	public String getChallenge_batch() {
		return challenge_batch;
	}
	public void setChallenge_batch(String challenge_batch) {
		this.challenge_batch = challenge_batch;
	}
	public String getChallenge_group() {
		return challenge_group;
	}
	public void setChallenge_group(String challenge_group) {
		this.challenge_group = challenge_group;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getU_BMI() {
		return u_BMI;
	}
	public void setU_BMI(int u_BMI) {
		this.u_BMI = u_BMI;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
}
