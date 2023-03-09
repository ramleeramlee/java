package 자바DB연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import 화면DB연결.BbsVO;
import 화면DB연결.MemberVO;
// 테이블 하나당 DAO하나! >> 
public class BbsDAO {
	
public  BbsVO select(int no) {
		ResultSet rs = null;
		BbsVO bag = null;
		
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
			String sql = "select * from hr.BBS where NO = ? ";
			PreparedStatement ps = con.prepareStatement(sql); 
			//con부품으로 sql스트링에 있는 것 SQL부품으로 만들어주세요
			
			ps.setInt(1, no); // ** db는 인덱스가 1부터 시작!!!
	
			System.out.println("3.SQL문 부품(객체)으로 만들어주기");
			
			// 4. 전송
			rs = ps.executeQuery();
			System.out.println("4.SQL문 오라클로 보내기 성공");
			
			if (rs.next()) { ////검색결과가 있는지 여부는 rs.next()
				//// true이면 있다, false이면 없다 라는 의미
				System.out.println("검색결과 있음. 성공");
				int no2 = rs.getInt(1); 
				String title = rs.getString(2); 
				String content = rs.getString(3); 
				String writer = rs.getString(4); 
				System.out.println(no2 + " " + title + " " + title + " " + writer);
				
				//// 검색결과를 검색화면 UI부분을 주어야 함(DAO는 JOptionPane가 안됨)
				bag = new BbsVO();
				bag.setNo(no2);
				bag.setTitle(title);
				bag.setContent(content);
				bag.setWriter(writer);
			}else {
				System.out.println("검색결과 없음");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bag;
}
		
	public void delete(String title) {
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
			String sql = "delete from hr.BBS where title = ? ";
			PreparedStatement ps = con.prepareStatement(sql); 
			
			//con부품으로 sql스트링에 있는 것 SQL부품으로 만들어주세요
			ps.setString(1, title);
			
			System.out.println("3.SQL문 부품(객체)으로 만들어주기");
			
			// 4. 전송
			ps.executeUpdate();
			System.out.println("4.SQL문 오라클로 보내기 성공");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void update(String writer, int no) {
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
			String sql = "update hr.BBS set writer = ? where no = ? ";
			PreparedStatement ps = con.prepareStatement(sql); 
			//con부품으로 sql스트링에 있는 것 SQL부품으로 만들어주세요
			ps.setString(1, writer); // 그냥 먼저 적혀있는 순서대로..
			ps.setInt(2, no);
			
			System.out.println("3.SQL문 부품(객체)으로 만들어주기");
			
			// 4. 전송
			ps.executeUpdate(); //insert, update, delete문만!! sql문 실행결과가 int
			System.out.println("4.SQL문 오라클로 보내기 성공");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void insert(int no, String title, String content, String writer) {
		
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
			String sql = "insert into hr.BBS values (?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql); 
			//con부품으로 sql스트링에 있는 것 SQL부품으로 만들어주세요
			
			ps.setInt(1, no); // ** db는 인덱스가 1부터 시작!!!
			ps.setString(2, title);
			ps.setString(3, content);
			ps.setString(4, writer);
			
			System.out.println("3.SQL문 부품(객체)으로 만들어주기");
			
			// 4. 전송
			ps.executeUpdate();
			System.out.println("4.SQL문 오라클로 보내기 성공");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		

	}

}
