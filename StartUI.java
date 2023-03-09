package 화면DB연결;

import javax.swing.JOptionPane;

import 자바DB연결.MemberDAO3;

public class StartUI {

	public static void main(String[] args) {
		String id = JOptionPane.showInputDialog("아이디 입력");
		String pw = JOptionPane.showInputDialog("비밀번호 입력");
		
		MemberDAO3 dao = new MemberDAO3();
		
		MemberVO bag = new MemberVO();
		bag.setId(id);
		bag.setpw(pw);
		int result = dao.login(bag);
		
		if (result == 1) {
			JOptionPane.showMessageDialog(null, "로그인 성공");	
	}	else {
			JOptionPane.showMessageDialog(null, "로그인 실패");
	}

	}}
