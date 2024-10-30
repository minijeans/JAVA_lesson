package 클래스객체;

public class Bank {

	// 속성-필드
	// private : 접근제한자, 외부 파일에서 이 데이터를 건드릴 수 없도록 조치
	private int money = 0; // 잔액

	// 기능-메소드

	// 잔액조회 기능
	public int showmoney() {
		return money;
	}

	// 입금 기능
	public void deposit(int m) {
		money += m;
		System.out.println("입금 완료");
	}

	// 출금 기능
	public void withdraw(int m) {
		if (money >= m) {
			money -= m;
			System.out.println("출금 완료");
		} else {
			System.out.println("잔액이 부족합니다.");
		}
	}

}
