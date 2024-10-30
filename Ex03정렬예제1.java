package 정렬알고리즘;

import java.util.Arrays;
import java.util.Random;

public class Ex03정렬예제1 {

	public static void main(String[] args) {
		// 버블정렬
		Random ran = new Random();
		int[] arr = new int[10];

		for (int i = 0; i < 10; i++) {
			arr[i] = ran.nextInt(100) + 1;
		}

		for (int j = 0; j < arr.length - 1; j++) {
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i + 1];
					arr[i + 1] = arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
