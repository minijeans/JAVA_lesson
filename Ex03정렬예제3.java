package 정렬알고리즘;

import java.util.Arrays;

public class Ex03정렬예제3 {

	public static void main(String[] args) {
		
		int[] arr = {92,32,52,9,81,2,68};
		int[] point = {92,32,52,9,81,2,68};
		
		for (int i = 0; i < point.length; i++) {
			for (int j = 0; j < point.length-1; j++) {
				int minpoint = j;
				
				if(point[i]<point[j]) {
					minpoint = j;
					
					int temp = point[i];
					point[i] = point[j];
					point[j] = temp;
				}
			}
		}
		
		int min1 = 0;
		int min2 = 0;
		int result = point[1]-point[0];
		for (int k = 0; k < point.length-1; k++) {
			if( result >= point[k+1]-point[k]) {
				result = point[k+1]-point[k];
				min1 = point[k+1];
				min2 = point[k];
			}
		}
		
		int result1 = 0;
		int result2 = 0;
		for (int m = 0; m < point.length-1; m++) {
			if(arr[m]==min1) {
				result1 = m;
			}
			if(arr[m]==min2) {
				result2 = m;
			}
		}
		
		System.out.println(result1 +","+ result2);
	}
	

}
