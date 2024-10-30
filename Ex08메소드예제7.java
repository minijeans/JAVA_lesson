package 메소드;

import java.lang.reflect.Array;

public class Ex08메소드예제7 {

	public static void main(String[] args) {
		int[] array = { 1, 3, 4, 8, 9, 10 };
		arrayToString(array);
	}

	public static void arrayToString(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
