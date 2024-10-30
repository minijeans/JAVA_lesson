package 조건문;

import java.util.Scanner;

public class Ex03_ifElse숙제3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("각도를 입력하시오.");
		int num = sc.nextInt();

		if (num <= 90) {
			System.out.println(num < 89 ? "예각입니다" : "직각입니다");
		} else {
			System.out.println(num < 179 ? "둔각입니다" : "평각입니다");
		}

	}

}
