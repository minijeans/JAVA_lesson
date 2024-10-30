package 메소드;

import java.util.Scanner;

public class Ex03메소드예제2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();

		int result = getAbsoluteValue(num1, num2);
		System.out.println("결과 확인 : " + result);
	}

	public static int getAbsoluteValue(int n1, int n2) {
		if (n1 - n2 < 0) {
			return -(n1 - n2);
		} else {
			return n1 - n2;
		}
	}
}
