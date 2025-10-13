package com.kh.practice.snack.controller;

import com.kh.practice.snack.model.vo.Snack;

//controller : 사용자의 요청을 받아서 처리하고, 그 입력에 따라 
	// Model(데이터 처리,비지니스 로직)과  View(화면 출력)을 연결해주는 역할
public class SnackController {
	
	//필드
	Snack s = new Snack();

	//기본 생성자
	public SnackController() {} 
	
	// 메서드
	//데이터 setter를 이용하여 저장하고, 저장완료 결과를 반환해주는 메서드
	public String saveData(String kind, String name, String flavor, int numOf, int price) {
		
		s.setKind(kind);
		s.setName(name);
		s.setFlavor(flavor);
		s.setNumOf(numOf);
		s.setPrice(price);
		
		return"저장 완료되었습니다"
				+ "저장한 정보를 확인하시겠습니까?(y/n) : ";

	}
	
	public String confirmData() {// 저장된 메서드 반환
		
		return s.information();
	}
	
}
