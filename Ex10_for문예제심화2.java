package 반복문;

import java.util.Scanner;

public class Ex10_for문예제심화2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("n 입력 : ");
		int n = sc.nextInt();
		int result = 1;

		for (int i = 1; i <= n; i++) {
			System.out.print(result + " ");
			result += i;
		}

	}

}
