package 변수;

public class Ex01변수 {

	public static void main(String[] args) {
		// 1. 변수
		// 1-1. 변수 선언하기
		// 저장 공간을 생성한 것, 값을 넣은 상태는 아님

		// 정수형 데이터를 저장할 수 있는 a라는 이름의 변수를 선언
		int a;

		// 1-2. 변수에 값 할당하기
		// 생성된 저장 공간(변수)에 값을 넣는 것

		// a라는 변수에 20이라는 정수형 데이터를 넣기(대입하기)
		a = 20; // = -> 대입연산자, "오른쪽에 있는 값을 왼쪽에 넣겠다"

		// 1-3. 변수 선언과 동시에 값 할당
		int b = 30;

		// 코드 아래에 빨간 줄 => 컴파일 오류
		// 컴파일 오류 : 컴파일이 되지 않는다 = 번역이 불가능하다 => 실행이 되지 않는다!
		// 빨간 줄을 만났을 때는 빨간줄에 마우스를 갖다 대서 어떤 오류인지 꼭 읽어보자!

		// 코드 아래에 노란 줄 => 경고(실행에는 문제가 없지만, 공부를 위해 한번쯤 확인해보자!)

		// 1-4. 주의사항
		// - 키워드 사용 불가능(final, class...)
		// - 이름 중복 선언 불가능

		// 2. 상수
		// 상수란? 변하지 않는 수

		// 2-1. 상수 선언
		final int c;

		// 2-2. 상수에 값 할당하기
		c = 30;

		// 2-3. 상수에 값 대입하기
		// c = 40; -> 상수는 값을 재할당 할 수 없다

		// 2-4. 상수를 선언하는 동시에 값 할당하기
		final int d = 50;

		// 3. 변수명 네이밍 규칙
		// 헝가리안 표기법
		// - 자료형을 접두어로 붙이는 방식
		int intNum;

		// 카멜 표기법
		// - 두번째 단어의 알파벳을 대문자
		// - 일반적으로 변수명 규칙으로 많이 사용
		int myNumberList;

		// 파스칼 표기법
		// - 클래스나 프로젝트명 규칙으로 많이 사용
		int MyNumberList;

		// 언더바 표기법(스네이크)
		// - 상수명 규칙으로 많이 사용
		final int MY_NUMBER;

	}

}
