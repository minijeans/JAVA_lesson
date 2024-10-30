package 정렬알고리즘;

import java.util.Arrays;
import java.util.Random;

public class Ex03정렬예제2 {

	public static void main(String[] args) {
		// 선택정렬
		Random ran = new Random();
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(100) + 1;
		}

		for (int i = 0; i < arr.length; i++) {
			for (int k = 0; k < arr.length; k++) {
				int minIndex = k;

				if (arr[i] < arr[minIndex]) {
					int temp = arr[i];
					arr[i] = arr[minIndex];
					arr[minIndex] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
