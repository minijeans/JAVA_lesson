package 연산자;

import java.util.Scanner;

public class Ex02산술연산자예제 {

	public static void main(String[] args) {
		// 사용자에게 두 개의 정수를 입력받아서 두 수의 더하기, 빼기, 곱하기, 나누기 결과값 출력
		// 주의점!! 나누기 결과값은 실수 형태로 표현

		// 1. 입력 도구 꺼내기
		Scanner sc = new Scanner(System.in);

		// 2. 사용자에게 두 개의 정수를 입력받고 저장
		System.out.print("첫번째 정수 입력 : ");
		int a = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int b = sc.nextInt();

		// 3. 결과값 출력
		System.out.println("더한 결과 값 : " + (a + b));
		System.out.println("뺀 결과 값 : " + (a - b));
		System.out.println("곱한 결과 값 : " + (a * b));
		System.out.print("나눈 결과 값 : " + ((double) a / b)); // double의 a를 int b로 나눔

	}

}
