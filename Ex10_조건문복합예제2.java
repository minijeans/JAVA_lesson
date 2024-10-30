package 조건문;

import java.util.Scanner;

public class Ex10_조건문복합예제2 {

	public static void main(String[] args) {
		// 사용자에게 숫자를 입력받아서 1의 자리를 반올림 해서 돌려주는 프로그램!

		// 1. 입력 도구 꺼내기
		Scanner sc = new Scanner(System.in);

		// 2. 숫자 하나 입력받기
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();

		// 3. 반올림 하기 0~4 : 버림, 5~9 : 올림
		// ex) 사용자가 158 -> 160, ex) 사용자가 43 -> 40
		if (num % 10 < 5) {
			num -= (num % 10);
			// result = num/10*10
		} else {
			num += (10 - (num % 10));
			// result = (num/10+1)*10
		}

		System.out.println("반올림 수 : " + num);

	}

}
