package 상속;

public class phoneMain {

	public static void main(String[] args) {

		// 메인 클래스
		// p가 할수있는것 : 전화, 문자
		Phone p = new Phone();
		p.call();
		p.message();

		FeaturePhone f = new FeaturePhone();
		// s가 할 수 있는 것: 전화, 문자(상속받음), 카메라
		f.call();
		f.message();
		f.photo();

		SmartPhone s = new SmartPhone();
		// s가 할 수 잇는 것
		// 전화,문자 / 카메라 (상속받음)
		// 카메라->재정의(오버라이딩)
		s.call();
		s.message();
		s.photo();

	}

}
