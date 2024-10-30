package 인터페이스;

public class Human extends Animal implements Speak, Swim {

	// Animal 추상클래스의 메소드를 재정의
	@Override
	public void move() {
		System.out.println("저벅저벅");
	}

	// Speak 인터페이스의 메소드를 재정의
	public void speaking() {
		System.out.println("재잘재잘");
	}

	public void barking() {
		System.out.println("왁");
	}

	// Swim에서 오버라이딩
	@Override
	public void Swimming() {
		System.out.println("어푸어푸");
	}

}
