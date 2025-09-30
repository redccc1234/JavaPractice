package com.kh.practice.snack.controller;

import com.kh.practice.snack.model.vo.Snack;

public class SnackController {
	
	
	Snack s = new Snack();
	
	public SnackController() {} 
	
	public String saveData(String kind, String name, String flavor, int numOf, int price) {
		// setter를 이용해서 저장하고 저장되었다는 결과를 반환
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
	


