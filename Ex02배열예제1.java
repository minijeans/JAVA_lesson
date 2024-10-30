package 배열;

import java.util.Arrays;
import java.util.Scanner;

public class Ex02배열예제1 {

	public static void main(String[] args) {
		// 1. 성적 데이터를 저장할 수 있는 배열 생성
		// 2. 성적 입력받기(5개)
		// 3. array 배열에 들어있는 데이터를 전부 출력
		// 4. 최고 점수(max), 최저 점수(min), 총합(sum), 평균(avg)
		// 팁! 평균은 sum을 5로 나눈 값

		Scanner sc = new Scanner(System.in);

		int[] array = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.print(i + 1 + "번째 입력 >> ");
			array[i] = sc.nextInt();
		}

		// System.out.println("입력된 점수 : " + Arrays.toString(array));
		System.out.print("입력된 점수 : ");

		for (int i = 0; i < array.length - 1; i++) {
			System.out.print(array[i] + ", ");
		}

		int max = 0;
		int min = array[0];
		int sum = 0;
		float avg = 0;

		System.out.println(array[4]);

		// 배열이름.length => 해당하는 배열의 길이
		for (int i = 0; i < array.length; i++) {
			// 최고점수
			if (array[i] > max) {
				max = array[i];
			}
			// 최저점수
			if (array[i] < min) {
				min = array[i];
			}
			// 총합
			sum += array[i];
		}
		// 평균
		avg = (float) sum / array.length;

		System.out.println("최고 점수 : " + max);
		System.out.println("최저 점수 : " + min);
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + avg);

	}

}
