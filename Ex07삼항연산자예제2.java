package 연산자;

import java.util.Scanner;

public class Ex07삼항연산자예제2 {

	public static void main(String[] args) {
		// [예제] 큰 수에서 작은 수를 빼기

		// 1. 입력 도구 꺼내기
		// 2. 사용자에게 두 개의 정수를 입력받아서 변수에 저장
		// 3. 큰 수를 찾아서 작은 수를 빼기

		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 입력 >> ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 입력 >> ");
		int num2 = sc.nextInt();

		// int result = num1>num2? num1 - num2 : num2 - num1;
		System.out.println(num1 > num2 ? "두 수의 차 " + (num1 - num2) : "두 수의 차 " + (num2 - num1));

	}

}
