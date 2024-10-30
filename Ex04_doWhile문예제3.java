package 반복문;

import java.util.Scanner;

public class Ex04_doWhile문예제3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String real_id = "test";
		String real_pw = "test1234";
		String id = "";
		String pw = "";
		
		// 로그인시도 횟수 카운트
		int i = 0;
		
		do {
			System.out.print("아이디를 입력하세요 : ");
			id = sc.next();
			System.out.print("비밀번호를 입력하세요 : ");
			pw = sc.next();

			if (id.equals(real_id) && pw.equals(real_pw)) {
				System.out.println("로그인 성공!");
				break;
			} else {
				System.out.println("로그인 실패..!");
				i++;
				if (i == 3) {
					System.out.println("아이디와 비밀번호가 3회 틀렸습니다.");
					break;
				}

			}
		} while (true);

	}

}
