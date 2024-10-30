package 메소드;

public class Ex02메소드예제1 {

	public static void main(String[] args) {
		int num1 = 50;
		int num2 = 15;
		char op = '-';

		System.out.println(cal(num1, num2, op));

	}

	public static int cal(int a1, int a2, char o) {
		if (o == '+') {
			return a1 + a2;
		} else if (o == '-') {
			return a1 - a2;
		} else if (o == '*') {
			return a1 * a2;
		} else
			return a1 / a2;

	}

}
