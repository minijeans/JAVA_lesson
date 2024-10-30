package 클래스객체;

public class EX00 {

	public static void main(String[] args) {
		// 정석루트
		Sta s = new Sta();
		Sta t = new Sta();

		s.see();
		t.see();
		

		// 타 클래스의 메소드가 static인 경우
		Sta.see();

	}

}
