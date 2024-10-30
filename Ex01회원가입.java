package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Ex01회원가입 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// JDBC

		// 1. 사용자에게 id, pw, 이름, 나이
		System.out.print("id 입력 >> ");
		String id = sc.next();
		System.out.print("pw 입력 >> ");
		String pw = sc.next();
		System.out.print("이름 입력 >> ");
		String name = sc.next();
		System.out.print("나이 입력 >> ");
		int age = sc.nextInt();

		try {
			// 예외처리
			// try 구문 : 에러가 발생할 수도 있지만, 우선 실행해보는 공간

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

			// conn이라는 객체 안에 DB연결에 대한 결과가 들어있다!
			if (conn != null) {
				System.out.println("DB 연결 성공!!");
			} else {
				System.out.println("DB 연결 실패~");
			}

			// [3] 쿼리 전송
			// [3-1] 쿼리문 준비
			String sql = "INSERT INTO DCXSTU VALUES(?, ?, ?, ?)";

			// ?인자
			// 어떤 값이 들어갈지 모르기 때문에 값을 넣어줄 때까지 대기

			// [3-2] 쿼리문 전송
			PreparedStatement psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, name);
			psmt.setInt(4, age);

			// [3-3] 쿼리 전송
			int result = psmt.executeUpdate();

			// executeUpdate(); : insert, delete, update
			// executeQuery(); : select

			if (result > 0) {
				System.out.println("업데이트 성공!");
			} else {
				System.out.println("업데이트 실패~");
			}

		} catch (Exception e) {
			// 모든 예외는 Exception 상속받는다
			// Exception e = new ClassNotFoundException
			// Exception e = new SQLException();
			// ---> 업캐스팅

			// catch 구문
			// 예외상황(에러)이 발생했을 때, 어떤 로직을 수행할지 정해주는 공간

			e.printStackTrace();
			// 예외상황이 왜 발생했는지, 어디서 문제가 발생했는지 출력해주는 구문
		}

	}

}
