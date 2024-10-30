package 반복문;

import java.util.Scanner;

public class Ex04_dowhile문예제1 {

	public static void main(String[] args) {
		// do-while문은 마지막에 세미콜론을 붙여야 한다!!!

		// 1. 사용자에게 현재몸무게(weight), 목표몸무게(goal) 입력받기
		// 2. 반복문을 활용해서 주차별로 감량 몸무게를 입력받기
		// 2-1. 몇주차인지 카운트해주는 변수 필요 (count)
		// 3. 몸무게가 목표와 같거나 더 작아지면 종료!!

		Scanner sc = new Scanner(System.in);

		System.out.print("현재몸무게 : ");
		int now = sc.nextInt();

		System.out.print("목표몸무게 : ");
		int goal = sc.nextInt();

		// 주차 카운트 변수
		int week = 1;
		// 주차별 감량 몸무게
		int num = 0;

//		do {
//			System.out.println(week++ + "주차 감량 몸무게 >> ");
//			num = sc.nextInt();
//			now -= num;
//		} while(now>goal);

		while (goal < now) {
			System.out.print(week + "주차 감량 몸무게 : ");
			num = sc.nextInt();
			now -= num;
			week++;
		}
		System.out.println(now + "kg 달성!! 축하합니다!");

	}

}
