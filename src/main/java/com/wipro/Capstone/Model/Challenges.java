package com.wipro.Capstone.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Challenges {
	@Id
	@GeneratedValue
	Long id;
	String name,batch,quarter,groupName;
	String [] mentorName;

	public Challenges() {
	}

	public Challenges(String name, String[] mentorName, String batch,
			String quarter, String groupName) {
		super();
		this.name = name;
		this.mentorName = mentorName;
		this.batch = batch;
		this.quarter = quarter;
		this.groupName = groupName;
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

	public String getBatch() {
		return batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}

	public String getQuarter() {
		return quarter;
	}

	public void setQuarter(String quarter) {
		this.quarter = quarter;
	}


	public String[] getMentorName() {
		return mentorName;
	}


	public void setMentorName(String[] mentorName) {
		this.mentorName = mentorName;
	}


	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

}
