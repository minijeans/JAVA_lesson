package 코테;

import java.util.Scanner;

public class 세균_증식 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("세균의 마리수 n을 입력해주세요 : ");
		int n = sc.nextInt();
		System.out.print("경과한 시간 t를 입력해주세요 : ");
		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {
			n *= 2;
		}

		System.out.println(n);

	}

}
