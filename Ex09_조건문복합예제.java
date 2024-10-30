package 조건문;

import java.util.Scanner;

public class Ex09_조건문복합예제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// pay(투입금액), num(상품번호)

		System.out.print("돈을 투입해주세요 >> ");
		int money = sc.nextInt();

		System.out.println("음료를 고르세요.");
		System.out.println("1. 코카콜라(700원) 2. 스프라이트(800원) 3. 생수(500원)");
		System.out.print(">> ");
		int num = sc.nextInt();

		// 선택한 상품 번호에 따라서 지불금액을 정하기

		// 지불금액(price)
		int price = 0;
		switch (num) {
		case 1:
			price = 700;
			break;
		case 2:
			price = 800;
			break;
		case 3:
			price = 500;
			break;
		default:
			System.out.println("없는 번호입니다");
		}

		// 넣은 돈이 물건 가격보다 같거나 많으면 구매, 그렇지 않으면 부족해요 출력
		if (money >= price) {
			// 투입한 돈으로 물건 구매하기
			money -= price;
		} else {
			// 구매 못함
			System.out.println("돈이 부족합니다");
		}

		// 잔돈 출력
		System.out.println("잔돈 : " + money + "원");

		// 지폐/동전 개수 세기
		// ex) 3700원 일 때
		// 1. 1000원 -> 3700을 1000으로 나눴을 때의 몫 (3)
		// 2. 500 -> 3700에서 천원으로 나눠떨어지는건 빼고 생각 3700 / 1000 = 몫 3, 나머지 700
		// 3. 100 -> 3700 - 3000 -500 = 200
		System.out.println("천원 : " + (money / 1000) + "개 " + "오백원 : " + (money % 1000 / 500) + "개 " + "백원 : "
				+ (money % 1000 % 500 / 100) + "개");

	}

}
