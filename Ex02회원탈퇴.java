package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Ex02회원탈퇴 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("id 입력 >> ");
		String id = sc.next();
		System.out.print("pw 입력 >> ");
		String pw = sc.next();

		try {
			// [1] JDBC 드라이버 로딩
			// 드라이버란?
			// java에서 제공하는 인터페이스들을 DB회사에서 로직을 구현하는 클래스 파일이 모여있는 모음집
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// [2] 데이터베이스 연결
			// 준비물 3가지 : 연결 경로, 데이터베이스의 ID, PW
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			// thin : JDBC 드라이버 타입이 thin타입
			// @localhost : ip주소
			// 1521 : 포트번호
			// xe : DB 별칭

			// 데이터베이스의 ID
			String user = "nthnew";
			// 데이터베이스의 PW
			String password = "12345";

			// 인터페이스
			Connection conn = DriverManager.getConnection(url, user, password);

			if (conn != null) {
				System.out.println("연결성공");
			} else {
				System.out.println("연결실패");
			}

			// 3. 쿼리
			// 회원탈퇴 -> delete
			String sql = "DELETE FROM DCXSTU WHERE ID=? AND PW=?";
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			int result = psmt.executeUpdate();
			if (result > 0) {
				System.out.println("탈퇴 성공");
			} else {
				System.out.println("탈퇴 실패");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
