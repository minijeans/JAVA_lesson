package 조건문;

import java.util.Scanner;

public class Ex03_ifElse숙제4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("피자 조각 수를 입력하세요");
		int slice = sc.nextInt();
		System.out.println("사람 수를 입력하세요");
		int num = sc.nextInt();

		if (num % slice == 0) {
			System.out.println(num / slice);
		} else {
			System.out.println(num / slice + 1);
		}

	}
}
