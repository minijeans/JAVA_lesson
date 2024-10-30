package 코테;

import java.util.Arrays;

public class 배열_뒤집기 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int[] newArr = new int[5];

		// int count = 0;
		// for(int i = 4; i >= 0; i-- ) {
		// newArr[count] = arr[i];
		// count++;
		// }

		for (int i = 0; i < newArr.length; i++) {
			newArr[i] = arr[arr.length - 1 - i];
		}

		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("newArr : " + Arrays.toString(newArr));
	}

}
