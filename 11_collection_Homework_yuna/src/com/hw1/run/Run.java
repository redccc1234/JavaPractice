package com.hw1.run;

import java.util.ArrayList;
import java.util.List;

import com.hw1.model.dto.Friend;

public class Run {

	public static void main(String[] args) {
		
	 List <Friend> friendList = new ArrayList<>();

	 friendList.add(new Friend("짱구"));
	 friendList.add(new Friend("철수"));
	 friendList.add(new Friend("유리"));
	 friendList.add(new Friend("훈이"));
	 friendList.add(new Friend("맹구"));
	
	  //Friend frd = (Friend)Math.random()*5;
	  
	 // Math.random() : 0.0 ~ 1.0
	 int random = (int)(Math.random() * 5); // 0~4
	 
	 friendList.get(random).pickLeader();
	}


	
}
