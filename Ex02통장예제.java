package 클래스객체;

import java.util.Scanner;

public class Ex02통장예제 {

	public static void main(String[] args) {
		// 1. 통장 클래스 설계
		// 2. 객체 생성

		Bank mrBank = new Bank();

		Scanner sc = new Scanner(System.in);

		System.out.println("====국 민 은 행====");

		while (true) {
			System.out.println("메뉴를 선택해주세요");
			System.out.println("[1]잔액조회 [2]입금 [3]출금 [4]종료");
			System.out.print(">>");
			int choice = sc.nextInt();

			if (choice == 1) {
				// 잔액조회
				System.out.println("잔액은 " + mrBank.showmoney() + "원 입니다");
				System.out.println();
			} else if (choice == 2) {
				// 입금기능
				System.out.print("얼마를 입금하시겠습니까? >> ");
				int dMoney = sc.nextInt();
				mrBank.deposit(dMoney);
				System.out.println();
			} else if (choice == 3) {
				// 출금기능
				System.out.print("얼마를 출금하시겠습니까? >> ");
				int wMoney = sc.nextInt();
				mrBank.withdraw(wMoney);
				System.out.println();
			} else if (choice == 4) {
				// 종료
				break;
			} else {
				System.out.println("다시입력해주세요");
				System.out.println();
			}
		}

		// 입금
		// mrBank.deposit(1000);

		// 잔액조회
		// System.out.println("잔액은 " + mrBank.showmoney());

		// 출금
		// mrBank.withdraw(1000);
	}

}
