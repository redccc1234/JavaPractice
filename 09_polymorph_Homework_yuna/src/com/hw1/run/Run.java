package com.hw1.run;

import com.hw1.model.dto.Book;
import com.hw1.model.dto.Novel;
import com.hw1.model.dto.Poetry;
import com.hw1.model.dto.Textbook;

public class Run {
 
	public static void main(String[] args) {
		
		Book arr[] = new Book[3];
		
		arr[0] = new Novel("해리 포터","J.k. 롤링","판타지");
		arr[1] = new Textbook("자바 프로그래밍","James Gosling","컴퓨터 과학");
		arr[2] = new Poetry("우리들의 사랑시","김소월",30);
		
		arr[0].displayInfo();
		System.out.println(arr[0].toString());
		arr[1].displayInfo();
		System.out.println(arr[1].toString());
		arr[2].displayInfo();
		System.out.println(arr[2].toString());
	}
}
