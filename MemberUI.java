package 화면DB연결;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MemberUI {

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
		
		FlowLayout flow = new FlowLayout();
		
		Font font = new Font("굴림", Font.BOLD, 40);
		Font font2 = new Font("굴림", Font.BOLD, 20);
		
		
		f.setLayout(flow);
		f.add(label1);
		f.add(label2); f.add(text1);
		f.add(label3); f.add(text2);
		f.add(label4); f.add(text3);
		f.add(label5); f.add(text4);
		f.add(b1); f.add(b2);
		f.add(b3); f.add(b4);
		
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
