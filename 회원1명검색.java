package 자바DB연결;

import java.util.Scanner;

import javax.swing.JOptionPane;

import 화면DB연결.MemberVO;

public class 회원1명검색 {

	public static void main(String[] args) { //메인부터 시작
		
		Scanner sc = new Scanner(System.in); //스캐너프로그램으로 콘솔에 입력 할 수 있다.in은 키보드 의미
		System.out.println("검색할 id를 입력하세요");
		
		String id = sc.next(); //텍스트로(공백허용x) id를 입력
		
		MemberDAO3 dao = new MemberDAO3();
		MemberVO bag = dao.select(id);
		String total = bag.getId() + ", " + bag.getpw() + ", " + bag.getName() + ", " + bag.getTel();
		JOptionPane.showMessageDialog(null, total);

	}

}

