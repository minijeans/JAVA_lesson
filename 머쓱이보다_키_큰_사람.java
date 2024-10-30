package 코테;

public class 머쓱이보다_키_큰_사람 {

	public static void main(String[] args) {
//		int[] array1 = {149, 180, 192, 170};
//		int height1 = 167;
		int count = 0;
		int[] array2 = { 180, 120, 140 };
		int height2 = 190;
		for (int i = 0; i < array2.length; i++) {
			if (array2[i] > height2) {
				count++;
			}
		}
		System.out.println(count);

	}

}
