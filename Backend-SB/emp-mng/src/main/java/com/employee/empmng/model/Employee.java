package com.employee.empmng.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Employee {

	@Id
	private long empId;
	private String firstName;
	private String lastName;
	private String emailId;

	public Employee() {
		super();
	}

	public Employee(long empId, String firstName, String lastName, String emailId) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
	}

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

}
