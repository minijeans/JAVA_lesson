package 메소드;

public class Ex07메소드예제6 {

	public static void main(String[] args) {

		int[] array = { 15, 10, 2, 8, 23 };
		System.out.println("평균값은 " + average(array));

	}

	public static double average(int[] a) {
		double sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum / a.length;
	}

}
