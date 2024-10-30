package 클래스객체;

public class Ex04생성자 {

	public static void main(String[] args) {
		// 생성자
		// - 객체가 생성될 때 자동으로 호출되는 "메소드"
		// - 객체를 초기화하기 위해서 사용
		// - new를 통해서 객체를 생성할 때만 호출
		// - 리턴 타입을 지정할 수 없음
		// - 생성자의 이름은 클래스의 이름과 동일
		
		// 평소처럼 생성
		Cons hj = new Cons();
		
		// 넣고 싶은 값을 넣음과 동시에 객체 생성
		Cons jy = new Cons("재영", 20);

	}

}
