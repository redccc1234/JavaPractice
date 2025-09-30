package workbook;

public class Person {

	private String name;
	private int age;
	
	public Person() {
		
		this.name = "조윤아";
		this.age = 23;
	}
	public void introduce() {
		System.out.printf("안녕하세요, 저는 %s,%d살입니다." , name , age);
	}
	
	
}


/*문제:
Person 클래스를 만들고
- 이름과 나이를 필드로 가지며, 생성자를 통해 초기화
- introduce() 메서드에서 "안녕하세요, 저는 [이름], [나이]살입니다." 출력

 * */
