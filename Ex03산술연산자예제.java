package 연산자;

import java.util.Scanner;

public class Ex03산술연산자예제 {

	public static void main(String[] args) {
		// [예제] 100의 자리 이하를 버리는 연산

		// 1. 입력받는 도구 꺼내오기
		Scanner sc = new Scanner(System.in);

		// 2. 사용자에게 정수 1개를 입력받기
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		// 3. 정수의 백의자리 이하를 버리기
		// ---> 백의자리 이하를 버리는 걸 머리에서 어떻게 계산했는지 생각해보기
		// ---> 코드로 작성하는게 어려울 거예요!!
		// result1 = num-num%100
		// result2 = num/100*100

		// 4. 결과값 출력하기
		System.out.println("결과 값 : " + (num - num % 100));

	}

}
