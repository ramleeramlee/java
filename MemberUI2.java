package 화면DB연결;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


import 자바DB연결.MemberDAO3;

public class MemberUI2 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("나의 회원가입 화면");
		f.setSize(470, 640);

		JLabel label1 = new JLabel("   >> 회원가입화면 << ");
		JLabel label2 = new JLabel("아이디");
		JLabel label3 = new JLabel("패스워드");
		JLabel label4 = new JLabel("이름");
		JLabel label5 = new JLabel("전화번호");

		JTextField text1 = new JTextField(10);
		JTextField text2 = new JTextField(10);
		JTextField text3 = new JTextField(10);
		JTextField text4 = new JTextField(10);

		JButton b1 = new JButton("회원가입 처리");
		JButton b2 = new JButton("회원탈퇴 처리");
		JButton b3 = new JButton("회원수정 처리");
		JButton b4 = new JButton("회원검색 처리");

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("회원가입 처리");
				String id = text1.getText();
				String pw = text2.getText();
				String name = text3.getText();
				String tel = text4.getText();
				
				if (id.equals("")) { //기본형 4가지만 ==로 값 비교 가능
					JOptionPane.showMessageDialog(f, "id는 필수입력 항목입니다");
				}
				
				MemberDAO3 dao = new MemberDAO3();
				// 1. 가방 만들기
				MemberVO bag = new MemberVO(); 
				// 2. 가방에 값들을 넣기
				bag.setId(id);
				bag.setpw(pw);
				bag.setName(name);
				bag.setTel(tel);
				// 3. 값들이 들어있는 가방을 전달하자
				int result = dao.insert(bag); // 1 or 0
				if (result == 1) {
					JOptionPane.showMessageDialog(f, "회원가입 성공");
				}else {
					JOptionPane.showMessageDialog(f, "회원가입 실패, 재입력해주세요");
				}

			}
		});
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("회원탈퇴 처리");
				String id = text1.getText();
			
				MemberDAO3 dao = new MemberDAO3();
				int result = dao.delete(id);
				if (result >= 1) {
					JOptionPane.showMessageDialog(f, "회원탈퇴 성공");
				}else {
					JOptionPane.showMessageDialog(f, "회원탈퇴 실패, 재입력해주세요");
				}

			}
		});
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("회원수정 처리");
				String id = text1.getText(); // 조건
				String tel = text4.getText(); // 바꾸는 항목

				MemberDAO3 dao = new MemberDAO3();
				
				MemberVO bag = new MemberVO();
				bag.setTel(tel);
				bag.setId(id);
				int result = dao.update(bag);
				if (result >= 1) {
					JOptionPane.showMessageDialog(f, "회원수정 성공");
				}else {
					JOptionPane.showMessageDialog(f, "회원수정 실패, 재입력해주세요");
				}

			}
		});
		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("회원검색 처리");
				String id = text1.getText();
				MemberDAO3 dao = new MemberDAO3();
				MemberVO bag = dao.select(id);
				if (bag != null) {
					text2.setText(bag.getpw());
					text3.setText(bag.getName());
					text4.setText(bag.getTel());
					text2.setBackground(Color.pink);
					text3.setBackground(Color.pink);
					text4.setBackground(Color.pink);
				}else {
					text2.setText("");
					text3.setText("");
					text4.setText("");
					JOptionPane.showMessageDialog(f, "검색결과 없음");
				}
			
				
			}
		});

		FlowLayout flow = new FlowLayout();

		Font font = new Font("굴림", Font.BOLD, 40);
		Font font2 = new Font("굴림", Font.BOLD, 20);

		f.setLayout(flow);
		f.add(label1);
		f.add(label2);
		f.add(text1);
		f.add(label3);
		f.add(text2);
		f.add(label4);
		f.add(text3);
		f.add(label5);
		f.add(text4);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);

		label1.setFont(font);
		label2.setFont(font);
		label3.setFont(font);
		label4.setFont(font);
		label5.setFont(font);
		text1.setFont(font);
		text2.setFont(font);
		text3.setFont(font);
		text4.setFont(font);
		b1.setFont(font2);
		b2.setFont(font2);
		b3.setFont(font2);
		b4.setFont(font2);

		f.getContentPane().setBackground(Color.green);
		b1.setBackground(Color.blue);
		b1.setForeground(Color.white);
		b2.setBackground(Color.red);
		b2.setForeground(Color.white);
		b3.setBackground(Color.orange);
		b3.setForeground(Color.white);
		b4.setBackground(Color.lightGray);
		b4.setForeground(Color.white);

		f.setVisible(true);

	}

}
