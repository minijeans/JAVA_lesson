package 게임;

import java.util.Random;

public class Func {

	// 게임에 들어가는 로직들을 정의
	// 로직들을 가져다가 쓰기위해 정의를 하는거여서
	// 객체 생성할 필요는 없음..
	// --> static 형태로 메소드들을 정의해보자

	public static int fight() {
		Random rand = new Random();
		// 가상의 적과 싸워서 이기면
		// -> 둘다 랜덤값 만들고, 숫자차이로 승패가르기
		// 경험치 이기면+30, 비기면+15, 지면+5
		// 경험치(int)을 return
		System.out.println("전투시작!");
		int me = rand.nextInt(10) + 1;
		int enemy = rand.nextInt(10) + 1;

		if (me > enemy) {
			System.out.println("이겼다!");
			return 30;
		} else if (me == enemy) {
			System.out.println("비겼다!");
			return 15;
		} else {
			System.out.println("졌다!");
			return 5;
		}

	}

	public static int eat(String lf, String nf) {
		// 사용자에게 먹일 음식을 매개변수로 받아와서
		// 커비가 좋아하는 음식이면 경험치+50
		// 다른 음식들이면 경험치 -10
		// 경험치를 return
		if (lf.equals(nf)) {
			System.out.println("맛있당");
			return 50;
		} else {
			System.out.println("맛없엉");
			return -10;
		}

	}
}
