package 출력;

import java.util.Scanner;

public class Ex02입력받기 {

	public static void main(String[] args) {

		// new Scanner() : 입력받는 Scanner 도구 생성
		// System.in : 입력 도구를 활용할거야!
		// Scanner sc = 입력 도구를 저장할 수 있는 자료형
		Scanner sc = new Scanner(System.in); // 도구 꺼냄

		// 사용자에게 숫자 입력받기
		System.out.print("숫자를 입력해주세요 >> ");
		int a = sc.nextInt();
		System.out.println(a);

		// 사용자에게 문자열 입력받기
		System.out.print("문자를 입력해주세요 >> ");
		String b = sc.next();
		System.out.println(b);

	}

}
