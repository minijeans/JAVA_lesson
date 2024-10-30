package 반복문;

import java.util.Scanner;

public class Ex04_반복문예제1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = 0;
		int B = 0;

		do {
			System.out.print("A 입력 >> ");
			A = sc.nextInt();
			System.out.print("B 입력 >> ");
			B = sc.nextInt();
			System.out.println("결과 >> " + (A - B));

			if (A == 0 && B == 0)
				break;
		} while (true);

	}

}
