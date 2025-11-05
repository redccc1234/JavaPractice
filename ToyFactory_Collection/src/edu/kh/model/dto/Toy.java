package edu.kh.model.dto;

import java.util.Objects;
import java.util.Set;

public class Toy {

	private String toyName; // 장난감 이름
	private int age; // 사용 가능 연령
	private int price; // 가격
	private String color; // 색상
	private String date; // 제조년일
	private Set<String> materials; // 재료(중복되지 않는 값으로 저장)
	
	public Toy() {
	
	}

	public Toy(String toyName, int age, int price, String color, String date, Set<String> materials) {
		super();
		this.toyName = toyName;
		this.age = age;
		this.price = price;
		this.color = color;
		this.date = date;
		this.materials = materials;
	}

	public String getToyname() {
		return toyName;
	}

	public void setToyname(String toyname) {
		this.toyName = toyname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Set<String> getIngredient() {
		return materials;
	}

	public void setIngredient(Set<String> ingredient) {
		this.materials = ingredient;
	}

	@Override
	public String toString() {
		return "이름 : " + toyName + " / 가격 : " + price + " / 색상 : " + color + " / 사용가능연령 : " + age
				+ " / 제조년원일 : " + date + " / 재료 : " + materials;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, color, date, materials, price, toyName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Toy other = (Toy) obj;
		return age == other.age && Objects.equals(color, other.color) && date == other.date
				&& Objects.equals(materials, other.materials) && price == other.price
				&& Objects.equals(toyName, other.toyName);
	}
	
	
	/** 위에 ToString()에서 재료명 표기 시 사용
	 * ingredient 안에 있는 모든 재료를 문자열 형태로 만들어서 반환하는 메서드
	 * @return
	 */
	public String getingredientAsString() {
		
		StringBuilder sb = new StringBuilder(); // 가변 문자열 객체(비동기)
		
		if(materials.size() == 0) {
			
			return "없음";
		}
		
		//  ex )   [고무, 면직물]
		// 재료가 있다면 ingredient 순회하면서 재료 하나하나 , 로 구분하여 문자열 만들기
		for(String material : materials) {
			sb.append(material).append(", "); // 문자열 뒤에 이어쓰기
		}
		
		// ex)   "고무, 면직물, "
		// 만들어진 문자열의 마지막 쉼표와 공백 제거하기
		sb.setLength(sb.length() - 2);
		
		return sb.toString();
		
	}

	
	
}
