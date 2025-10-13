package com.kh.practice.snack.view;

import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;

// View : 사용자에게 보여줄 응답화면 관련된 코드가 모인 패키지
public class SnackMenu {
	
	//필드
	Scanner sc = new Scanner(System.in);
	SnackController scr = new SnackController();
	
	//메서드
 	public void menu() {
 			
 			System.out.println("스낵류를 입력하세요.");
 			System.out.print("종류 : ");
 			String inputKind = sc.next();
 			
 			System.out.print("이름 : ");
 			String inputName = sc.next();
 			
 			System.out.print("맛 : ");
 			String inputFlavor = sc.next();
 			
 			System.out.print("개수 : ");
 			int inputNumof = sc.nextInt();
 			
 			System.out.print("가격 : ");
 			int inputPrice = sc.nextInt();
 			
 			System.out.print(scr.saveData(inputKind, inputName, inputFlavor, inputNumof, inputPrice));
 			String input = sc.next();
 			
 			if(input.equals("y")) {// 저장된 데이터 출력
 				System.out.println(scr.confirmData());
 			}

 			
 		}
}
