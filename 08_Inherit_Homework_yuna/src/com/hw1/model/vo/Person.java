package com.hw1.model.vo;

public class Person {

	protected String name;
	// 상속받은 후손클래스에서 직접 접근 가능함
	private int age;
	private double height;
	private double weight;
	
	public Person() {}

	public Person( int age, double height, double weight) {
		super();
		
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	public String information() {
		return String.format("이름 : %s / 나이 : %d / 신장 : %.1f / 몸무게 : %.1f", 
									name, age, height, weight);
}
}