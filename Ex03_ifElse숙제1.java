package 조건문;

import java.util.Scanner;

public class Ex03_ifElse숙제1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("나이를 입력해주세요.");
		int age = sc.nextInt();
		int year = 2024;

		if (age > 0 && age < 120) {
			System.out.println(year - age + "년생입니다 ");
		} else {
			System.out.println("잘못된 수 입니다.");
		}

	}

}
