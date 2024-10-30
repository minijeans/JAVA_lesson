package 코테;

import java.util.Arrays;

public class 배열_두배_만들기 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int[] newArr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i] * 2;
		}

		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("newArr : " + Arrays.toString(newArr));

	}

}
