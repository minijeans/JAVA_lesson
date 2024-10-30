package 반복문;

import java.util.Scanner;

public class Ex04_반복문예제2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ran = (int) (Math.random() * 100) + 1;
		int num = 0;

		do {
			System.out.print("1과 100사이의 정수를 입력하세요 >> ");
			num = sc.nextInt();
			if (num < ran) {
				System.out.println("더 큰 수로 다시 시도해보세요");
			} else if (num > ran) {
				System.out.println("더 작은 수로 다시 시도해보세요");
			} else {
				System.out.println(ran + " 정답입니다!!");
				break;
			}

		} while (true);

	}

}
