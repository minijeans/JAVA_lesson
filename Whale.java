package 인터페이스;

public class Whale extends Animal implements Swim {

	// Animal 추상클래스 메소드 재정의
	public void move() {
		System.out.println("살랑살랑");
	}
	
	public void Swimming() {
		System.out.println("파닥파닥");
	}
}
