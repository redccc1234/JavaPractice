package com.hw3.model.dto;

public class Book {

	private int num;
	private String name;
	private String author;
	private int price;
	private String publication;
	
	public Book() {}
	
	public Book(int num, String name, String author, int price, String publication) {
		super();
		this.num = num;
		this.name = name;
		this.author = author;
		this.price = price;
		this.publication = publication;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}

	@Override
	public String toString() {
		return num +"번 도서 : [ 도서제목 : " + name + "/  도서저자 : " + author +"/ 도서가격 : " + price 
				+"원 / 출판사 : "+publication+"]";
	}
	
	
	
}
