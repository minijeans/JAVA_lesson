package 상속;

public class SmartPhone extends FeaturePhone {
	// Phone과 FeaturePhone을 물려받고, 쿠키런 게임(game)을 추가
	// 기존 FeaturePhone의 카메라 메소드를 변경

	public void game() {
		System.out.println("쿠키런 게임 시작~");
	}

	// 오버라이딩
	// 부모클래스 메소드의 동작 방법을 변경
	// 매개변수의 개수, 순서, 타입과 리턴타입은 같아야 함
	public void photo() {
		System.out.println("화질 짱좋은 사진 찍기~");
	}

}
