package 코테;

import java.util.Scanner;

public class n의_배수_고르기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] numlist = new int[5];

		for (int i = 0; i < numlist.length; i++) {
			System.out.print(i + "번째 인덱스 입력 > ");
			numlist[i] = sc.nextInt();
		}
		System.out.print("배수를 입력해주세요 > ");
		int n = sc.nextInt();
		
		System.out.print(n + "의 배수는 ");

		for (int j = 0; j < numlist.length; j++) {
			if (numlist[j] % n == 0) {
				System.out.print(numlist[j]+" ");
			}
		}
		System.out.print("입니다");

	}

}
