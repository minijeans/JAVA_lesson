package Test;

import java.util.ArrayList;
import java.util.Scanner;

public class MusicPlayer {
	public static void main(String[] args) {
		
		MusicController music = new MusicController();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("====뮤직플레이어====");
			System.out.println("1.등록 2.목록 3.실행 4.이전곡 5.다음곡 6.종료 >> ");
			int choice = sc.nextInt();
			
			// 1. 등록
			if(choice == 1) {
				
				System.out.println("====등록====");
				System.out.println("제목 : ");
				String title = sc.next();
				System.out.println("가수 : ");
				String singer = sc.next();
				System.out.println("시간 : ");
				int playTime = sc.nextInt();
				
				music.musicAdd(title, singer, playTime);
				
			// 2. 목록
			} else if(choice == 2) {
				System.out.println("====노래목록====");
				music.getMusic();
				
			// 3. 실행	
			} else if(choice == 3) {
				System.out.println("====실행====");
				music.playMusic();
				
			// 4. 이전곡
			} else if(choice == 4) {
				System.out.println("====이전곡====");
				music.preMusic();
				
			// 5. 다음곡
			} else if(choice == 5) {
				System.out.println("====다음곡====");
				music.nextMusic();
				
			// 6. 종료
			} else if(choice == 6) {
				System.out.println("뮤직플레이어가 종료되었습니다.");
				break;
				
			} else {
				System.out.println("정확한 숫자를 입력해주세요.");
			}
		
	}
		
 }
	
}

class MusicVO {
	private String title;
	private String singer;
	private int playTime;
	
	public MusicVO(String title, String singer, int playTime) {
		this.title = title;
		this.singer = singer;
		this.playTime = playTime;
	}
	
	String getTitle() {
		return title;
	}
	
	String getSinger() {
		return singer;
	}
	
	int getPlayTime() {
		return playTime;
	}
	
	void setTitle(String title) {
		this.title = title;
	}
	
	void setSinger(String singer) {
		this.singer = singer;
	}
	
	void setPlayTime(int playTime) {
		this.playTime = playTime;
	}
	
	String toString() {
		return null;
	}
}

class MusicController {
	
	ArrayList<MusicVO> musicList = new ArrayList<MusicVO>();
	int idx = 0;
	
	// 1. 음악 등록
	void musicAdd(String title, String singer, int playTime) {
		
		MusicVO m1 = new MusicVO(title, singer, playTime);
		musicList.add(m1);
		
	}

	// 2. 음악 목록
	void getMusic() {
		for (int i = 0; i < musicList.size(); i++) {
			System.out.println((i+1) + ".제목: " + musicList.get(i).getTitle() + );
		}
	}
}