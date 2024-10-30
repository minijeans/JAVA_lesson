package 조건문;

import java.util.Scanner;

public class Ex08_switch예제2 {

	public static void main(String[] args) {
		// 사용자에게 월을 입력받아서 계절을 출력하는 프로그램

		// 1. 입력도구 꺼내기
		Scanner sc = new Scanner(System.in);

		// 2. 사용자가 입력한 숫자를 month에 저장
		System.out.print("월 입력 >> ");
		int month = sc.nextInt();

		// 3. month의 값을 비교해서 결과 출력 (switch문)
		// if에서 1~12아닌 숫자 넣었을 때 예외처리 문구 else하고 switch문 사용 month/3이 1일때, 2일때, 3일때 겨울은
		// default처리
		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("겨울");
			break;
		default:
			System.out.println("1~12사이 숫자 입력해줘~");
		}
		// + 예외처리 - "1~12사이 숫자 입력해줘~"

	}

}
