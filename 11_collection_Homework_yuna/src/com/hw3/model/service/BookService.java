package com.hw3.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hw3.model.dto.Book;

public class BookService {
	
	private List<Book> bookList = new ArrayList<>(); 
	
	
	private Scanner sc = new Scanner(System.in);
	
	public BookService() {}
	
	public void displayMeun() {
		
		int input = 0;
		
		do {
			
			System.out.println("=== 도서 목록 프로그램 ===");
			System.out.println("1.도서 등록");
			System.out.println("2.도서 조회");
			System.out.println("3.도서 수정");
			System.out.println("4.도서 삭제");
			System.out.println("5.즐겨찾기 추가");
			System.out.println("6.즐겨찾기 삭제");
			System.out.println("7.즐겨찾기 조회");
			System.out.println("8.추천도서 뽑기");
			System.out.println("0.프로그램 종료");
			
			System.out.print("메뉴를 입력하세요 : ");
			input = sc.nextInt();
			
			switch(input) {
			
			case 1 : System.out.println(bookSignup()); break; 
			case 2 : bookSelect(); break; 
			case 3 : /*bookUpdata();*/ break; 
			case 4 : /*bookDelect();*/ break; 
			case 5 : /*bookmarkAdd();*/ break; 
			case 6 : /*bookmarkDelect();*/ break; 
			case 7 : /*bookmarkSelect();*/ break; 
			case 8 : /*Drawing();*/ break; 
			case 0 : System.out.println("프로그램을 종료하겠습니다!!"); break; 
			default : System.out.println("해당되는 번호만 입력해주세요!!");
			
			}
	
			
		}while(input != 0);
		
		
	}
	
	
	public String bookSignup() {
		
		System.out.println("========도서 등록========");
		
		System.out.print("도서 번호 : ");
		int num = sc.nextInt();
		
		System.out.print("도서 제목 : ");
		String name = sc.next();
		
		System.out.print("도서 저자 : ");
		String author = sc.next();
		
		System.out.print("도서 가격 : ");
		int price = sc.nextInt();
		
		System.out.print("도서 출판사 : ");
		String publication = sc.next();
		
		
		if( bookList.add(new Book(num,name,author,price,publication))) {
			return "등록 완료";
			
		}else {
			return "등록 실패";
		}

	}
	
	public void bookSelect() {
		
		if(bookList.isEmpty()) {
			System.out.println("책에 대한 정보가 없습니다.");
		}
		
		
		for( Book book : bookList ) {
			
		 book.toString();	
		}
	
	}
	
	public void bookUpdata() {
		
		if(bookList.isEmpty()) {
			System.out.println("책에 대한 정보가 없습니다.");
		}
		
		int input = 0;
		do {
			
			 
			System.out.println("1.도서명");
			System.out.println("2.도서 저자");
			System.out.println("3.도서 가격");
			System.out.println("4.도서 출판사");
			System.out.println("0.수정종료");
			
			System.err.print("어떤 정보를 수정하시겠습니까? ");
			input = sc.nextInt();
			
		}while(input != 0);
		
		
	}
}
