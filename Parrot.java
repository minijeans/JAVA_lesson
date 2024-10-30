package 인터페이스;

public class Parrot extends Animal implements Speak {

	// Animal 추상클래스 메소드 재정의
	public void move() {
		System.out.println("파닥파닥");
	}

	// Speak 인터페이스 메소드 재정의
	@Override
	public void speaking() {
		System.out.println("안녕안녕");
	}

	// Speak 인터페이스 메소드 재정의
	@Override
	public void barking() {
		System.out.println("짹짹!!!");
	}

}
