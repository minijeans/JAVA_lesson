package 반복문;

import java.util.Scanner;

public class Ex02_while문예제2 {

	public static void main(String[] args) {
		// [예제] 정수 누적해서 더하기
		// - while문을 사용해서 입력받은 값 누적하여 더하기
		// - 종료 조건 : 사용자가 -1을 입력하였을 경우
		// - 입력받은 값(num), 누적데이터(count)

		Scanner sc = new Scanner(System.in);

		// 사용자에게 최초의 정수 입력
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		// 사용자가 입력한 수를 누적시킬 변수(count)
		int count = num;
		System.out.println("누적결과 : " + count);

		while (num != -1) {
			// count += num;
			// System.out.println("누적 >> " + count);
			// System.out.println("정수입력 >>");
			// num = sc.nextInt();
			System.out.print("정수 입력 : ");
			num = sc.nextInt();
			// 사용자가 입력한 수를 누적해서 더해주기
			count += num;
			System.out.println("누적결과 : " + count);

			if (num == 3) {
				// num3이 3이면 멈출래!
				// break; = 반복문을 빠져나가는 역할
				break;
			}
		}

		System.out.println("종료되었습니다.");

	}

}
