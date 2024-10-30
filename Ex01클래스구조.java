package 클래스객체;

public class Ex01클래스구조 {

	public static void main(String[] args) {
		// 메인 메소드 : 프로그램의 시작점

		// 1. 인간에 대한 설계도를 만들어보기
		// Person.java에 만들었음!

		// 2. 그 설계도 기반으로 실제 인간들을 생성
		// 2-1 레퍼런스 변수, 객체 생성
		Person miri = new Person();

		// 2-2. 실제 객체에 데이터 할당
		miri.age = 20;
		miri.name = "미리";

		miri.eat();
		miri.introduce();
		miri.hello("방가방가");

		// 과제! 같은 설계도 기반으로 새로운 사람을 생성
		// 이름, 나이 데이터 담아야 하고 밥먹는 것도 한번 해보기!

		Person min = new Person();

		min.age = 26;
		min.name = "min";
		min.eat();
		min.introduce();

	}

}
