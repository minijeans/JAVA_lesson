package 배열;

public class Ex01배열기초 {

	public static void main(String[] args) {
		// 배열(Array) 자료구조: 같은 타입의 여러 데이터를 하나의 묶음으로 다루는 자료구조

		// 배열의 특징
		// 1. 같은 자료형끼리만 하나로 묶을 수 있다
		// 2. 인덱스 번호를 가지고 있다. 인덱스 번호는 0부터 차례로 1씩 증가한다
		// 3. 크기가 고정적입니다

		// 배열 선언하는 방법

		// ex) 정수형 데이터 5개를 담을 수 있는 numbers 배열 생성
		int[] numbers = new int[5];

		// 배열 안에 데이터를 저장하는 방법 -> 정확하게 방번호(인덱스번호)를 지정한 후 저장

		// numbers 배열의 0번 인덱스에 0이라는 데이터를 넣겠다
		numbers[0] = 0;

		// numbers 배열의 3번 인덱스에 15라는 데이터를 넣겠다
		numbers[3] = 15;

		// 인덱스를 초과하면 오류 발생!
		// numbers[5] = 4;

		// 예제
		// 1. 정수형 데이터 5개를 저장할 수 있는 array라는 이름의 배열 선언
		// 2. array 안에 순서대로 6,3,8,4,2를 넣어주세요 -> array의 0번방에 6..
		// 3. 배열 안의 데이터 중에서 가장 큰 값이 무엇인지 출력
		// -> 0~4번 인덱스까지 반복하면서 숫자끼리 값을 비교해서 최대값을 업데이트
		// 4. 출력 -> array에 들어가는 값은 [6,3,8,4,2] -> 가장 큰 값은 8입니다.

		int array[] = new int[5];
		array[0] = 6;
		array[1] = 3;
		array[2] = 8;
		array[3] = 4;
		array[4] = 2;

		int max = 0;
		System.out.print("array에 들어가는 값은 [");
		for (int i = 0; i < 5; i++) {
			// 만약에 최대값을 담는 max 값보다 array[i]방이 더 크면
			if (max < array[i]) {
				// max의 값을 array[i]로 업데이트
				max = array[i];
			}
			System.out.print(array[i] + ",");
		}
		System.out.println("]");

		System.out.print("가장 큰 값은 " + max);

	}

}
