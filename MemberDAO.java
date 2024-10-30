package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Model.MemberDTO;

public class MemberDAO {
	// DAO(Data Access Object)
	// - 데이터에 접근하는 것을 도와준다!
	// - DB에 연결해서 insert, delete, select 등 기능들을 할 수 있는 코드의 모음집
	// - 메소드 형태로 코드를 작성

	// 회원가입 메소드
	public int join(MemberDTO dto) {
		int result = 0;
		try {
//			// [1] JDBC 드라이버 로딩
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//
//			// [2] 데이터베이스 연결
//			String url = "jdbc:oracle:thin:@localhost:1521:xe";
//			String user = "nthnew";
//			String password = "12345";

			Connection conn = DBconnection.getConnection();

			if (conn != null) {
				System.out.println("DB 연결 성공!!");
			} else {
				System.out.println("DB 연결 실패~");
			}

			String sql = "INSERT INTO DCXSTU VALUES(?, ?, ?, ?)";

			PreparedStatement psmt = conn.prepareStatement(sql);

			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPw());
			psmt.setString(3, dto.getName());
			psmt.setInt(4, dto.getAge());

			result = psmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;

	}

	// 탈퇴 메소드
	public int delete(MemberDTO dto) {
		int result = 0;
		try {
			Connection conn = DBconnection.getConnection();

			if (conn != null) {
				System.out.println("DB 연결 성공!!");
			} else {
				System.out.println("DB 연결 실패~");
			}

			String sql = "DELETE FROM DCXSTU WHERE ID=? AND PW=?";

			PreparedStatement psmt = conn.prepareStatement(sql);

//			psmt.setString(1, id);
//			psmt.setString(2, pw);

			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPw());

			result = psmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

	// 전체회원조회
	public ArrayList<MemberDTO> selectAll() {

		// MemberDTO 타입의 객체 배열 생성
		// - arraylist처럼 길이가 가변적
		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();

		try {
			Connection conn = DBconnection.getConnection();

			String sql = "SELECT * FROM DCXSTU";

			PreparedStatement psmt = conn.prepareStatement(sql);

			ResultSet rs = psmt.executeQuery();

			// ResultSet 형태로 되어있는 결과물을 객체배열형태로 저장
			while (rs.next()) {
				// rs에 있는 데이터를 하나씩 빼서
				String id = rs.getString("ID");
				String name = rs.getString("NAME");
				int age = rs.getInt("AGE");

				// dto객체에 생성자 인자로 넘겨서 객체 생성 
				MemberDTO dto = new MemberDTO(id, age, name);

				// 그 생성한 객체를 객체배열에 저장해서 관리
				list.add(dto);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;

	}

	// 회원정보 수정 
	public int update(MemberDTO dto) {
		int result = 0;
		try {
			Connection conn = DBconnection.getConnection();

			String sql = "UPDATE DCXSTU SET AGE=? WHERE ID=? AND PW=?";

			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setInt(1, dto.getAge());
			psmt.setString(2, dto.getId());
			psmt.setString(3, dto.getPw());

			result = psmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;

	}
	
	// 로그인
	public ArrayList<MemberDTO> login(MemberDTO dto) {
		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
		
		try {
			Connection conn = DBconnection.getConnection();
			
			String sql = "SELECT * FROM DCXSTU WHERE ID=? AND PW=?";
			
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPw());
			
			ResultSet rs = psmt.executeQuery();
			
			if (rs.next()) {
				System.out.println(rs.getString("NAME") + "님 환영합니다");
			} else {
				System.out.println("존재하는 회원 정보가 없습니다");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}

}
