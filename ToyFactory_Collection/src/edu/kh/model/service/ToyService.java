package edu.kh.model.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import edu.kh.model.dto.Toy;

public class ToyService {

	// 입력용 객체
	private Scanner sc = new Scanner(System.in);
	// 중복된 toy 객체가 없도록 저장할 컬렉션 중 Set
	private Set<Toy> toySet = new HashSet<>();
	// 재료가 저장되어 있는 Map
	private Map<Integer, String> map = new HashMap<>(); 
	
	
	// 기본 생성자
	public ToyService() {
		
		map.put(1, "면작물");
		map.put(2, "플라스틱");
		map.put(3, "유리");
		map.put(4, "고무");
		
		                                                                  // 가변인자
		toySet.add(new Toy("마미롱레그", 8 ,36000 ,"분홍색", "19950805" , addMap(1,4)));
		toySet.add(new Toy("허기워기",5, 12000," 파란색", "19940312",  addMap(1,4)));
		toySet.add(new Toy("키시미시", 5 ,15000," 분홍색 ","19940505", addMap(1,4)));
		toySet.add(new Toy("캣냅", 8, 27000," 보라색 ","19960128", addMap(1,4)));
		toySet.add(new Toy("파피", 12, 57000," 빨간색", "19931225", addMap(1,4)));
		
		
	}
	
	private Set<String> addMap(int... materials) {

		// 1. 매개변수로 전달받은 materials 파악하기 == 배열로 정수형 데이터가 여러개
		// ex) [1,2,4]

		// 2. 재료를 저장하여 반환할 Set객체를 생성
		Set<String> addedMaterials = new HashSet<String>();

		// 3. addedMaterials 에 재료명을 추가해야함
		// -> 단, 재료는 Map에 존재하는 것만 추가 가능
		for (int materialKey : materials) {

			// Map에서 재료 고유 번호(Key)에 대응하는 재료명(Value)를 가져와서
			// addedMaterials 추가
			// map에 없는 key를 입력하여 value를 얻어왔을 때 == null
			String materialValue = map.get(materialKey);

			if (materialValue != null) {
				// 재료 목록에 해당 키(재료)가 있을 때
				addedMaterials.add(materialValue);
			}
		}

		return addedMaterials; // [면직물, 플라스틱]
	}








