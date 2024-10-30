package 반복문;

import java.util.Scanner;

public class Ex09_별찍기1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 1. for문 하나를 이용해서 결과창에
		// *****
		// *****
		// *****
		// *****
		// *****
		for (int i = 0; i < 5; i++) {
			System.out.println("*****");
		}
		System.out.println();

		// 2. 이중 for문을 활용해서
		// *
		// **
		// ***
		// ****
		// *****
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();

		// 3. 역별찍기
		// *****
		// ****
		// ***
		// **
		// *
		for (int i = 5; i > 0; i--) {
			// for(int j=i; j>0; j--)
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();

		// 4. 우측정렬
		// *
		// **
		// ***
		// ****
		// *****
		System.out.print("행 개수 : ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = num; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();

//		System.out.print("행 개수 : ");
//		num = sc.nextInt();
//
//		for (int i = 0; i < num; i++) {
//			System.out.println();
//			for (int j = 0; j <= i; j++) {
//				System.out.print("*");
//			}
//		}
//		
//		System.out.println();

		for (int i = 0; i < 5; i++) {
			for (int j = 5; i < j; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
