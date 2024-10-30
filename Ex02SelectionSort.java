package 정렬알고리즘;

import java.util.Arrays;

public class Ex02SelectionSort {

	public static void main(String[] args) {
//		// 선택 정렬
//		// 가장 크거나 작은 원소를 찾아서 배열의 처음부터 끝을 교체해 나가는 정렬 방법
//
//		int[] array = { 46, 2, 15, 186, 131 };
//		System.out.println("초기값 : " + Arrays.toString(array));
//
//		int maxIndex = 0;
//
//		// Step 1
//		// 기준 인덱스 : 0
//		// 가장 큰 수에 해당하는 인덱스 번호
//		for (int i = maxIndex; i < array.length; i++) {
//			System.out.println(maxIndex + "와" + i+"인덱스끼리 비교");
//			if (array[maxIndex] < array[i]) {
//				System.out.println(i+"가 더 크다");
//				// 기준 인덱스보다 큰 데이터가 있으면 치환
//				// 최대 인덱스 번호만 찾아서 나가기
//				maxIndex = i;
//				System.out.println("최대 인덱스는" + i);
//
//			}
//		}
//		System.out.println("최대값 : " + maxIndex+ "인덱스");
//		
//		// 교환 작업
//		int temp = array[0];
//		array[0] = array[maxIndex];
//		array[maxIndex] = temp;
//		
//		// 결과 출력
//		System.out.println(Arrays.toString(array));
//		
//		// Step 2
//		// 기준 인덱스 : 0->1 변경
//		// 1~4번방을 비교해서 가장 큰 값의 인덱스 번호를 저장
//		// 교환 작업 하기(가장 큰 값을 담고 있는 인덱스와 기준 인덱스인 1끼리 교환
//		maxIndex = 1;
//		for (int i = maxIndex; i < array.length; i++) {
//			System.out.println(maxIndex + "와" + i+"인덱스끼리 비교");
//			if (array[maxIndex] < array[i]) {
//				System.out.println(i+"가 더 크다");
//				// 기준 인덱스보다 큰 데이터가 있으면 치환
//				// 최대 인덱스 번호만 찾아서 나가기
//				maxIndex = i;
//				System.out.println("최대 인덱스는" + i);
//				
//			}
//		}
//		System.out.println("최대값 : " + maxIndex+ "인덱스");
//		
//		// 교환 작업
//		temp = array[1];
//		array[1] = array[maxIndex];
//		array[maxIndex] = temp;
//		
//		// 결과 출력
//		System.out.println(Arrays.toString(array));

		int[] array = { 46, 2, 15, 186, 131 };

		for (int k = 0; k < array.length; k++) {

			int maxIndex = k; // 값을 바꿀 대상(0~4)

			for (int i = maxIndex; i < array.length; i++) {
				if (array[maxIndex] < array[i]) {
					maxIndex = i;
				}
			}
			// 교환 작업
			int temp = array[1];
			array[1] = array[maxIndex]; // 최대값 인덱스를 업데이트
			array[maxIndex] = temp;

			// 결과 출력
			System.out.println(Arrays.toString(array));
		}
	}

}
