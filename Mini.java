package 추상화;

public class Mini extends Student {

	String name;
	String position;

	public Mini(String n, String p) {
		this.name = n;
		this.position = p;
	}

	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println(this.name + "이가 " + this.position + "으로 향하는 여정....");
	}

}
