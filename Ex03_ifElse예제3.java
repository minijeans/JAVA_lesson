package 조건문;

import java.util.Scanner;

public class Ex03_ifElse예제3 {

	public static void main(String[] args) {
		// 다음은 마트 계산대 프로그램입니다.
		// 1000000원짜리 선물세트를 구입했을 때 지불해야 하는 금액을 계산해 보세요
		// 11개 이상 구매할 시에는 전체 금액에서 10% 할인 적용됩니다.

		// 1. 입력 도구 꺼내기
		Scanner sc = new Scanner(System.in);

		// 2. 사용자에게 입력받기 (몇개 구매했는지)
		// 3. 2에서 받은 값을 변수에 담기
		System.out.print("상품의 개수를 입력하세요 : ");
		int num = sc.nextInt();
		int price = 100000;

		// 4. 구매개수에 따른 지불금액 계산
		if (num >= 11) {
			// 10% 할인
			System.out.println("총 " + (int) (price * num * 0.9) + "원 입니다.");
		} else {
			System.out.println("총 " + price * num + "원 입니다.");
		}

	}

}
