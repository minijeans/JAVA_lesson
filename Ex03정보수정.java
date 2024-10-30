package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Ex03정보수정 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("아이디를 입력하세요 >> ");
		String id = sc.next();
		System.out.print("비밀번호를 입력하세요 >> ");
		String pw = sc.next();
		System.out.print("새 나이를 입력하세요 >> ");
		int age = sc.nextInt();
		// ---> id, pw가 일치하는 데이터의 나이를 수정

		try {
			// 1. 드라이버
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. DB연결
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "nthnew";
			String password = "12345";
			Connection conn = DriverManager.getConnection(url, user, password);

			if (conn != null) {
				System.out.println("연결성공");
			} else {
				System.out.println("연결실패");
			}

			String sql = "UPDATE DCXSTU SET AGE=? WHERE ID=? AND PW=?";
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setInt(1, age);
			psmt.setString(2, id);
			psmt.setString(3, pw);

			// sql 전송
			int result = psmt.executeUpdate();

			if (result > 0) {
				System.out.println("회원정보 수정 성공!");
			} else {
				System.out.println("회원정보 수정 실패~");
			}

		} catch (Exception e) {

		}
	}

}
