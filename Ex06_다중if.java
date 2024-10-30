package 조건문;

import java.util.Scanner;

public class Ex06_다중if {

	public static void main(String[] args) {
		// 사용자에게 점수를 입력받은 뒤, 점수에 따른 학점을 출력
		// 90점 이상 A, 80점 이상 B, 70점 이상 C, 그 이하 D

		Scanner sc = new Scanner(System.in);
		int totalScore = sc.nextInt();

		// 만약에 사용자가 0~100 이외 점수를 입력했을 때
		// 출력 "잘못된 값입니다"

		if (totalScore > 100 || totalScore < 0) {
			System.out.println("잘못된 값입니다.");
		} else if (totalScore >= 90) {
			System.out.println("A");
		} else if (totalScore >= 80) {
			System.out.println("B");
		} else if (totalScore >= 70) {
			System.out.println("C");
		} else {
			System.out.println("D");
		}

	}

}
