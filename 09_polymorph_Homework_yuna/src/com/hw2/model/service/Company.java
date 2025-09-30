package com.hw2.model.service;

import com.hw2.model.dto.Employee;
import com.hw2.model.dto.Person;

public class Company {

	private Employee[] employees;
	private int employeeCount = 0;
	
	
	public Company(int size) {
		employees = new Employee[size];
	}
	
	
	public void addPerson(Person person) {
		
	}
	
	public void removePerson(String id) {
		
	}
	
	public void  displayAllPersons() {
		
	}
}
