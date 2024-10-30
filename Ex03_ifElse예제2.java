package 조건문;

import java.util.Scanner;

public class Ex03_ifElse예제2 {

	public static void main(String[] args) {
		System.out.println("==== EVERLAND RESORT ====");

		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.print("인원수를 입력하세요 : ");
		int num = sc.nextInt();

		// if(age<20) { money /= 2; }

		if (age < 20) {
			System.out.println("총 " + 5000 * num / 2 + "원 입니다.");
		} else {
			System.out.println("총 " + 5000 * num + "원 입니다.");
		}

	}

}
