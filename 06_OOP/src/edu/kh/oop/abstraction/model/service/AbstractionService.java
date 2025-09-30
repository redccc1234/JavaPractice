package edu.kh.oop.abstraction.model.service;

import edu.kh.oop.abstraction.model.vo.People;

// sevice : 특정 기능(비즈니스 로직)을 제공하는 패키지
// (비밀번호 암호화, 파일 검사..)

public class AbstractionService {

	// 속성= 필드
	
	// 기능 = 메서드,생성자
	
	public void ex1() {
		// people 클래스를 이용해서 국민 객체 만들기
		People p1 = new People();
		// People yuna = new People();
		// people p1 : people 객체의 주소를 저장하여 참조하는 변수 p1( == 참조변수)
		// new people() : 새로운 people 객체를 Heap 영역에 생성
		
			/*p1.name = "홍길동";
			p1.gender = '남';
			p1.pNo = "123456-1234567";
			p1.address = "서울시 중구 남대문로 120";
			p1.phone = "010-1234-5678";
			p1.age = 22;
			
			p1.tax();
			p1.vote();
		
		System.out.println("p1의 name : " + p1.name);
		System.out.println("p1의 gender : " + p1.gender );
		System.out.println("p1의 pNo : " + p1.pNo );
		System.out.println("p1의 address : " + p1.address);
		System.out.println("p1의 phone : " + p1.phone);
		System.out.println("p1의 age : " + p1.age); */
 		
		
		// 값을 호출한 자리로 얻어온다 == getter -> 반환형이 무조건 있음
		// p1.getName(); // 메소드의 호출
		
		// 전달할 값을 객체의 필드에 세팅한다 == setter
		// p1.setName("홍길동");
		//            전달인자 == 매개변수
		
		// 전달하는 값(인자) : 전달인자
		// p1에 홍길동 데이터 세팅하기
		p1.setName("홍길동");
		p1.getGender();
		p1.setGender('남');
		p1.getpNo();
		p1.setpNo("123456-1234567");
		p1.getAddress();
		p1.setAddress("서울시 중구 남대문로 120");
		p1.getPhone();
		p1.setPhone("010-1234-5678");
		p1.getAge();
		p1.setAge(22);
		
		// p1에 저장된 데이터 불러오기 = getter
			System.out.println(p1.getName()); 
			System.out.println(p1.getGender()); 
			System.out.println(p1.getpNo()); 
			System.out.println(p1.getAddress()); 
			System.out.println(p1.getPhone()); 
			System.out.println(p1.getAge()); 
		
		// 본인 객체
		// people 클래스 이용하여 본인 이름 객체 생성하기
		// 본인의 정보 setter 값 대입
		// 본인의 정보 getter 이용하여 콘솔창 출력까지
		System.out.println("================================");
		
		/*yuna.setName("조윤아");
		yuna.setGender('여');
		yuna.setpNo("012345-0123456");
		yuna.setPhone("010-9286-9589");
		yuna.setAddress("경기도 부천");
		yuna.setAge(23);
		
		System.out.println(yuna.getName());
		System.out.println(yuna.getGender());
		System.out.println(yuna.getpNo());
		System.out.println(yuna.getPhone());
		System.out.println(yuna.getAddress());
		System.out.println(yuna.getAge());
		*/
	}
}

