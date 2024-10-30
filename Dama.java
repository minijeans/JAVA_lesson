package 클래스객체;

import java.util.Random;
import java.util.Scanner;

public class Dama {
	Scanner sc = new Scanner(System.in);
	Random ran = new Random();

	// 데이터
	// - 체력(health), 행복도(happy)
	private int health = 0;
	private int happy = 0;
	private String name;
	
	public String name() {
		System.out.print("다마고치의 이름을 정해주세요! >> ");
		this.name = sc.next();
		return this.name;
	}

	// 기능
	// - 밥(eat) 잠(sleep) 놀기(play)

	// - 밥 : 체력+5
	public void eat() {
		System.out.println("냠냠><");
		// this 키워드 : 자기 자신을 의미
		this.health += ran.nextInt(10) + 1;
		this.happy += ran.nextInt(10) + 1;
		System.out.println();
	}

	// - 잠 : 체력+10 행복도-20
	public int sleep() {
		System.out.println("쿨쿨zz..");
		this.health += ran.nextInt(10) + 1;
		this.happy -= ran.nextInt(10) + 1;
		System.out.println();
		return this.happy;
	}

	// - 놀기 : 체력-20 행복도+30
	public int play() {
		System.out.println("꺅!");
		this.health -= ran.nextInt(10) + 1;
		this.happy += ran.nextInt(10) + 1;
		System.out.println();
		return this.health;
	}

	// - 초기화 : 체력, 행복도 데이터 초기화
	public void reset() {
		System.out.println("힝ㅜ");
		this.health = 0;
		this.happy = 0;
		System.out.println();
	}

	// - 상태확인
	public void show() {
		System.out.println("체력 " + this.health);
		System.out.println("행복도 " + this.happy);
		System.out.println();
	}

	// - 이름변경
	public String rename() {
		System.out.print("재설정할 이름을 입력해주세요 >> ");
		this.name = sc.next();
		return name;
	}

}
