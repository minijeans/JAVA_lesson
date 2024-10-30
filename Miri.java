package 추상화;

// 추상클래스인 Student를 상속받는 Miri 클래스
public class Miri extends Student {

	String name;
	String position;

	// 생성자
	public Miri(String n, String p) {
		this.name = n;
		this.position = p;
	}

	@Override
	public void study() {
		// 상속받은 Student(추상클래스)의 추상메소드인 study는 반드시 자식클래스에서 오버라이딩(재정의) 해줘야 한다!
		System.out.println(this.position + "로 향하는 여정....");
	}

}
