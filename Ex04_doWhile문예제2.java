package 반복문;

import java.util.Scanner;

public class Ex04_doWhile문예제2 {

	public static void main(String[] args) {
		// [예제] plus game (do-While문 활용)
		// 랜덤수 만드는 방법
		// (int)(Math.random()*10)+1;
		// 1~10 사이의 랜덤수 생성

		// (int)(Math.random()*100)+1;
		// 1~100 사이의 랜덤수 생성

		Scanner sc = new Scanner(System.in);
		int ran1;
		int ran2;

		do {
			ran1 = (int) (Math.random() * 10) + 1;
			ran2 = (int) (Math.random() * 10) + 1;
			System.out.print(ran1 + "+" + ran2 + "=");
			int answer = sc.nextInt();

			if (ran1 + ran2 == answer) {
				System.out.println("Success");
			} else {
				System.out.println("Fail");
				System.out.print("계속 하시겠습니까? >> ");
				String lang = sc.next();

//				if (lang.equals("Y")) {
//					continue;
//				} else 
				if (lang.equals("N")) {
					System.out.println("종료합니다.");
					break;
				}

			}
		} while (true);

		// 1. 랜덤수 2개를 뽑아서
		// 2. 사용자에게 랜덤수끼리 더한 값을 입력하게 하기
		// 3. 정답을 맞추면 계속 진행
		// 4. 정답을 틀리면
		// 계속할래? -- Y 입력 --> 킵고잉
		// N 입력 --> 종료

	}

}
