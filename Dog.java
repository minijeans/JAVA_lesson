package 상속;

public class Dog extends Animal {

	public void walk() {
		System.out.println("강아지 산책중");
	}
	
	public void cry() {
		// 부모에 있는 걸 재정의
		System.out.println("왈왈");
	}
}
