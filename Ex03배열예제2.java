package 배열;

import java.util.Random;

public class Ex03배열예제2 {

	public static void main(String[] args) {
		// 랜덤수 만들기
		Random ran = new Random();
		// 1~100까지의 숫자 중에서 랜덤으로 하나 꺼내옴
		// System.out.println(ran.nextInt(100)+1);

		// 홀수 찾기

		// 1. 정수형 데이터 5개를 담을 수 있는 배열(array) 선언
		int[] array = new int[5];
		int count = 0;

		// 2. 배열 안 값들을 랜덤으로 저장(1~100)
		// ex) array의 0번방에 랜덤값(1~100)저장
		// array[0] = ran.nextInt(100)+1;
		for (int i = 0; i < array.length; i++) {
			array[i] = ran.nextInt(100) + 1;
		}
		System.out.print("array에 들어있는 홀수는 ");
		// 3. 배열 안 데이터 중에서 홀수인 값만 출력하기
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 1) {
				count += 1; // count++;
				System.out.print(array[i] + " ");
			}
		}
		System.out.print("이고, 총 " + count + "개입니다.");

		// 4. 홀수가 총 몇개인지 출력
		// ex) array에 들어있는 홀수는 53 45 31 이고, 총 3개입니다

	}

}
