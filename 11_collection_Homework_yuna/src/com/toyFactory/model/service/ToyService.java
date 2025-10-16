package com.toyFactory.model.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.toyFactory.model.dto.Toy;

public class ToyService {
	// 입력용 객체
	private Scanner sc = new Scanner(System.in);
	
	// 중복된 Toy 객체가 없도록 저장할 컬렉션 중 Set
	private Set<Toy> toySet = new HashSet<>();
	
	// 재료가 저장되어있는 map
	private Map<Integer, String> map = new HashMap<>(); 
	
	// 기본 생성자
	public ToyService() {
		
		map.put(1, "면작물");
		map.put(2, "플라스틱");
		map.put(3, "유리");
		map.put(4, "고무");
		
		toySet.add(new Toy("마미롱레그", 8 ,36000 ,"분홍색", "19950805", map.get(1)+","+map.get(4)));
		toySet.add(new Toy("허기워기",5, 12000," 파란색", "19940312", map.get(1)+","+map.get(2)));
		toySet.add(new Toy("키시미시", 5 ,15000," 분홍색 ","19940505", map.get(1)+","+map.get(2)));
		toySet.add(new Toy("캣냅", 8, 27000," 보라색 ","19960128", map.get(1)+","+map.get(2)));
		toySet.add(new Toy("파피", 12, 57000," 빨간색", "19931225", map.get(1)+","+map.get(2)
		+map.get(4)));
		
		
	}
	
	public void displayMenu() {
		
		int input = 0;
		
		do {
			
			System.out.println("\n<<플레이타임 공장>>");
			System.out.println("1. 전체 장난감 조회하기");
			System.out.println("2. 새로운 장난감 만들기");
			System.out.println("3. 장난감 삭제하기");
			System.out.println("4. 장난감 제조일 순으로 조회하기");
			System.out.println("5. 연령별 사용 가능한 장난감 리스트 조회하기");
			System.out.println("6. 재료 추가");
			System.out.println("7. 재료 제거");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 : ");
			
			try {
			
			input = sc.nextInt();
				
			switch(input) {
			case 1 : lookToy(); break;
			case 2 : makeNewToy(); break;
			case 3 : deleteToy(); break;
			case 4 : lookDate(); break;
			case 5 :  lookAge();break;
			case 6 :  addIngr(); break;
			case 7 : /* removeIngr(); */ break;
			case 0 : System.out.println("프로그램 종료..."); break;
			default : System.out.println("해당하는 번호만 써주세요.");
			}
			
			}catch(Exception e) {
				System.out.println("알맞은 입력을 해라..(경고)..");
				e.printStackTrace();
				
				sc.nextLine(); // 입력버퍼에 남은 잘못된 문자 비우기
				
				input = -1; // 첫 반복에서 예외 발생 시 종료되지 않도록 input 값을 임의의 값으로 세팅
				
			}
			
		} while (input !=0);
		
	}
	
	
	/**
	 * 1. 전체 장난감 조회하기
	 */
	public void lookToy() {
		
		System.out.println("\n<전체 장난감 목록>");
			
		if(toySet.isEmpty()) {
			System.out.println("등록된 장난감이 없습니다.");
			}
			
		int index = 1;
			for( Toy toy : toySet) {
				System.out.println(index +"."+ toy);
				index++;
			}
			
			
	}
	
	/**
	 * 2. 새로운 장난감 만들기
	 */
	public void makeNewToy() {
		
		System.out.println("\n<새로운 장난감 추가>");
		
		// 장난감 이름 입력 받음
		// -> 이미 존재하는 장난감 인지 이름으로 확인
		System.out.print("장난감 이름 : ");
		String name = sc.next();
		
		for( Toy toy : toySet) {
			
			if(toy.getToyname().equals(name)) {
				System.out.println("이미 같은 이름을 가진 장난감이 존재합니다.");
				return;
			}
		}
		
		System.out.print("사용 가능 연령 : ");
		int age = sc.nextInt();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		System.out.print("색상 : ");
		String color = sc.next();
		
		System.out.print("제조일 (YYYYMMDD 형식으로 입력) : ");
		String date = sc.next();
		
		Set<String>	ingredient	= new HashSet<String>(); // 재료를 저장할 set객체 생성
		
		System.out.println("사용 가능한 재료 목록");
		
	
		
	}
	
	/**
	 * 3. 장난감 삭제하기
	 */
	public void deleteToy() {
		
		System.out.println("\n<장난감 삭제>");
		
		if(toySet.isEmpty()) {
			System.out.println("등록된 장난감이 없습니다");
			return;
		}
		
		System.out.print("삭제할 장난감의 이름을 입력하세요 : ");
		String toyName = sc.next();
		
		boolean flag = false; // 같은 이름인 장난감을 찾았다
		
		for(Toy toy : toySet) {
			
			if(toy.getToyname().equals(toyName)) {
				
				toySet.remove(toy);
				flag = true;
				break; 
				// 1. 효율 향상을 위해 break;
				// 2. 순회중인 컬렉션 객체가 수정되어 충돌한단 예외 발생
				//  -> 예외방지, 효율을 위해 작성		
			}
		}
		
		if(flag) {
			System.out.println("장난감이 삭제되었습니다.");
		}else {
			System.out.println("해당하는 이름의 장난감이 없습니다.");
		}
	}
	
	/**
	 * 4. 제조일 순으로 장난감 정렬하기
	 */
	public void lookDate() {
		System.out.println("\n<제조일 순으로 장난감들을 정렬>");
		
		if(toySet.isEmpty()) {
			System.out.println("등록된 장난감이 없습니다");
			return;
		}
	
		List<Toy> list = new ArrayList<Toy>(toySet);
		
		// 제조일 오름차순으로 정렬하기 위한 compartor 구현 내부 클래스
		Collections.sort(list,new Comparator<Toy>() {

			@Override
			public int compare(Toy o1, Toy o2) {
				// TODO Auto-generated method stub
				return 0;
			}
			});
		
			
		
		
	}
	
	public void lookAge() {
		System.out.println("\n<연령별로 사용 가능한 장난감>");
		
		for(Toy toy : toySet) {
			
			System.out.println("[연령 :"+ toy.getAge() + "세]");
			System.out.println(toy);
			
		}
		
	}
	
	public void addIngr() {
		
		System.out.println("\n<재료 추가>");
		System.out.println("---현재 등록된 재료---");
		
		System.out.println(map.get(1));
		System.out.println(map.get(2));
		System.out.println(map.get(3));
		System.out.println(map.get(4));
		
		System.out.println("-----------------");
		
		System.out.print("재료 고유번호(key)입력 :" );
		int key = sc.nextInt();
		sc.nextLine();
		
		System.out.print("재료명 입력 :");
		String value = sc.nextLine();
		
	
		
		}	
	}
	