	public void displayMenu() {
		
		int input = 0;
		
		do {
			
			try {
				
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
				case 2 : makeNewToy(); break;
				case 3 : deleteToy(); break;
				case 4 : lookDate(); break;
				case 5 :  lookAge();break;
				case 6 :  addIngr(); break;
				case 7 : /* removeIngr(); */ break;
				case 0 : System.out.println("프로그램 종료..."); break;
				default : System.out.println("해당하는 번호만 써주세요.");
				}
				 
				
			}catch(InputMismatchException e) {
				
			System.out.println("\n잘못입력하셨습니다\n");
				
			input = -1; // 잘못입력해서 while문이 멈추는 것을 방지
			sc.nextLine(); // 입력버퍼에 잘못입력된 문자 제거
				
			} catch (Exception e) { 
				
				e.printStackTrace();
			}	
				
			} while (input != 0 );
			
		
	}
	
	
	/**
	 * 1. 전체 장난감 조회하는 기능
	 */
	public void lookToy() {
		
			System.out.println("\n<전체 장난감 목록>\n");
			
			if(toySet.isEmpty()) {
				System.out.println("등록된 장난감이 없습니다.");
			}else { // 하나씩 접근해서 전체 장난감 출력
				
				for(Toy temp : toySet) {
					System.out.println(temp);
				}	
			}
	   }  
	
	
	/** 2. 새로운 장난감 등록하는 기능
	 * @return
	 */
	public void makeNewToy() {
		

		System.out.println("\n<새로운 장난감 추가>\n");
		
		// 장난감 이름을 입력 받음
		// -> 이미 존재하는 장난감인지 확인
		System.out.print("장난감 이름 : " );
		String toyName = sc.next();
		
		for(Toy existingToy : toySet) {
			
			if(existingToy.getToyname().equals(toyName)) {
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
		
		Set<String> materials = new HashSet<String>(); // 재료를 저장할 Set 객체 생성
		
		System.out.println("사용 가능한 재료 목록 ");
		
		// System.out.println(materialMap.entrySet());
	    // [1=면직물, 2=플라스틱, 3=유리, 4=고무]
		// Set <Entry<K, V> > Map.entrySet() : key=value 한 쌍으로 이루어진 Entry 객체를
		// Set 객체로 반환
		for (Entry<Integer, String> entry : map.entrySet()) {
			
			// entry.getkey() : entry 객체의 key반환
			// entry.getValue() : entry 객체의 Value반환
			System.out.println(entry.getKey()+":"+entry.getValue());
			// 1 : 면작물
			// 2 : 플라스틱
			// 3 : 유리
			// 4 : 고무
		}
		
		
		while(true) {
			
			System.out.print("재료를 입력하세요 (종료하려면 'q'를 입력하세요) : "); // 종료할 때까지 계속 추가
			
			try {
				
				String input = sc.next(); // 재료 입력
				
					if(input.equals("q")) { // 종료시
						break;	// q를 가지고 되돌아감
					}
				
				    int materialkey = Integer.parseInt(input); // "1" -> 1
				
				    String material = map.get(materialkey); // 1 -> 면작물
				    
				    if(material != null) { // 재료명이 null이 아니라면
				    	
				    	if(materials.contains(material)) { // materials Set 객체에 해당 재료명이 존재하는지 확인
				    		System.out.println("이미 추가된 재료입니다. 다른 재료를 선택하세요.");
				    		
				    	}else{ // 만약 해당하는 재료가 없다면 추가
				    		materials.add(material);
				    		System.out.println("재료가 추가 되었습니다." + material);
				    	}
				    	
				    }else{ // 재료명이 null이면 없는 재료고유번호를 입력했다는 의미
				    		System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
				    	}
				    	
			} catch (NumberFormatException e) { // 재료번호 입력 시 숫자나 q가 아닌 경우 예외처리 바로함
				System.out.println("숫자를 입력하거나 q를 입력하세요.");
			}

		}
		
		Toy newToy = new Toy(toyName,age,price,color,date,materials); // 추가할 재료가 저장된 새로운 Set 객체
		
		toySet.add(newToy); // 추가
		System.out.println("새로운 장난감이 추가되었습니다.");
		
	}
	
	/** 3. 장난감 삭제하는 기능
	 * 
	 */
	public void deleteToy() {
		
		System.out.println("\n<장난감 삭제하기>\n");
		
		if(toySet.isEmpty()) { 
			System.out.println("생성된 장난감이 없습니다.");
			return; 
		}
		
		System.out.print("삭제할 장난감의 이름을 입력하세요 : ");
		
		String toyName = sc.next();
		
		boolean flag = false;
		
		for(Toy toy : toySet) {
			
			if(toy.getToyname().equals(toyName)) { // 원래 있는 장남감이랑 입력한 장난감이름이 같다면
			
				toySet.remove(toy);
				
			    System.out.println("장난감이 삭제되었습니다.");	
			
			    flag = true; // 이름이 일치하는 장난감을 찾았다면 반환
			    
			    return;
			
			}
			
			if(flag) {
				System.out.println("장난감이 삭제되었습니다.");
			}else {
				System.out.println("해당하는 장난감의 이름을 찾을 수 없습니다.");
			}
			
		}
		
	}
	
	/** 4. 장난감 제조일 순으로 조회하는 기능
	 * 
	 */
	public void lookDate() {
		
		System.out.println("\n<장난감 제조일 순으로 조회하기>\n");
		
		if(toySet.isEmpty()) {
			System.out.println("생성된 장난감이 없습니다.");
			return;
		}
		
		List<Toy> list = new ArrayList<Toy>(toySet);
		
		Collections.sort(list,Collections.reverseOrder()) ;
		
		for(Toy toy : list) {
			
			System.out.println(toy.getDate());
			
		}
		
	}
	
	/** 5. 연령별 사용 가능한 장난감 리스트 조회하는 기능
	 * 
	 */
	public void lookAge() {
		System.out.println("\n<연령별로 사용 가능한 장난감>");
		
		for(Toy toy : toySet) {
			
			System.out.println("[연령 :"+ toy.getAge() + "세]");
			System.out.println(toy);
			
		}
		
	}
	
	/** 6. 재료 추가하는 기능
	 * 
	 */
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
	
	/** 7. 재료 삭제하는 기능
	 * 
	 */
	public void removeIngr() {
		
		System.out.println("\n<재료 제거>");
		
		
	}
	
	}
	
	
	
	
	
	
	
	

