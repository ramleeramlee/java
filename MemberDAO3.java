package 자바DB연결;

import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

import 화면DB연결.MemberVO;

public class MemberDAO3 {
	
	public int delete(String id) {
		int result = 0;
		try {
			// 1. 오라클 11g와 연결한 부품 설정(커넥터 설정)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1.오라클과 자바 연결할 부품 설정 성공");
			
			// 2. 오라클 11g에 연결하자(java ---- oracle)(DB연결)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2.오라클 연결 성공");
			
			// 3. SQL문을 만든다.
			// URL u = new URL(url);
			// 자바는 부품조립식이여서, String에 넣은 문자열을 특정한 부품으로 인식하지 못 함
			// 특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다
			//SQL부품으로 만들어주어야 함 >> PreparedStatement 가 SQL부품!!
			String sql = "delete from hr.MEMBER where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql); 
			
			//con부품으로 sql스트링에 있는 것 SQL부품으로 만들어주세요
			ps.setString(1, id);
			
			System.out.println("3.SQL문 부품(객체)으로 만들어주기");
			
			// 4. 전송
			result = ps.executeUpdate();
			System.out.println("4.SQL문 오라클로 보내기 성공");
			if (result >= 1) {
				System.out.println("탈퇴 성공");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public int update(MemberVO bag) {
		int result = 0;
		try {
			// 1. 오라클 11g와 연결한 부품 설정(커넥터 설정)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1.오라클과 자바 연결할 부품 설정 성공");
			
			// 2. 오라클 11g에 연결하자(java ---- oracle)(DB연결)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2.오라클 연결 성공");
			
			// 3. SQL문을 만든다.
			// URL u = new URL(url);
			// 자바는 부품조립식이여서, String에 넣은 문자열을 특정한 부품으로 인식하지 못 함
			// 특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다
			//SQL부품으로 만들어주어야 함 >> PreparedStatement 가 SQL부품!!
			String sql = "update hr.MEMBER set tel = ? where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql); 
			//con부품으로 sql스트링에 있는 것 SQL부품으로 만들어주세요
			ps.setString(1, bag.getTel()); // 그냥 먼저 적혀있는 순서대로..
			ps.setString(2, bag.getId());
			
			
			System.out.println("3.SQL문 부품(객체)으로 만들어주기");
			
			// 4. 전송
			result = ps.executeUpdate(); //insert, update, delete문만!! sql문 실행결과가 int
			System.out.println("4.SQL문 오라클로 보내기 성공");
			if (result >= 1) {
				System.out.println("업데이트 성공");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public int insert(MemberVO bag) {
		// 11. 가방을 받아서 변수에 넣어주세요
		int result = 0;
		try {
			// 1. 오라클 11g와 연결한 부품 설정(커넥터 설정)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1.오라클과 자바 연결할 부품 설정 성공");
			
			// 2. 오라클 11g에 연결하자(java ---- oracle)(DB연결)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2.오라클 연결 성공");
			
			// 3. SQL문을 만든다.
			// URL u = new URL(url);
			// 자바는 부품조립식이여서, String에 넣은 문자열을 특정한 부품으로 인식하지 못 함
			// 특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다
			//SQL부품으로 만들어주어야 함 >> PreparedStatement 가 SQL부품!!
			String sql = "insert into hr.MEMBER values (?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql); 
			//con부품으로 sql스트링에 있는 것 SQL부품으로 만들어주세요
			
			//22. 가방에서 값들을 하나씩 꺼내쓰세요
			ps.setString(1, bag.getId()); // ** db는 인덱스가 1부터 시작!!!
			ps.setString(2, bag.getpw());
			ps.setString(3, bag.getName());
			ps.setString(4, bag.getTel());
			
			System.out.println("3.SQL문 부품(객체)으로 만들어주기");
			
			// 4. 전송
			//ps.executeUpdate();
			result = ps.executeUpdate(); //1
			System.out.println("4.SQL문 오라클로 보내기 성공");
			if(result == 1) {
				System.out.println("회원가입 성공!");
			}
			System.out.println(result);
		} catch (Exception e) {//insert가 제대로 안된 경우, 위험한 상황이라고 판단하고 catch가 실행
			// 실행된 Row수가 없으므로 result에 0을 넣어주자
//			result = 0;
			
			//e.printStackTrace();
		}
		System.out.println(result);
		return result;
	}

}
