package 묵찌빠게임;

import java.util.Scanner;

public class Game {
	Player players[] = new Player[2];
	private String owner;

	public boolean winnerCheck(String humanBet, String computerBet) {
		if (humanBet.equals(computerBet)) {
			System.out.println(owner + "가 이겼습니다.");
			System.out.println("게임을 종료합니다.");
			return false;
		} else {
			if ((humanBet.equals("묵") && computerBet.equals("빠")) || (humanBet.equals("찌") && computerBet.equals("묵"))
					|| (humanBet.equals("빠") && computerBet.equals("찌"))) {
				owner = players[1].name;
				System.out.println("오너가 " + owner + "로 변경되었습니다.");
			} else {
				owner = players[0].name;
				System.out.println("오너가 " + owner + "로 변경되었습니다.");
			}
			return true;
		}

	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("***** 묵찌빠 게임을 시작합니다. *****");
		System.out.println("선수이름 입력 >> ");
		players[0] = new Human(sc.next());
		System.out.println("컴퓨터이름 입력 >> ");
		players[1] = new Computer(sc.next());
		owner = players[0].name;
		System.out.println("2명의 선수를 생성 완료하였습니다.");
		System.out.println();

		String humanBet;
		String computerBet;
		do {
			humanBet = players[0].next();
			computerBet = players[1].next();
			System.out.println(players[0].name + " : " + humanBet + " , " + players[1].name + " : " + computerBet);
		} while (winnerCheck(humanBet, computerBet)); // return false가 될때까지 실행
	}

}
