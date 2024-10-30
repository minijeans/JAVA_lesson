package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Ex04회원조회 {

	public static void main(String[] args) {

		// try구문 안에 드라이버 로딩하고 db 연결하는거까지
		try {
			// 1. 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. 데이텉베이스 연결
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "nthnew";
			String password = "12345";
			Connection conn = DriverManager.getConnection(url, user, password);

			if (conn != null) {
				System.out.println("DB 연결 성공!!");
			} else {
				System.out.println("DB 연결 실패~");
			}

			// 3. sql문 준비
			// 회원정보 조회 -> select
			String sql = "SELECT * FROM DCXSTU";
			PreparedStatement psmt = conn.prepareStatement(sql);

			// 4. sql 전송
			// ResultSet 객체 : JDBC에서 쿼리 결과를 저장하고, 처리할 수 있도록 도와줌
			ResultSet rs = psmt.executeQuery();

			// 5. 결과를 이용한 작업 처리
			// >> 사용자에게 어떤 모습을 보여줄지 정의

			System.out.println("===전체 유저 조회===");
			while (rs.next()) { // rs.next() 자동으로 밑으로 내려줌, 없으면 종료
				String id = rs.getString("ID");
				String name = rs.getString("NAME");
				int age = rs.getInt("AGE");
				System.out.println(id + "\t" + name + "\t" + age + "\t");
			}

		} catch (Exception e) {

		}

	}

}
