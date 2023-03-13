package 자바DB연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


import 화면DB연결.ShareVO;


public class ShareDAO {
	
	public ShareVO select(String id) {
		ResultSet rs = null; 
		ShareVO bag = null; 
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1.오라클과 자바 연결할 부품 설정 성공");
			
		
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2.오라클 연결 성공");
			

			String sql = "select * from hr.SHARE_BBS where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql); 
			ps.setString(1, id);
			
			System.out.println("3.SQL문 부품(객체)으로 만들어주기");
			
			// 4. 전송
			rs = ps.executeQuery(); 
			////정수가 아니고 테이블 형태이기 때문에 executeQuery를 사용
			
			System.out.println("4.SQL문 오라클로 보내기 성공");
			if (rs.next()) { ////검색결과가 있는지 여부는 rs.next()
				System.out.println("검색성공");
				
				int no = rs.getInt(1);
				String id2 = rs.getString(2);
				String title = rs.getString(3); 
				String book = rs.getString(4);
				System.out.println(no + " " + id2 + " " + title + " " + book);
				
				//// 검색결과를 검색화면 UI부분을 주어야 함(DAO는 JOptionPane가 안됨)
				bag = new ShareVO();
				bag.setNo(no);
				bag.setId(id);
				bag.setTitle(title);
				bag.setBook(book);
			}else {
				System.out.println("검색결과 없음");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bag; 
		////return 뒤에는 반드시 여러 데이터를 묶어서 리턴해주어야 함
	
		}
	
	public int delete(int no) {
		int result = 0;
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1.오라클과 자바 연결할 부품 설정 성공");
			
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2.오라클 연결 성공");
			
			
			String sql = "delete from hr.SHARE_BBS where no = ? ";
			PreparedStatement ps = con.prepareStatement(sql); 
			
			ps.setInt(1, no);
			
			System.out.println("3.SQL문 부품(객체)으로 만들어주기");
			
			// 4. 전송
			result = ps.executeUpdate();
			System.out.println("4.SQL문 오라클로 보내기 성공");
			if (result >= 1) {
				System.out.println("삭제완료");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public int update(ShareVO bag) {
		int result = 0;
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1.오라클과 자바 연결할 부품 설정 성공");
			
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2.오라클 연결 성공");
			
			
			String sql = "update hr.SHARE_BBS set title = ?, book = ? where no = ? and id = ?";
			PreparedStatement ps = con.prepareStatement(sql); 
			
			ps.setString(1, bag.getTitle());
			ps.setString(2, bag.getBook());
			ps.setInt(3, bag.getNo());
			ps.setString(4, bag.getId());
			
			System.out.println("3.SQL문 부품(객체)으로 만들어주기");
			
			// 4. 전송
			result = ps.executeUpdate(); 
			System.out.println("4.SQL문 오라클로 보내기 성공");
			if (result >= 1) {
				System.out.println("게시글 수정 성공");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public int insert(ShareVO bag) {
		int result = 0;
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1.오라클과 자바 연결할 부품 설정 성공");
			
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2.오라클 연결 성공");
			
			
			String sql = "insert into hr.SHARE_BBS values (?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql); 
			
			ps.setInt(1, bag.getNo()); 
			ps.setString(2, bag.getId());
			ps.setString(3, bag.getTitle());		
			ps.setString(4, bag.getBook());
			
			
			System.out.println("3.SQL문 부품(객체)으로 만들어주기");
			
		
			result = ps.executeUpdate(); 
			System.out.println("4.SQL문 오라클로 보내기 성공");
			if (result == 1) {
				System.out.println("게시판 작성 성공");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(result);
		return result;
	}
	
	
	public ArrayList<ShareVO> list() {
		ResultSet rs = null; 
		
		// 가방들 넣어줄 큰 컨테이너 역할의 부품이 필요
		//ArrayList
		ArrayList<ShareVO> list = new ArrayList();
		
		ShareVO bag = null; 
		
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
			
			
			String sql = "select * from hr.SHARE_BBS";
			PreparedStatement ps = con.prepareStatement(sql); 
			
			System.out.println("3.SQL문 부품(객체)으로 만들어주기");
			
			// 4. 전송
			rs = ps.executeQuery(); 
			
			System.out.println("4.SQL문 오라클로 보내기 성공");
			while (rs.next()) {
				// 1. 검색결과가 있으면 
				// 2. 각 컬럼에서 값들을 꺼내오자
				int no = rs.getInt(1); 
				String id = rs.getString(2); 
				String title = rs.getString(3); 
				String book = rs.getString(4); 
				
				
				// 3. 가방을 만들자
				bag = new ShareVO();
				bag.setNo(no);
				bag.setId(id);
				bag.setTitle(title);
				bag.setBook(book);
				
				// 4. list에 bag을 추가해주자
				list.add(bag);
			}	
			ps.close();
			rs.close();
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list; 
		////return 뒤에는 반드시 여러 데이터를 묶어서 리턴해주어야 함
	
		}
	
	
	public ArrayList<ShareVO> list2(String id) {
		ArrayList<ShareVO> list2 = new ArrayList();
		ResultSet rs = null; 
		ShareVO bag = null; 
		
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
			
			
			String sql = "select * from hr.SHARE_BBS where id = ?";
			PreparedStatement ps = con.prepareStatement(sql); 
			
			ps.setString(1, id);
			
			System.out.println("3.SQL문 부품(객체)으로 만들어주기");
			
			// 4. 전송
			rs = ps.executeQuery(); 
			
			System.out.println("4.SQL문 오라클로 보내기 성공");
			while (rs.next()) {
				
				int no = rs.getInt(1); 
				String id2 = rs.getString(2); 
				String title = rs.getString(3); 
				String book = rs.getString(4); 
				
				bag = new ShareVO();
				bag.setNo(no);
				bag.setId(id);
				bag.setTitle(title);
				bag.setBook(book);
				
				list2.add(bag);
			}	
			ps.close();
			rs.close();
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list2; 
		////return 뒤에는 반드시 여러 데이터를 묶어서 리턴해주어야 함
	
		}

	
	
	

	
	
	
}
