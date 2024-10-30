package 반복문;

import java.util.Scanner;

public class Ex01_while문예제1 {

	public static void main(String[] args) {
		// [에제]
		// - 사용자에게 정수를 입력받는다
		// - 사용자가 10이상의 정수를 입력하면 반복문을 종료

		// 1. 입력 도구 꺼내기
		Scanner sc = new Scanner(System.in);
		// 2. 사용자에게 정수 입력받기
		System.out.print("정수입력>> ");
		int num = sc.nextInt();
		// 3. 반복문 시작(반복조건:num이 10 미만이니?)
		while (num < 10) {
			// num이 10 미만이기 때문에 새로운 값을 입력받아서 num에 저장
			System.out.print("정수입력>> ");
			num = sc.nextInt();
		}
		System.out.println("종료되었습니다");

//		int num;
//		
//		do {
//			System.out.print("정수입력>> ");
//			num = sc.nextInt();
//		} while(num<10);
//		
//		System.out.println("종료되었습니다");

	}

}
