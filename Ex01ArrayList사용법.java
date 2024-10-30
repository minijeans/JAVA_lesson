package ArrayList;

import java.util.ArrayList;

public class Ex01ArrayList사용법 {

	public static void main(String[] args) {
		// ArrayList
		// - 배열의 상위호환
		// - 데이터를 여러개 담을 수 있는 자료구조의 일종

		// ArrayList의 특징
		// - 다른 자료형끼리도 저장이 가능
		// - 들어가 있는 데이터의 크기만큼 길이가 맞춰진다(가변적)
		// => 추가/삭제 가능
		// - 데이터들 사이에 빈 공간은 들어갈 수 없다

		// ArrayList 만들기
		ArrayList list = new ArrayList();

		// 데이터 추가 - add()
		list.add("미리");
		list.add("희진");

		// 데이터 중간 삽입
		list.add(1, "승겸");

		list.add("재영");

		// 리스트 출력
		System.out.println(list);

		// 특정 인덱스 요소 알아내기
		System.out.println(list.get(1));

		// 특정 인덱스 요소 삭제하기
		list.remove(0);

		// 특정 인덱스 요소 수정하기
		list.set(3, "정환");
		System.out.println(list);

		// 리스트의 모든 요소 삭제하기
		list.clear();

		System.out.println(list.size());

	}

}
