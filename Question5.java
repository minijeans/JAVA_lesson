package Test;

public class Question5 {

	public static void main(String[] args) {
		goBusan(new Train());
		goBusan(new Bus());
		goBusan(new Airplane());
	}
	
	private static void goBusan(transport b) {
		b.go();
	} // 각각의 경우마다 goBusan에 들어가는 변수가 Train b, Bus b, Airplan b로 나눠지면 답이 나오는데
}

class transport extends Question5{
	
	void go(){
		
	};
}

class Train extends transport{
	
	void go(){
		System.out.println("기차타고 부산간다");
	}
	
}

class Bus extends transport{
	void go() {
		System.out.println("버스타고 부산간다");
	}
}

class Airplane extends transport{
	void go() {
		System.out.println("비행기 타고 부산간다.");
	}
}
