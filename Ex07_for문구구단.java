package 반복문;

import java.util.Scanner;

public class Ex07_for문구구단 {

	public static void main(String[] args) {
		// 1. for문을 사용해서 구구단 2단을 출력
		// 2. 사용자에게 원하는 단을 입력받아서 구구단을 출력
		Scanner sc = new Scanner(System.in);

		System.out.print("단 입력 >> ");
		int num = sc.nextInt();

		System.out.print("어느 수까지 출력 >>");
		int num2 = sc.nextInt();

		for (int i = 1; i <= num2; i++) {
			System.out.println(num + "*" + i + "=" + (num * i));
		}

		// 77~1
		int count = 77;
		// 곱셈 값을 누적해서 더해줄 변수
		int result = 0;

		for (int i = 1; i < 78; i++) {
			result += count * i;
			count--;
		}

		System.out.println(result);

	}

}
