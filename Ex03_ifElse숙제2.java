package 조건문;

import java.util.Scanner;

public class Ex03_ifElse숙제2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("옷 가격을 입력해주세요 ");
		int price = sc.nextInt();

		if (price < 300000) {
			System.out.println(price < 100000 ? price : (int) price * 0.95);
		} else {
			System.out.println(price < 500000 ? (int) price * 0.9 : (int) price * 0.8);
		}

	}

}
