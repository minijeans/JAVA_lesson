package 클래스객체;

import java.util.Scanner;

public class Ex03다마고치 {

	public static void main(String[] args) {
		// 다마고치 게임 만들기
		Dama hjDama = new Dama();
		int health;
		int happy;
		String name = hjDama.name();

		// 1. 시작 메뉴 만들기
		Scanner sc = new Scanner(System.in);

		System.out.println("====다마고치 게임====");

		while (true) {
			System.out.println("메뉴를 선택해주세요");
			System.out.println("[1]" + name + "이 상태 [2]" + name + "이 밥주기 [3]" + name + "이 재우기 [4]"
					+ name + "이 놀아주기 [5]" + name + "이 초기화 [6]이름변경 " + "[7]종료");
			System.out.print(">> ");
			int choice = sc.nextInt();

			if (choice == 1) {
				// - 내 다마고치 상태 확인하기
				hjDama.show();

			} else if (choice == 2) {
				// - 밥주기
				hjDama.eat();

			} else if (choice == 3) {
				// - 재우기
				happy = hjDama.sleep();
				if (happy < 0) {
					System.out.println(name + "이가 너무 우울해서 집을 나가버렸습니다ㅜ");
					break;
				}

			} else if (choice == 4) {
				// - 놀아주기
				health = hjDama.play();
				if (health < 0) {
					System.out.println(name + "이가 너무 아파서 죽었습니다ㅜ");
					break;
				}

			} else if (choice == 5) {
				// - 다마고치 초기화하기
				hjDama.reset();

			} else if (choice == 6) {
				// - 다마고치 이름 변경
				name = hjDama.rename();

			} else if (choice == 7) {
				// - 종료하기
				break;
			} else {
				System.out.println("선택지에 없는 번호입니다.");

			}
		}

	}

}
