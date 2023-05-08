package com.capstone.employee.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
	
@Id
	
	private int employeeID;
	
	private String employeeName;
	
	
	private Date dateOfBirth;


	public int getEmployeeID() {
		return employeeID;
	}


	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}


	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	public Date getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public Employee(int employeeID, String employeeName, Date dateOfBirth) {
		super();
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.dateOfBirth = dateOfBirth;
	}


	public Employee() {
		super();
	}
	


	



}
