package 코테;

public class 분수의_덧셈 {

	public static void main(String[] args) {
		int numer1 = 9;
		int denom1 = 2;
		int numer2 = 1;
		int denom2 = 3;
		int denom = 0;
		int numer = 0;

		denom = denom1 * denom2;
		numer = denom1 * numer2 + denom2 * numer1;

		if (denom > numer) {
			for (int i = 1; i < denom; i++) {
				if (denom % i == 0 && numer % i == 0) {
					denom /= i;
					numer /= i;
				}
			}
		} else {
			for (int i = 1; i < numer; i++) {
				if (denom % i == 0 && numer % i == 0) {
					denom /= i;
					numer /= i;
				}
			}
		}
		System.out.println(numer + " " + denom);
	}

}
