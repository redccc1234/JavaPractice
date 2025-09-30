package edu.kh.oop.practice.model.vo;

public class Hero {
	
	private String nickName;
	private String job;
	private int hp;
	private int mp;
	private int level;
	private double exp;
	
	public Hero() {}

	public Hero(String nickName, String job, int hp, int mp, int level, double exp) {
		
		this.nickName = nickName;
		this.job = job;
		this.hp = hp;
		this.mp = mp;
		this.level = level;
		this.exp = exp;
	}
	
	public void attack(double exp) {
		this.exp+=exp;
		System.out.println(nickName + "은/는 공격을 했다!!! 현재 경험치 : "+ this.exp);
		
		
		if(exp >= 300) {
			level++;
			System.out.println("레벨이 올랐습니다!!! 현재레벨 :"+level);
		}
	}
	
	public void dash() {
		mp-=10;
		System.out.println(nickName+"의 엄청 빠른 대시!!! 남은 마력 :"+mp);
		
		if(mp <= 0) {
			
			System.out.println("[마력 부족]더 이상 대시 할 수 없어요~!");
		}
		
	}
	public String toString1() {
		return"=========캐릭터 생성=========\n"
				+job+"직업으로"+nickName+"님이 생성되었습니다.\n"
				+ "현재 레벨 :"+level+"\n"
				+ "현재 hp :"+hp+"\n"
				+ "현재 mp :"+mp+"\n"
				+ "현재 경험치 :"+exp;
		
	}
	public String toString2() {
		return "======"+"'"+nickName+"'"+"======\n"
				+"현재 레벨 :" + level + "\n"
				+ "현재hp :" + hp + "\n"
				+ "현재mp :" + mp + "\n"
				+ "현재exp :" + exp;
	}
	
	
	
	
}