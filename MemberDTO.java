package Model;

public class MemberDTO {

	// Model : 데이터를 관리하는 코드 모음
	// DTO(Data Transfer Object)
	// -> 데이터를 가져오거나(getter), 변경하기(setter)

	// 1. 필드 -> 아이디, 비번, 이름, 나이 (private)
	private String id;
	private String pw;
	private String name;
	private int age;

	// 2. 메소드

	// 생성자 메소드
	public MemberDTO(String id, String pw, String name, int age) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
	}

	public MemberDTO(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}

	public MemberDTO(String id, int age, String name) {
		this.id = id;
		this.age = age;
		this.name = name;
	}
	
	public MemberDTO(String id, String pw, int age) {
		this.id = id;
		this.pw = pw;
		this.age = age;
	}

	// id, pw, 이름, 나이 데이터를 요청하면 return으로 돌려주는 메소드(getter)
	public String getId() {
		return id;
	}

	public String getPw() {
		return pw;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

}
