package 조건문;

import java.util.Scanner;

public class Ex02_단순if예제1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();

		if (age >= 20) {
			System.out.println("성인입니다");
		}

	}

}
