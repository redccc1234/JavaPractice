package com.hw3.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hw3.model.dto.Book;


public class BookService {

	private Scanner sc = new Scanner(System.in);

	// 도서를 저장할 목록 List
	private List<Book> bookList = new ArrayList<Book>();

	// 즐겨찾기 도서를 저장할 목록 List
	private List<Book> favList = new ArrayList<Book>();

	public BookService() {

		bookList.add(new Book("세이노의 가르침", "세이노", 6480, "데이원", 1111));
		bookList.add(new Book("문과남자의 과학공부", "유시민", 15750, "돌배게", 2222));
		bookList.add(new Book("역행자", "자청", 17550, "웅진지식하우스", 3333));
		bookList.add(new Book("꿀벌의 예언", "베르나르 베르베르", 15120, "열린책들", 4444));
		bookList.add(new Book("도둑맞은 집중력", "요한 하리", 16920, "이크로스", 5555));
	}

	
	public void displayMeun() {

		try {
			
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

			switch (input) {

			case 1:
				System.out.println(bookSignup());
				break;
			case 2:
				bookSelect(bookList);
				break;
			case 3:
				System.out.println(bookUpdata());; break;
			case 4:
				System.out.println(bookDelect());break;
			case 5:
				 bookmarkAdd(); break;
			case 6:
				 bookmarkDelect();  break;
			case 7:
				 bookmarkSelect(favList);break;
			case 8:
				 Drawing(); break;
			case 0:
				System.out.println("프로그램을 종료하겠습니다!!");
				break;
			default:
				System.out.println("해당되는 번호만 입력해주세요!!");

			}

		} while (input != 0);

	}catch(Exception e) {
		// Exception : 예외 클래스의 최상위 클래스
		System.out.println("예외발생");
		e.printStackTrace(); // 예외추적
	}
	
	}

	/**
	 * 1. 도서 등록 메서드
	 */
	public String bookSignup() {

		System.out.println("========도서 등록========");

		System.out.print("도서 번호 : ");
		int num = sc.nextInt();
		sc.nextLine(); // 입력버퍼에 남은 개행문자 제거용

		System.out.print("도서 제목 : ");
		String name = sc.next();

		System.out.print("도서 저자 : ");
		String author = sc.next();

		System.out.print("도서 가격 : ");
		int price = sc.nextInt();
		// 입력버퍼에 남은 개행문자 제거용

		System.out.print("도서 출판사 : ");
		String publication = sc.next();

		Book newBook = new Book( name, author,price, publication,num);
			
			bookList.add(newBook);
			return "등록 완료";
	
	}

	/**
	 * 2. 도서 목록 조회용 메서드
	 */
	public void bookSelect(List<Book> list) {

		if (bookList.isEmpty()) {
			System.out.println("책에 대한 정보가 없습니다.");
		}else {
		
		// list를 순회하면서 각 Book 객체를 출력
		for (Book book : bookList) {
			System.out.println(book); // Book.toString();
			}
		}
	}

	/**
	 * 3. 도서 수정용 메서드
	 */
	public String bookUpdata() {

		bookSelect(bookList); // 등록된 도서 출력
		
		System.out.println("======도서 수정======");

		int input = 0; // 수정 메뉴 선택용 변수
		
		System.out.print("수정할 도서 번호를 입력하세요 : ");
		input = sc.nextInt();
		
		for(Book temp : bookList){
		
			if(temp.getNum() == input) {// 입력한 도서번호와 도서 목록의 도서 번호가 일치하는 걸 찾았을 때
				
		do {

			System.out.println("1.도서명");
			System.out.println("2.도서 저자");
			System.out.println("3.도서 가격");
			System.out.println("4.도서 출판사");
			System.out.println("0.수정종료");

			System.err.print("어떤 정보를 수정하시겠습니까? ");
			int result = sc.nextInt();

			switch (result) {
			
			case 1: System.out.println("==도서명 수정==");
					System.out.print("수정할 도서명을 입력하세요 :");
					String name = sc.nextLine();
					temp.setName(name);
					System.out.println("도서명 수정 완료");
					break;
					
			case 2:	System.out.println("==도서 저자 수정==");
					System.out.print("수정할 저자명을 입력하세요 :");
					String author = sc.nextLine();
					temp.setAuthor(author);
					System.out.println("저자명 수정 완료");
					break;
					
			case 3:	System.out.println("==도서 가격 수정==");	
					System.out.print("수정할 가격을 입력하세요 :");
					int price = sc.nextInt();
					temp.setPrice(price);
					System.out.println("가격 수정 완료");
					break;
					
			case 4:	System.out.println("==도서 출판사 수정==");	
					System.out.print("수정할 출판사를 입력하세요 :");
					String publication = sc.nextLine();
					temp.setPublication(publication);
					System.out.println("출판사명 수정 완료");
					break;
					
			case 0:	System.out.println("도서 수정을 종료하겠습니다."); break;
			default: System.out.println("해당되는 번호만 입력해주세요.");
				
			}
	
		} while (input != 0);
		
		return"==모든 수정 완료==";
		
		}
			
	}// for 문 끝
	
	return"일치하는 도서가 없습니다.";
	
	}
	
	/**
	 * 4.도서 삭제 메서드
	 * @return
	 */
	public String bookDelect() {
		
		System.out.println("====도서 삭제====");
		bookSelect(bookList);
		
		System.out.print("삭제할 도서의 번호를 입력하세요 :");
		int input = sc.nextInt();
		
		for(Book book : bookList) {
			
			if(book.getNum()==input) {
				
				int index = bookList.indexOf(book);
				// int List.indexOf(odject) : List에 일치하는 객체가 있으면 
				// 그 객체가 있는 index번호 반환 
				
				// system.out.println("index 번호 : " + index);
				
				System.out.print("정말 삭제하시겠습니까? (Y/N)");
				char result = sc.next().toUpperCase().charAt(0);
			
				if(result == 'Y') {
					bookList.remove(index);
					break;
				}else {
					return"삭제를 진행하지 않습니다.";
				}
			}
		}
		
		return"삭제가 완료되었습니다.";

	}
	
	/**
	 * 5.즐겨찾기 추가
	 */
	public void bookmarkAdd() {
		
		System.out.println("=======즐겨찾기 추가======");
		
		System.out.print("즐겨찾기 할 도서 번호 :");
		int num = sc.nextInt();
		
		for(Book book : favList) {
			
			if(book.getNum()==num) {
			favList.add(book);
			System.out.println(num + "번 도서가 즐겨찾기에 추가 되었습니다.");
			return;
			}
		}	
		System.out.println("해당 번호의 도서가 존재하지 않습니다.");
	}
	
	/**
	 * 6. 즐겨찾기 삭제
	 */
	public void  bookmarkDelect() {
		
		System.out.println("======즐겨찾기 삭제======");
		
		System.out.print("삭제할 도서 번호 : ");
		int num = sc.nextInt();
		
		for(Book book : favList) {
			
			if(book.getNum()==num) {
				favList.remove(book);
				System.out.println(num +"번 도서가 삭제 되었습니다.");
				return;
			}
		}
		
		System.out.println("해당 번호의 도서가 존재하지 않습니다.");
	}
	
	/**
	 * 7. 즐겨찾기 조회
	 */
	public void bookmarkSelect(List<Book>favList) {
		
		for( Book book : favList) {
			System.out.println(book);
		}
	}
	
	/**
	 * 8. 추천도서 뽑기
	 */
	public void Drawing() {
		
		int size = bookList.size();
		
		int random = (int)(Math.random()*size); // 0~ 리스트의 마지막 번호
		
		System.out.println(bookList.get(random).getName());
		
	}
}