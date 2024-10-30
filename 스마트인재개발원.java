package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class 스마트인재개발원 {

	public static void main(String[] args) {
		String sql;
		PreparedStatement psmt;
		ResultSet rs;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("== 스마트인재개발원 ==");
		while(true) {
			System.out.println("메뉴");
			System.out.println("[1]로그인 [2]종료");
			int choice = sc.nextInt();
		
			if(choice == 1) {
				System.out.print("아이디를 입력하세요 >> ");
				String id = sc.next();
				System.out.print("비밀번호를 입력하세요 >> ");
				String pw = sc.next();
				
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					
					String url = "jdbc:oracle:thin:@localhost:1521:xe";
					String user = "nthnew";
					String password = "12345";
					Connection conn = DriverManager.getConnection(url, user, password);
					
					sql = "SELECT * FROM DCXSTU WHERE ID=? AND PW=?";
					
					psmt = conn.prepareStatement(sql);
					psmt.setString(1, id);
					psmt.setString(2, pw);
					
					rs = psmt.executeQuery();
					
					while(true) {
						if( rs.next() ) {
							System.out.println(rs.getString("NAME") + "님 환영합니다");
							System.out.println("[1]성적 조회하기 [2]성적 수정하기 [3]종료");
							int choice2 = sc.nextInt();
							
								if(choice2 == 1) {
									sql = "SELECT JAVA, DB FROM DCXSTU WHERE NAME=?";
									psmt = conn.prepareStatement(sql);
									psmt.setString(1, rs.getString("NAME"));
									
									rs = psmt.executeQuery();
									
									System.out.println("===성적 조회===");
									System.out.println(rs.getString("NAME") + "님의\t자바성적: " + rs.getString("JAVA") + "\tDB성적" + rs.getString("DB") );
								
								} else if(choice2 == 2) {
									System.out.println("자바의 새 점수를 입력하세요 >> ");
									int java = sc.nextInt();
									System.out.println("DB의 새 점수를 입력하세요 >> ");
									int db = sc.nextInt();
									
									sql = "UPDATE DCXSTU SET JAVA = ?, DB = ? WHERE NAME = ?";
									psmt = conn.prepareStatement(sql);
									psmt.setInt(1, java);
									psmt.setInt(2, db);
									psmt.setString(3, rs.getString("NAME"));
									
									int result = psmt.executeUpdate();
									
									if(result > 0) {
										System.out.println("점수 수정 성공!");
									} else {
										System.out.println("정보 수정 실패~");
									}
				
								} else {
									break;
								}
				
						} else {
							System.out.println("존재하는 회원 정보가 없습니다");
					}
				} 
					
				}catch(Exception e) {
					e.printStackTrace();
				}
			} else if(choice == 2) {
				break;
			}

	}
	}
}

