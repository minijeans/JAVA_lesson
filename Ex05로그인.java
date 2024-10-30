package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Ex05로그인 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 0. 사용자에게 로그인하고싶은 id, pw 입력받고
		System.out.print("아이디를 입력하세요 >> ");
		String id = sc.next();
		System.out.print("비밀번호를 입력하세요 >> ");
		String pw = sc.next();

		// 1. try~catch 안에서
		try {

			// 2. 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 3. DB 연결
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "nthnew";
			String password = "12345";
			Connection conn = DriverManager.getConnection(url, user, password);

			if (conn != null) {
				System.out.println("연결성공");
			} else {
				System.out.println("연결실패");
			}

			// 4. 미완성 sql에 정보 넣고
			String sql = "SELECT * FROM DCXSTU WHERE ID=? AND PW=?";

			// 5. select문 실행
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);

			// 6. 결과를 ResultSet rs = psmt.executeQuery(); 에 담기 까지
			ResultSet rs = psmt.executeQuery();

			// rs.next() 했을 때, 조회한 결과가 있으면 true가 돌아온다
			// 만약에 rs.next()했는데, 결과가 여러 행이라면 while문을 돌릴 수 있다
			// ==> 한번 반복 할 때마다 계속 그 다음 행으로 넘어가서 실행 마지막 행까지 실행하면 끝!
			if (rs.next()) {
				System.out.println(rs.getString("NAME") + "님 환영합니다");
			} else {
				System.out.println("존재하는 회원 정보가 없습니다");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
