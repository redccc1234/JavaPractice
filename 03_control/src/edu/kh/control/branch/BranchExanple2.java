package edu.kh.control.branch;

import java.util.Scanner;

public class BranchExanple2 {
  
	
	Scanner sc = new Scanner(System.in);

	
	public void ex1() {
		
		int money = 10000;
		int plus = 0;
		int min = 0;
		int num = 0;
		
		System.out.println("=== ATM 프로그램 시작 ===");
		System.out.println ("현재 잔액: "+ money);
		
		
		while(num < 4 ) {
			System.out.println("메뉴를 선택하세요:");
			System.out.println("1. 입금하기");
			System.out.println("2. 출금하기");
			System.out.println("3. 잔액조회");
			System.out.println("4. 종료");
			System.out.print(">> ");
			num = sc.nextInt();
			
			switch(num) {
			case 1 : 
				System.out.print("입금할 금액을 입력하세요:"); 
				plus = sc.nextInt();
				money+=plus;
				System.out.printf("입금 완료! 현재 잔액: %d\n" , money );
			break;
			case 2 : 
				System.out.print("출금할 금액을 입력하세요:"); 
				min = sc.nextInt();
				money-=min;
				
				if(money < min ) {
					System.out.printf("잔액 부족! 현재 잔액은 %d원입니다.\n" , money );
				}else
				System.out.printf("출금 완료! 현재 잔액: %d\n" , money );
				break;
			case 3 : 
				System.out.printf("현재 잔액은 %d원입니다.\n" , money); 
				break;
			case 4 : 
				System.out.println("프로그램을 종료합니다. 이용해주셔서 감사합니다!"); 
				break;
			default : System.out.println("잘못된 입력입니다. 1~4번 중에서 선택하세요.");
			}
			
			
		}
		
	}
	
}
