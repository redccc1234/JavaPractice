package com.hw2.model.service;

import com.hw2.model.dto.Person;

public interface ManagementSystem {// 관리 시스템 인터페이스

	public abstract void addPerson(Person person);
	
	public abstract void removePerson(String id);
	
	public abstract void displayAllPersons();
	
}
