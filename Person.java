package 클래스객체;

public class Person {

	// 클래스 : 설계도의 개념
	// - 필드, 메소드로 이루어져 있음
	// - 필드 : 속성(data)
	// - 메소드 : 행동(logic)

	// 1. 필드 정의
	String name;
	int age;

	// 메소드 정의
	public void eat() {
		System.out.println("밥먹자 냠냠");
	}

	public void introduce() {
		System.out.println("안녕하세요 제 이름은 " + name + "이고 " + age + "살입니다");
	}

	public void hello(String h) {
		System.out.println("반갑습니다 " + h);
	}

}
