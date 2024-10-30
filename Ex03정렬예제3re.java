package 정렬알고리즘;

public class Ex03정렬예제3re {

	public static void main(String[] args) {
		int[] point = { 92, 32, 52, 9, 81, 2, 68 };
		int abs = 0;
		int result = point[0] - point[1];
		int index1 = 0;
		int index2 = 0;

		for (int i = 0; i < point.length; i++) {
			for (int j = 0; j < point.length; j++) {

				// 절댓값 처리
				if (point[i] - point[j] < 0) {
					abs = -(point[i] - point[j]);
				} else {
					abs = point[i] - point[j];
				}

				if (abs < result && i != j) {
					result = abs;
					index1 = i;
					index2 = j;
				}
			}
		}
		System.out.println(index1 + " " + index2);

	}

}
