package 반복문;

public class Ex10_for문예제1 {

	public static void main(String[] args) {
		// 1-2+3-4...+99-100까지 해서 홀수는 더하고 짝수는 빼면서 결과는 -50

		int num = 0;
		int result = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				num = -i;
			} else {
				num = i;
			}
			result += num;
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.println(result);

	}

}
