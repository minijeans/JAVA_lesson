package 코테;

import java.util.Scanner;

public class 짝수의_합 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 n을 입력하세요 : ");
		int n = sc.nextInt();
		int result = 0;

		for (int i = 0; i <= n; i++) {
			if (i % 2 == 0) {
				result += i;
			}
		}

		System.out.println(result);
	}

}
