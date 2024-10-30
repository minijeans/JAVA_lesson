package 인터페이스;

public abstract class Animal extends Creature {
	
	// Creature의 추상메소드를 재정의
	public void alive() {
		System.out.println("숨을 쉬면서 살아있습니다~");
	}

	// Animal의 추상메소드
	public abstract void move();
	
	// 사람은 Humal 고래 Whale 앵무새 Parrot
}
