package 메소드;

public class Ex05메소드예제4 {

	public static void main(String[] args) {
		int num = 10;
		int result = getSumOfDivisors(num);

		System.out.println(num + "의 약수의 합 : " + result);

	}

	public static int getSumOfDivisors(int n) {
		int result = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				result += i;
			}
		}
		return result;
	}

}
