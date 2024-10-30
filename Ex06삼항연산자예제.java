package 연산자;

import java.util.Scanner;

public class Ex06삼항연산자예제 {

	public static void main(String[] args) {
		// [예제] 정수를 입력받아 홀수인지 짝수인지 판별하는 프로그램

		// 1. 입력 도구 꺼내기
		Scanner sc = new Scanner(System.in);

		// 2. 사용자에게 정수를 하나 입력받는다
		System.out.print("정수를 입력하세요 >> ");
		int num = sc.nextInt();

		// 3,. 홀수인지 짝수인지 삼항연산자로 판별하기
		String result = (num % 2 == 1) ? "홀수" : "짝수";

		System.out.println(num + "은" + result + "입니다");

	}

}
