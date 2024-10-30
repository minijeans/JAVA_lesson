package 클래스객체;

public class Cons {

	// 만약 개발자가 생성자를 정의하지 않으면 
	// 자동으로 기본 생성자가 정의됨 (컴파일러에 의해)
	String name;
	int age;
	
	// 기본 생성자 
	public Cons() {
		this.name = "이름없음";
		this.age = 0;
	}
	
	// 생성자로 데이터의 값을 미리 정의
	public Cons(String n, int a) {
		this.name = n;
		this.age = a;
	}
	
	// 생성자 오버로딩
	// - 생성자끼리 이름이 동일하나, 각자의 매개변수의 타입과 개수가 다르다면
	//   별개의 생성자라고 인식함
	//   !!!메소드도 오버로딩이 가능하다!!!
}
