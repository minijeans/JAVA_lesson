package 변수;

public class Ex02자료형 {

	public static void main(String[] args) {

		// 자바의 기본 자료형
		// 1) 논리 자료형 : boolean (1byte)
		// : 참 혹은 거짓을 저장하는 자료형
		// 참 이라는 데이터를 저장하는 bool 변수 선언
		boolean bool = true;
		System.out.println(bool);

		// 2) 문자 자료형 : char (2byte)
		// : 따옴표를 사용해서 작성하고, 딱 한 글자만 저장할 수 있다
		char name = '민';

		// + 문자열 자료형 (기본 자료형이 아님!)
		// String : 쌍따옴표를 사용해서 작성하고, 여러 글자가 들어갈 수 있음!
		String name2 = "민희진";

		// 3) 정수 자료형
		// byte(1byte), short(2byte), int(4byte), long(8byet)
		// --> 데이터의 크기가 의미하는 건 표현할 수 있는 범위!
		int num = 4;

		// 4) 실수 자료형
		// float(4byte), double(8byte) >> 기본값 double
		double num3 = 3.14;
		float num4 = (float) 3.14;
		float num5 = 3.14f; // 일종의 키워드!

		// 1. 강제 형변환(명시적 형변환)
		// 큰 크기의 자료형에서 더 작은 크기의 자료형으로 변환할 때 사용
		// 데이터 손실이 발생할 수 있기 때문에 정확하게 () 사용해서 손실이 일어나도 괜찮다고 명시해주는 방식
		byte num1 = (byte) 128;

		// 2. 묵시적 형변환
		int num6 = 10;
		double num7 = num6;
		System.out.println(num7);

	}

}
