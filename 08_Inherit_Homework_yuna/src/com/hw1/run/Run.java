package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		
		Student std[] = new Student[3];
		
		std[0] = new Student("홍길동", 20 ,178.2 ,70.0, 1, "정보시스템공학과");
		std[1] = new Student("김말똥", 21, 187.3, 80.0, 2 ,"경영학과");
		std[2] = new Student("강개순", 23, 167.0, 45.0 ,4 ,"정보통신공학과");
		
		
		for(Student result : std) {
			System.out.println( result .information());
		}
		
		Employee emp[] = new Employee[10];
		
		int count = 0;
		
		System.out.println("==================================================");
		
		Scanner sc = new Scanner(System.in);
		
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
			
			if(count==emp.length) {
				break;
			}
		
			System.out.print("계속 추가하시겠습니까?(y/n) : ");		
			String result = sc.next();
			
			if(result.equals("n") || result.equals("N")) {
				break;
				
			}
		
		}
		for(Employee input : emp) {
			if(input == null) break; // NullPointerException 방지
			System.out.println( input.information());
		}
		
		
		
	}

}
