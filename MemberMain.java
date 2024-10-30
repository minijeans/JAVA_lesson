package View;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.Scanner;

import Controller.MemberDAO;
import Model.MemberDTO;

public class MemberMain {

	public static void main(String[] args) {
		// 디자인 패턴
		// : 계속 같은 문제가 발생해서, 이 문제를 해결하고자 형식, 규칙을 지정해놓은 것
		// : 프로그램 등을 개발할 때, 좀 더 쉽고 편리하게 사용할 수 있게 만든 방법들

		// MVC(Model_View_Controller) 패턴
		// - 프로그램을 Model, View, Controller 라는 3가지 요소로 구분하는 개발방법론

		// Model : 데이터를 저장하고, 조작하기 위한 코드들
		// View : 사용자에게 직접적으로 보여지는 코드들
		// Controller : Model과 View 사이에서 데이터 흐름을 제어

		Scanner sc = new Scanner(System.in);

		// choice = 사용자가 입력한 메뉴번호
		// 1. 회원가입
		// 2. 로그인
		// 3. 회원탈퇴
		// 4. 전체회원 조회
		// 5. 회원정보 수정
		// 1~5 이외의 숫자를 입력하면 프로그램이 종료 (else)

		while (true) {
			System.out.println("=======SMHRD 회원관리 프로그램=======");
			System.out.print("[1] 회원가입 [2] 로그인 [3] 탈퇴 [4] 전체회원조회 [5] 회원정보수정 >> ");
			String choice = sc.next();

			if (choice.equals("1")) {
				// 회원가입
				// - id, pw, name, age를 입력받아서 변수 저장
				System.out.print("id 입력 >> ");
				String id = sc.next();
				System.out.print("pw 입력 >> ");
				String pw = sc.next();
				System.out.print("이름 입력 >> ");
				String name = sc.next();
				System.out.print("나이 입력 >> ");
				int age = sc.nextInt();

				// 회원가입에 필요한 정보를 받았으니
				// DTO에 정보를 채우기
				MemberDTO dto = new MemberDTO(id, pw, name, age);
				// DAO 기능 사용하기 위해 객체 생성
				MemberDAO dao = new MemberDAO();

				// 성공여부 확인을 위해 join의 리턴값 저장
				int result = dao.join(dto);

				if (result > 0) {
					System.out.println("회원가입 성공");
				} else {
					System.out.println("회원가입 실패");
				}

			} else if (choice.equals("2")) {
				// 로그인
				System.out.print("id 입력 >> ");
				String id = sc.next();
				System.out.print("pw 입력 >> ");
				String pw = sc.next();
				
				MemberDTO dto = new MemberDTO(id, pw);
				MemberDAO dao = new MemberDAO();
				
				dao.login(dto);

			} else if (choice.equals("3")) {
				// 회원탈퇴
				// - 사용자에게 id, pw만 입력받기
				System.out.print("id 입력 >> ");
				String id = sc.next();
				System.out.print("pw 입력 >> ");
				String pw = sc.next();

//				// dao, dto객체 생성
//				MemberDAO dao = new MemberDAO();
//				
//				int result = dao.delete(id, pw);
//				
//				if (result > 0) {
//					System.out.println("탈퇴 성공");
//				} else {
//					System.out.println("탈퇴 실패");
//				}
//				// 회원탈퇴에 필요한 정보 : id, pw 뿐이기 때문에
//				// dto 생성자도 id, pw 정보만 초기화 시키는 생성자로 하나 새로 만들기!

				MemberDTO dto = new MemberDTO(id, pw);
				MemberDAO dao = new MemberDAO();

				int result = dao.delete(dto);

				if (result > 0) {
					System.out.println("탈퇴 성공");
				} else {
					System.out.println("탈퇴 실패");
				}

			} else if (choice.equals("4")) {
				// 전체회원 조회
				System.out.println("===전체 유저 조회===");
				System.out.println("ID \t 이름 \t 나이 \t");
				// 회원조회(select)는 전달할 데이터가 없어서 dto가 필요없다
				// dao객체 필요
				MemberDAO dao = new MemberDAO();

				ArrayList<MemberDTO> list = dao.selectAll();

				// for-each문 : 배열의 크기만큼 반복되는 반복문
				for (MemberDTO dto : list) {
					System.out.println(dto.getId() + "\t" + dto.getName() + "\t" + dto.getAge() + "\t");
				}

			} else if (choice.equals("5")) {
				// 회원정보 수정 update!!
				System.out.print("아이디를 입력하세요 >> ");
				String id = sc.next();
				System.out.print("비밀번호를 입력하세요 >> ");
				String pw = sc.next();
				System.out.print("새 나이를 입력하세요 >> ");
				int age = sc.nextInt();

				MemberDTO dto = new MemberDTO(id, pw, age);
				MemberDAO dao = new MemberDAO();

				int result = dao.update(dto);

				if (result > 0) {
					System.out.println("수정 성공");
				} else {
					System.out.println("수정 실패");
				}

			} else {
				// 프로그램 종료
				break;
			}
		}

	}

}
