package com.hw1.run;

import java.util.ArrayList;
import java.util.List;

import com.hw1.model.dto.Friend;

public class Run {

	public static void main(String[] args) {
	
	// Friend 객체만 넣을 수 있는 ArrayList 객체 생성
	List <Friend> friendList = new ArrayList<>();

	 friendList.add(new Friend("짱구"));
	 friendList.add(new Friend("철수"));
	 friendList.add(new Friend("유리"));
	 friendList.add(new Friend("훈이"));
	 friendList.add(new Friend("맹구"));
	
	 /*collections.addAll();
	  * 
	  * collections.addAll(friend, new Friend("짱구"),new Friend("철수"),new Friend("유리")
	  * ,new Friend("훈이"),new Friend("맹구"));
	  * 
	  * 
	  * List.of() : Java 9 이상의 버전에서 사용 가능
	  * 
	  * List<Friend> friend = List.of(new friend("짱구"), new Friend("철수"), 
	  * new Friend("유리"), new Friend("훈이"), new Friend("맹구"));
	  * 
	  * */
	 
	 // 랜덤으로 골목대장 뽑기
	 // 메모!!
	 // Random random = new Random();
	 // int n = random.nextInt(10); 0~9 범위
	 
	 /*
	  * Random random = new Random();
	  * int n = random.nextInt(friendList.size());
	  * Freind leader = friendList.get(n);
	  * */
	 
	 
	  //Friend frd = (Friend)Math.random()*5;
	  // Math.random() : 0.0 ~ 1.0
	 int randomIndex = (int)(Math.random() * friendList.size()); // 0~4
	 
	 Friend leader = friendList.get(randomIndex);
	 
	 leader.pickLeader();
	}


	
}
