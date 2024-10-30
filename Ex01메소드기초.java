package 메소드;

public class Ex01메소드기초 {

	public static void main(String[] args) {
		// 메소드
		// - 반복적으로 사용되는 코드를 줄이기 위해서 사용
		// - 특정 작업을 위해 사용되는 코드를 묶어놓고, 필요에 따라 호출해서 동작

		// a-2. 호출
		run();

		// b-2. 호출
		sleep(12, "미리");
		sleep(3, "승겸");

		// c-2. 호출
		System.out.println(age());

		// d-2. 호출
		System.out.println(introduce("선생님", "미리"));
	}

	// 메소드의 유형
	// a. 매개변수X, 반환값X
	// a-1. 선언
	public static void run() {
		System.out.println("미리가 달립니다~");
		System.out.println("달려라 달려라 달려라 미리~");
	}

	// b. 매개변수O, 반환값X
	// 매개변수는 1개 이상 들어갈 수 있으며, 자료형과 순서를 정확히 해야한다
	public static void sleep(int time, String a) {
		System.out.println("안녕히 주무세요~");
		System.out.println(time + "시에 잠이 든 " + a + "...");
	}

	// c. 매개변수X, 반환값O
	// void-반환값이 없을 때
	// 반환값이 있다면, 반환할 데이터의 자료형을 void 자리에 넣기
	public static int age() {
		System.out.println("미리는 몇살이니?");
		return 20;
	}

	// d. 매개변수O, 반환값O
	public static String introduce(String work, String name) {
		String myself = work + "(이)가 직업인 " + name + "(이)라고 해~";
		return myself;
	}

}
