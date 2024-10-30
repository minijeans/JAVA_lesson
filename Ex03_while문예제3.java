package 반복문;

import java.util.Scanner;

public class Ex03_while문예제3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int even = 0;
		int odd = 0;

		while (true) {
			System.out.print("정수 입력 : ");
			num = sc.nextInt();

			if (num == -1) {
				break;
			} else if (num % 2 == 0) {
				even++;
			} else {
				odd++;
			}
			System.out.println("짝수 개수 : " + even);
			System.out.println("홀수 개수 : " + odd);

		}
		System.out.println("종료되었습니다.");

	}

}
