package 반복문;

import java.util.Scanner;

public class Ex10_for문예제2 {

	public static void main(String[] args) {
		// 팩토리얼 구하기
		// ex) 3입력 -> 3*2*1 = 6 출력
		Scanner sc = new Scanner(System.in);

		System.out.print("입력 : ");
		int N = sc.nextInt();
		int result = 1;

		for (int i = 1; i <= N; i++) {
			result *= i;
		}

		System.out.println("출력 : " + result);

	}

}
