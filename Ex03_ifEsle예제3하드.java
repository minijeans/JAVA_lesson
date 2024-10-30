package 조건문;

import java.util.Scanner;

public class Ex03_ifEsle예제3하드 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("상품의 개수를 입력하세요 : ");
		int num = sc.nextInt();
		int price = 100000;

		if (num <= 10) {
			System.out.println("총 " + num * price + "원 입니다.");
		} else {
			int result = 10 * price + (int) ((num - 10) * price * 0.8);
			System.out.println("총 " + result + "원 입니다.");
		}

	}

}
