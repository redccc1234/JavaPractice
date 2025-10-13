package com.hw3.model.dto;

public class Book {

	private String name;
	private String author;
	private int num;
	private String publication;
	private int price;
	
	
	public Book() {}
	
	

	public Book(String name, String author, int num, String publication, int price) {
		super();
		this.name = name;
		this.author = author;
		this.num = num;
		this.publication = publication;
		this.price = price;
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



	public int getNum() {
		return num;
	}



	public void setNum(int num) {
		this.num = num;
	}



	public String getPublication() {
		return publication;
	}



	public void setPublication(String publication) {
		this.publication = publication;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	@Override
	public String toString() {
		return num +"번 도서 : [ 도서제목 : " + name + "/  도서저자 : " + author +"/ 도서가격 : " + price 
				+"원 / 출판사 : "+publication+"]";
	}
	
	
	
}
