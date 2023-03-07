package 자바DB연결;

import java.util.Scanner;

public class 게시판수정 {

	public static void main(String[] args) { //메인부터 시작
		
		Scanner sc = new Scanner(System.in); //스캐너프로그램으로 콘솔에 입력 할 수 있다.in은 키보드 의미
		System.out.println("writer/no 순으로 입력하세요");
		
		String writer = sc.next(); //텍스트로(공백허용x) id를 입력
		int no = sc.nextInt();
	
		
		BbsDAO bbs = new BbsDAO();
		bbs.update(writer, no); 
		

	}

}

// 1. JDBC4단계 정리
// >> 드라이버 설정 -> DB연결 -> SQL문 객체로 만들고 -> SQL문 전송
// 2. 데이터를 접근해서 처리하는 클래스를 부르는 이름 >> DAO
// 3. DAO에 주로 넣는 기능 4가지 >> CRUD (insert, select, update, delete)
// 4. sql를 객체를 만들었을 때 모르는 값을 표현하는 연산자 >> ? (오로지 ?만)
