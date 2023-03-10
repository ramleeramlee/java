package 자바DB연결;

import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import 화면DB연결.MemberVO;

public class MemberDAO3 {
	
	public MemberVO select(String id) {
		ResultSet rs = null; ////항목명 + 결과 데이터를 담고 있는 테이블
		////기본형 : 정수/실수/문자/논리만 값으로 초기화
		//// 참조형(나머지) : null로 초기화(주소가 없다라고 표시해야함)
		
		MemberVO bag = null; ////밖으로 나와 있어야 리턴가능!!
		
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
			String sql = "select * from hr.MEMBER where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql); 
			
			//con부품으로 sql스트링에 있는 것 SQL부품으로 만들어주세요
			ps.setString(1, id);
			
			System.out.println("3.SQL문 부품(객체)으로 만들어주기");
			
			// 4. 전송
			rs = ps.executeQuery(); 
			////select문 일때는 정수가 아니고 테이블 형태이기 때문에 executeQuery를 사용한다
			
			System.out.println("4.SQL문 오라클로 보내기 성공");
			if (rs.next()) { ////검색결과가 있는지 여부는 rs.next()
				//// true이면 있다, false이면 없다 라는 의미
				System.out.println("검색결과 있음. 성공");
				String id2 = rs.getString(1); //id
				String pw = rs.getString(2); //pw
				String name = rs.getString(3); //name
				String tel = rs.getString(4); //tel
				System.out.println(id2 + " " + pw + " " + name + " " + tel);
				
				//// 검색결과를 검색화면 UI부분을 주어야 함(DAO는 JOptionPane가 안됨)
				bag = new MemberVO();
				bag.setId(id2);
				bag.setpw(pw);
				bag.setName(name);
				bag.setTel(tel);
				
			}else {
				System.out.println("검색결과 없음");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bag; 
		////return 뒤에는 반드시 여러 데이터를 묶어서 리턴해주어야 함
		////검색결과가 있으면 bag에 데이터가 들어가 있고
		////검색결과가 없으면 null이 들어가 있음
		}
	
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
			ps.setString(1, bag.getId()); // 그냥 먼저 적혀있는 순서대로..
			ps.setString(2, bag.getpw());
			ps.setString(3, bag.getName());			
			ps.setString(4, bag.getTel());
			
			
			System.out.println("3.SQL문 부품(객체)으로 만들어주기");
			
			// 4. 전송
			result = ps.executeUpdate(); //insert, update, delete문만!! sql문 실행결과가 int
			System.out.println("4.SQL문 오라클로 보내기 성공");
			if (result == 1) {
				System.out.println("회원가입 성공");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(result);
		return result;
	}
	
	
	
	/////////////로그인

	public int login (MemberVO bag) {
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
			String sql = "select * from hr.MEMBER where id = ? and where pw = ? ";
			PreparedStatement ps = con.prepareStatement(sql); 
			
			//con부품으로 sql스트링에 있는 것 SQL부품으로 만들어주세요
			ps.setString(1, bag.getId());
			ps.setString(2, bag.getpw());
			
			System.out.println("3.SQL문 부품(객체)으로 만들어주기");
			
			// 4. 전송
			ResultSet rs = ps.executeQuery(); 
			
			System.out.println("4.SQL문 오라클로 보내기 성공");
			if (rs.next()) { ////검색결과가 있는지 여부는 rs.next()
				//// true이면 있다, false이면 없다 라는 의미
				System.out.println("결과 값 있음");
				result = 1;
			}
			ps.close(); con.close(); rs.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result; 
	}
}

	

