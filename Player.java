package 묵찌빠게임;

abstract public class Player {
	protected String bet[] = { "묵", "찌", "빠" };
	protected String name; // 선수 이름
	protected String lastBet = null; // 선수가 최근에 낸 값

	protected Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getBet() {
		return lastBet;
	}

	abstract public String next(); // 선수가 낸 것으로, 묵, 찌, 빠 중 1개를 결정하여 리턴
}
