package edu.kh.collection.pack3.model.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import edu.kh.collection.pack3.model.dto.Member;

public class MapService {
	 
	// Map : Key와 Value 한 쌍이 데이터가 되어 이를 모아둔 객체
	// Key : Value -> Entry 라고 부름
	// Key = Value
	
	// - Key 를 모아두면 Set의 특징(중복x)
	// - Value 를 모아두면 List의 특징(중복o)
	
	public void ex1() {
		
		// HashMap<K,V> : Map의 자식 클래스 중 가장 대표되는 Map
		Map<Integer , String> map = new HashMap<Integer, String>();
		
		// Map.put(Integer Key, String Value) : 추가
		map.put(1, "홍길동"); // { 1 = 홍길동 }
		map.put(2, "고길동"); 
		map.put(3, "김길동"); 
		map.put(4, "박길동");
		map.put(5, "이길동"); 
		map.put(6, "최길동");
		
		// Key 중복 테스트
		map.put(1, "조윤아"); // 중복허용 x , 대신 Value 덮어쓰기
		
		// Value 중복 테스트
		map.put(7, "최길동"); // 중복허용 o
		
		System.out.println(map); 
		
	}
	
	public void ex2() {
		
		// Map 사용 예제
		
		// VO/DTO(값 저장용 객체)는 특정 데이터 묶음의 재사용이 많은 경우 사용함
		// -> 재사용이 적은 VO는 오히려 코드 낭비다
		// -> Map을 이용해서 VO와 비슷한 코드를 작성할 수 있음
		
		// 1) VO 버전
		Member member = new Member();
		
		// 값 세팅
		member.setId("User01"); // id =User01
		member.setPw("pass01"); // pw =pass01
		member.setAge(20); // age =20
		
		// 2) Map 버전
		Map<String,Object> map = new HashMap<>();
		// Value가 Object타입 == 어떤 객체든 Value에 들어올 수 있다!!
		
		// 값 세팅
		map.put("id", "User02");
		map.put("pw", "pass02");
		map.put("age", 25);
		
		// 값 출력 
		// Object(Value) Map.get(Key) : 매개변수로 전달받은 Key와 대응되는 Value 반환
		System.out.println(map.get("id")); //User02
		System.out.println(map.get("pw")); //pass02
		System.out.println(map.get("age")); //25
		
		
		System.out.println("=============================================");
		
		// ** Map에 저장된 데이터에 순차적으로 접근하기 **
		
	    // Map에서 Key만 모아두면 Set의 특징을 가진다(중복 저장 x)
		// -> 이를 이용해서 Map에서 KeySet()메서드 제공
		// -> Key만 모아서 Set으로 반환
		
		Set<String> set = map.keySet(); // id,pw,age 라는 Key가 저장된 Set반환
		System.out.println("KeySet() : " + set); // [pw, id, age]
		
		// 향상된 for문
		for(String key : set) {
			System.out.println(map.get(key));
		}
		
		// Map에 저장된 데이터가 많거나(반복 필요)
		// 어떤 Key가 있는지 불분명할 때
		// 또는 Map에 저장된 모든 데이터를 접근해야할 때
		// KeySet() + 향상된 for문 코드 사용 용이
		
		
		
		
		
	}
	
	public void ex3() {
		// List에 Map을 여러개 추가하여 다루기
		
		// List 객체 생성
		List<Map<String, Object>> list = new ArrayList<>();
		// List 객체 생성되었고, 해당 list에는 Map만 들어올 수 있음을 제한!!
		// -> Map 객체는 아직 생성 안됨
		
		for(int i = 0 ; i < 10 ; i++) {
			
			// Map 객체 생성
			Map<String, Object> map = new LinkedHashMap<>();
			// HashMap 은 순서를 보장하지 않는 자료 구조
			// 순서를 유지하고 싶으면 LinkedHashMap 이용
			// -> LinkedHashMap은 put 한 순서를 유지 시켜줌
			
			// Map 에 데이터 추가
			map.put("id","User0"+i);
			map.put("pw","pass0"+i);
			
			// Map을 list에 추가
			list.add(map);
		}
		
		// for 문 종료시 list에 10개의 map 객체가 추가되어있음
		System.out.println(list);
		
		// 향상된 for문 이용해서 key가 "id"에 대응되는 value값 전부 출력하기
		for( Map<String, Object> temp : list ){
			System.out.println(temp.get("id"));
		}
	
		
	}
	
	
}
