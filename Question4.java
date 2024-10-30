package Test;

public class Question4 {

}

class MobilePhone {
	public String phoneNumber;
	
	public void call() {
		System.out.println("전화걸기");
	}
	
	public void message() {
		System.out.println("문자보내기");
	}
	
}

class CameraPhone extends MobilePhone{

	public void picture() {
		System.out.println("사진찍기");
	}
	
	public void music() {
		System.out.println("노래듣기");
	}
	
}

class SmartPhone extends CameraPhone{
	public String usimID;
	
	public void kakaoTalk() {
		System.out.println("카톡보내기");
	}
	
	public void wifi() {
		System.out.println("무료 인터넷접속하기");
	}
}

