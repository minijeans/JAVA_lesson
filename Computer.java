package 묵찌빠게임;

public class Computer extends Player {

	public Computer(String name) {
		super(name);
	}

	@Override
	public String next() {
		int randomIndex = (int) (Math.random() * 3);
		// TODO Auto-generated method stub
		lastBet = bet[randomIndex];
		System.out.println("AI >> " + lastBet);
		return lastBet;
	}

}
