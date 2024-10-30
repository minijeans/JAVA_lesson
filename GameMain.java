package 게임;

import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("사용할 게임을 선택해주세요");
		System.out.println("[1]포켓몬 [2]커비");
		int input = sc.nextInt();

		if (input == 1) {
			// 포켓몬
			// 포켓몬 칩 가져오기
			Pokemon game1 = new Pokemon();
			// 포켓몬 칩을 닌텐도에 넣고 실행
			insert(game1);

		} else if (input == 2) {
			// 커비
			// 커비 칩 가져오기
			Kirby game2 = new Kirby();
			// 커비 칩을 닌텐도에 넣고 실행
			insert(game2);
		}

		// 사용자가 1을 입력하면 포켓몬 게임을 시작,
		// 2를 입력하면 커비 게임을 시작

	}

	public static void insert(GameTitle g) {
		g.start();
	}

}
