package 메소드;

public class Ex04메소드예제3 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 3;

		boolean divisor = isDivisor(num1, num2);

		System.out.println(divisor);

	}

	public static boolean isDivisor(int n1, int n2) {
		if (n1 % n2 == 0) {
			return true;
		} else {
			return false;
		}
	}

}
