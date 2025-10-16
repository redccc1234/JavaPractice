package edu.kh.model.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import edu.kh.model.dto.Toy;

public class ToyService {

	private Scanner sc = new Scanner(System.in);
	
	Set<Toy> toySet = new HashSet<>();
	
	Map<Integer, String> map = new HashMap<>(); 
	
	
	
	public ToyService() {
		
		map.put(1, "면작물");
		map.put(2, "플라스틱");
		map.put(3, "유리");
		map.put(4, "고무");
		
	
		
		toySet.add(new Toy("마미롱레그", 8 ,36000 ,"분홍색", 19950805, map.get(1)+","+map.get(4)));
		toySet.add(new Toy("허기워기",5, 12000," 파란색", 19940312, map.get(1)+","+map.get(2)));
		toySet.add(new Toy("키시미시", 5 ,15000," 분홍색 ",19940505, map.get(1)+","+map.get(2)));
		toySet.add(new Toy("캣냅", 8, 27000," 보라색 ",19960128, map.get(1)+","+map.get(2)));
		toySet.add(new Toy("파피", 12, 57000," 빨간색", 19931225, map.get(1)+","+map.get(2)
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
			input = sc.nextInt();
			
			switch(input) {
			case 1 : lookToy(); break;
			case 2 : System.out.println(makeNewToy()); break;
			case 3 : deleteToy(); break;
			case 4 : lookDate(); break;
			case 5 :  lookAge();break;
			case 6 :  addIngr(); break;
			case 7 : /* removeIngr(); */ break;
			case 0 : System.out.println("프로그램 종료..."); break;
			default : System.out.println("해당하는 번호만 써주세요.");
			}
			
		} while (input !=0);
	}
	
	
	public void lookToy() {
		
			System.out.println("\n<전체 장난감 목록>");
			
			if(toySet.isEmpty()) {
				System.out.println("등록된 장난감이 없습니다.");
			}else {
				for(Toy temp : toySet) {
					System.out.println(temp);
				}	
			}
	}
	
	public String makeNewToy() {
		
		System.out.println("\n<새로운 장난감 추가>");

		System.out.print("장난감 이름 : ");
		String name = sc.next();
		
		System.out.print("사용 가능 연령 : ");
		int age = sc.nextInt();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		System.out.print("색상 : ");
		String color = sc.next();
		
		System.out.print("제조일 (YYYYMMDD 형식으로 입력) : ");
		int date = sc.nextInt();
		
		String input = "";
		
		do {
			System.out.print("재료를 입력하세요 (종료하려면 'q'를 입력하세요) : ");
			input = sc.next();
			
		} while (!(input.equals("q")));
		
		if(toySet.add(new Toy(name,age,price,color,date,input))) {
			return"새로운 장난감이 추가되었습니다.";
		}else {
			return"장난감 추가하기를 실패하였습니다.";
			}
		
	}
	
	public void deleteToy() {
		
		System.out.print("\n삭제할 장난감의 이름을 입력하세요 : ");
		String input = sc.next();
		
		for(Toy toy : toySet) {
			
			if(input.equals(toy.getToyname())) {
				
				toySet.remove(toy);
				
			System.out.println("장난감이 삭제되었습니다.");	
			
			}else {
				System.out.println("장난감 이름이 존재하지 않습니다.");
			}
		}
		
	}
	
	public void lookDate() {
		System.out.println("\n<제조일 순으로 장난감들을 정렬>");
	
		List<Toy> list = new ArrayList<Toy>(toySet);
		Collections.sort(list,Collections.reverseOrder()) ;
		for(Toy toy : list) {
			
			System.out.println(toy.getDate());
			
		}
		
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
	
	
	
	
	
	
	
	

