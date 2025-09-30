package edu.kh.variable.practice;

public class CastingPracice2 {
	public static void main(String[] args) {
	
	int age = 23;
			 System.out.println("나는 " + 23 + "살입니다.");
   
	int score = 90;
	score = score + 10;
	System.out.println("최종 점수: " + score);
	
	int a = 10 ;
	double b = a;
	System.out.println("a="+a);	
	System.out.println("b="+b);
	
	double pi = 3.14159;
	int num = (int)pi;
	System.out.printf("pi = %.2f , num = %d\n ", pi , num);
	
	char ch = 'A';
	int iNum = ch;
	System.out.printf("문자: %c, 코드값: %d\n", ch , iNum);
	
	final int PRICE = 5000;
	int count = 3;
	int total = PRICE *  count;
	System.out.printf("물건 가격: %d원, 개수: %d개, 총액: %d원\n",PRICE,count, total);
	
	int kor = 95, eng = 87, mat = 90;
	int sum = kor+eng+mat;
	double avg = sum/3.0;
	
	System.out.printf("국어:%d, 영어:%d, 수학: %d\n",kor,eng,mat);
	System.out.printf("총점: %d, 평균:%.2f\n",sum, avg);
	
	String name = "영숙";
	int age2 = 28;
	double height = 165.7;
	System.out.printf("출연자 이름: %s\n",name);
	System.out.printf("나이: %d세\n",age2);
	System.out.printf("키: %.1fcm\n",height);
	
	double doubleage2 = age2;
	System.out.println("자동 형변환된 나이(double):"+doubleage2);
	
	int intHeight = (int) height;
	System.out.println("강제 형변환된 키(int): " + intHeight);
	
	int score1 = 87, score2 =92;
	double avgScore = (score1 + score2)/2.0;
	System.out.printf("%s님의 매칭 점수 평균은 %.1f점입니다!\n", name, avgScore);
	
	
	}
}
