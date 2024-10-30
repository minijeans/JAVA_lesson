package 연산자;

import java.util.Scanner;

public class Ex08삼항연산자예제3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("농구공의 개수를 입력하세요 : ");
		int num = sc.nextInt();
		System.out.println((num % 5 == 0) ? "필요한 상자의 수 : " + num / 5 : "필요한 상자의 수 : " + (num / 5 + 1));

	}

}
