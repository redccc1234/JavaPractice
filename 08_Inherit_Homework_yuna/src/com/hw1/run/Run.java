package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		
		Student std[] = new Student[3];
		
		// 사용데이터를 참고하여 3명의 학생 객체 생성
		std[0] = new Student("홍길동", 20 ,178.2 ,70.0, 1, "정보시스템공학과");
		std[1] = new Student("김말똥", 21, 187.3, 80.0, 2 ,"경영학과");
		std[2] = new Student("강개순", 23, 167.0, 45.0 ,4 ,"정보통신공학과");
		
		//반복문을 통해 출력
		// for/while/do~while..
	
		/* 향상된 for문 
		 * 
		 * 자바에서 배열,컬렉션과 같은 데이터를 순차적으로 간단하게
		 * 반복할 수 있는 구조를 제공해줌
		 * 
		 * 일반적인 for 문보다 코드가 더 간결하고 가동성이 좋아서 
		 * 반복 작업을 더 쉽게 작성할 수 있다.
		 * 
		 * for(자료형 변수명 : 배열 또는 컬렉션){
		 * 	// 반복해서 실행할 코드
		 * }
		 * 
		 * 
		 * */
		for(Student result : std) {
			System.out.println( result .information());
		}
		
		System.out.println("==================================================");
		
		// 최대 10명의 사원 정보를 기록할 수 있게 객체 배열 할당
		Employee emp[] = new Employee[10];
		
		// 반복문을 사용하여 키보드로 사원 정보를 입력받도록 구현
		// 2명 정도의 사원 정보를 입력 받아 각 객체에 저장
		// 현재까지 기록된 사원들의 정보 출력
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		
		while(true){
			
			System.out.print("이름 : ");
			String name = sc.next();
			
			System.out.print("나이 : ");
			int age = sc.nextInt();
			
			System.out.print("신장 : ");
			double height = sc.nextDouble();
			
			System.out.print("몸무게 : ");
			double weight = sc.nextDouble();
			
			System.out.print("급여 : ");
			int salary = sc.nextInt();
			
			System.out.print("부서 : ");
			String dept = sc.next();
			
			emp[count]=new Employee(name,age,height,weight,salary,dept);
			
			count++;
			
			if(count==emp.length) {// 배열이 다 차면 반복 종료
				break;
			}
		
			System.out.print("계속 추가하시겠습니까?(y/n) : ");		
			String result = sc.next().toUpperCase();
			// String.toUpperCase() : 소문자 -> 대문자
		 	// String.toLowerCase() : 대문자 -> 소문자
			
			// 방법 1) if(result.equals("n") || result.equals("N")) 
			// 방법 2) toUpperCase() / toLowerCase() 사용
			// 방법 3) equalsIgnoreCase() : 문자열 비교 메서드, 
		 	// 		대소문자를 구분하지 않고 두 문자열이 같은지 비교
		 	// if(str.equalsIgnoreCase("n")) break;
				
			if(result.equals("N")) break;
		
			}// while 문 끝
		
		// 현재까지 기록된 사원들의 정보를 출력
		// [박보검,null,null,null,null,null,null,null,null,null]
		for(Employee input : emp) {
			if(input == null) break; // NullPointerException 방지
			System.out.println( input.information());
		}
	
	}

}
