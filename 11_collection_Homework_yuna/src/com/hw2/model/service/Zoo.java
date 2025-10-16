package com.hw2.model.service;

import java.util.List;
import java.util.Scanner;

import com.hw2.model.dto.Animal;


public class Zoo {
	
	private Scanner sc = new Scanner(System.in);
	
	private List <Animal> animals; //null
	
	public Zoo() {}
	
	public void addAnimal(Animal animal) {
		animals.add(animal);
	}
	
	public void showAnimals() {
		System.out.println("동물의 울음소리를 들어보세요: ");
		for(Animal a : animals) { // 호랑이랑 원숭이가 들어가져 있기 때문에 하나씩 꺼내줘야해서
								 // 반복 구문을 통해서 하나씩 꺼내온다.
			a.sound();
		}
	}
	
	public void displayMenu() {
		
		System.out.println("************ KH 동물원 ************");
		System.out.println("원하는 작업을 선택하세요:");
		System.out.println("1. 동물들의 울음소리 듣기");
		System.out.println("2 : 종료");
		
		System.out.print("선택 : ");
		int input = sc.nextInt();
		sc.nextLine();
		
		switch(input) {
		
		case 1 : showAnimals(); break;
		case 2 : System.out.println("프로그램을 종료합니다."); break;
		default : System.out.println("해당하는 번호만 입력해주세요!!");
		
		}
		
	}
	
}
