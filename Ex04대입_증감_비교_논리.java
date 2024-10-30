package 연산자;

public class Ex04대입_증감_비교_논리 {

	public static void main(String[] args) {
		// 1. 대입연산자
		// 연산의 결과를 담을 때 사용하는 연산자
		// *복합대입연산자 : +=, -=, *=, /= , %=...
		// ex) num += 3 => num = num + 3
		// ex) num *= 3 => num = num * 3
		int num1 = 10;
		num1 -= 5;

		// 2. 증감연산자
		// 변수에 저장된 값에 +1 or -1
		// ++(증가) --(감소)
		// ++변수 => 증가 후 변수 사용
		// 변수++ => 변수 사용 후 증가
		int num2 = 5;
		System.out.println(num2++); // 5
		System.out.println(++num2); // 7
		System.out.println(num2); // 7

		// 3. 비교연산자
		// 결과값이 boolean형태 (참/거짓)
		// <, >, >=, <=
		// ==(같니?) !=(다르니?)
		System.out.println(5 == 3);
		System.out.println(3 == 3);

		// 4. 논리연산자
		// 피연산자가 반드시 boolean 값이어야 함
		// !피연산자 : NOT
		// 피연산자&&피연산자 : AND (둘다 참일때만 true)
		// 피연산자||피연산자 : OR (하나라도 참이면 true)
		System.out.println(3 > 5 || 7 < 8);
		System.out.println(3 > 5 && 7 > 8);

	}

}
