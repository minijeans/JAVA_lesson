package 코테;

import java.util.Arrays;

public class 최댓값_만들기1 {

	public static void main(String[] args) {
		
		int[] arr = {0, 31, 24, 10, 1, 9};
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr.length-1; j++) {
				if(arr[j]<arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println(arr[0]*arr[1]);

	}

}
