package 게임;

import java.util.Scanner;

public class Kirby extends GameTitle {

	Scanner sc = new Scanner(System.in);

	String name;
	int exp = 0;
	int hp = 30;
	String like_food;
	String now_food;

	@Override
	public void start() {
		System.out.println("커비 게임 시~작! ");

		// 1. *사용자에게 커비 이름+좋아하는음식* 입력받기
		System.out.print("커비이름을 입력해주세요 : ");
		this.name = sc.next();
		System.out.print("좋아하는 음식을 입력해주세요 : ");
		this.like_food = sc.next();
		// 2. 경험치는 초기값 1
		// 3. hp는 초기값 30

		System.out.println(this.name + "이 길을 떠납니다..");

		while (true) {
			// 전투 발생!
			// Func에 fight라는 메소드를 생성 + 사용
			// *fight 메소드 완성시켜보기*
			// 식사하기
			// Func에 eat이라는 메소드를 생성+사용
			// *먹일 음식을 입력받아서 매개변수로 eat에 보내기*
			// *eat 메소드 완성시키기*
			System.out.println("메뉴를 선택해주세요! ");
			System.out.println("[1]싸우기 [2]먹이기 [3]내 커비 상태보기 [그외번호]종료");
			int choice = sc.nextInt();
			if (choice == 1) {
				this.exp += Func.fight();
			} else if (choice == 2) {
				System.out.print("먹일 음식을 적어주세요.");
				this.now_food = sc.next();
				this.exp += Func.eat(this.like_food, this.now_food);
			} else if (choice == 3) {
				System.out.println("체력: " + this.hp);
				System.out.println("경험치: " + this.exp);
			} else {
				System.out.println("최종 체력: " + this.hp);
				System.out.println("최종 경험치: " + this.exp);
				break;
			}
		}
	}
}
