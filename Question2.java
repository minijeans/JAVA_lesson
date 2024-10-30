package Test;

public class Question2 {
	
	public static void main(String[] args) {
		Tv t = new Tv();
		
		t.channel = 7;
		t.color = "red";
		t.print(); // 현재 Tv의 상태 출력
		t.channelUp();
		t.channelUp();
		t.print();
		t.color = "black";
		t.channelDown();
		t.print();

	}

}

class Tv {


	int channel;
	String color;
	
	void print(){
		System.out.println("Tv의 현재 채널은 : " + channel + "이고, " + "Tv의 색깔은 " + color + " 입니다." );
	}
	
	void channelUp() {
		channel += 1;
	}
	
	void channelDown() {
		channel -= 1;
	}
	
}
