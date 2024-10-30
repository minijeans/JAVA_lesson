package 반복문;

import java.util.Scanner;

public class Ex10_for문예제심화1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		int result = 0;
		int ten = 1;

		/*
		 * while(num<0){
		 * 	result += num % 10
		 * 	num /= 10
		 * }
		 * */
		for (int i = 1; i <= 8; i++) {
			ten *= 10;
			result += (num % ten) / (ten / 10);
		}

		System.out.println("합은 " + result + "입니다.");

	}

}
