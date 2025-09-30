package edu.kh.inheritance.model.service;

import edu.kh.inheritance.model.dto.Employee;
import edu.kh.inheritance.model.dto.Person;
import edu.kh.inheritance.model.dto.Student;

public class InheritanceService {

	// 상속 확인 예제
	public void ex1() {
		
		Person p = new Person();
		p.setName("홍길동");
		p.setAge(25);
		p.setNationality("대한민국");
		
		System.out.println(p.toString());
		
		Student std = new Student();
		// Person 클래스로부터 상속받은 멤버메서드
		// 사용가능
		std.setName("고길동");	
		std.setAge(19);
		std.setNationality("대한민국");
		
		// Student만의 고유한 멤버 사용 가능
		std.setClassroom(2);
		std.setGrade(3);
		
	     Student std2 = new Student("홍길순",20,"미국",1,3);
	     System.out.println(std2.getName());
	     System.out.println(std2.getAge());
	     System.out.println(std2.getNationality());
	     System.out.println(std2.getGrade());
	     System.out.println(std2.getClassroom());
	     
	     Employee emp = new Employee("김노동",30,"한국","KH정보교육원");

	     System.out.println(emp.getName());
	     System.out.println(emp.getAge());
	     System.out.println(emp.getNationality());
	     System.out.println(emp.getCompany());

	}
	
	//  오버라이딩 확인 예제
	public void ex2() {
		
		Student std = new Student();
		Employee emp = new Employee(null, 0, null, null);
		
		std.move(); // 오버라이딩 x -> Person(부모) 의 메서드 수행
		emp.move(); // 오버라이딩 o -> Employee 에서 재정의한 메서드 수행
		// 오버라이딩 된 move()
		// 효율적으로 빨리 일하고 퇴근한다
	
	}
	
	// toString() 오버라이딩 예제
	public void ex3() {
		Person p = new Person("김철수",17,"한국");
		System.out.println(p);
		// print 구문 수행 시 참조변수만 작성해도 
		// 자동으로 toString() 메서드 호출
		
		Student std = new Student("강호동",18,"미국",2,6);
		System.out.println(std.toString());
		
		Employee emp = new Employee("김노동",36,"한국","샘송");
		System.out.println(emp.toString());
		
	}
	
	
	
}
