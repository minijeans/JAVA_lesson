package 이차원배열;

public class Ex03이차원배열예제2 {

	public static void main(String[] args) {
		int[][] array = new int[5][5];
		int count = 21;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				array[i][j] = count++;
			}
		}
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i % 2 == 0) {
					System.out.print(array[i][j] + "\t");
				} else {
					System.out.print(array[i][4 - j] + "\t");
				}
			}
			System.out.println();
		}

	}

}
