package 추상화;

public abstract class Student {

	// 1. 추상클래스
	// - 추상 메소드를 하나라도 가지고 있다면, 추상클래스이다
	// - 추상 클래스는 일반 메소드도 가질 수 있다.
	// - 추상 클래스 만드는법 : 클래스 이름 정의하는 곳에(선언부)에 abstract 라는 키워드를 사용해서 선언

	// 2. 추상메소드
	// - {}를 가지고 있지 않은 메소드
	// - 선언(틀 : 리턴타입, 메소드명, 매개변수)은 되어있으나 로직은 구현되어있지 않은 메소드
	// - 구분법 : abstract 라는 키워드가 붙는다

	// 추상메소드(study)
	public abstract void study();

	// 일반메소드(rest)
	public void rest() {
		System.out.println("휴 피곤하다 빽다방이나 가야겠다~");
	}

}
