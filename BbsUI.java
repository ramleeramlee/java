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

import 자바DB연결.BbsDAO;
import 자바DB연결.MemberDAO3;

public class BbsUI {


	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("나의 게시판 화면");
		f.setSize(470, 680);
		
		JLabel label1 = new JLabel(" << 나의 게시판  >> ");
		JLabel label6 = new JLabel("---------------");
		JLabel label2 = new JLabel("게시판 NO");
		JLabel label3 = new JLabel("게시판 제목");
		JLabel label4 = new JLabel("게시판 내용");
		JLabel label5 = new JLabel("게시판 작성자");
		
		
		JTextField text1 = new JTextField(10);
		JTextField text2 = new JTextField(10);
		JTextField text3 = new JTextField(10);
		JTextField text4 = new JTextField(10);
		
		JButton b1 = new JButton("게시물 작성");
		JButton b2 = new JButton("게시물 수정");
		JButton b3 = new JButton("게시물 삭제");
		JButton b4 = new JButton("게시물 검색");
		
		b4.addActionListener(new ActionListener() {
			

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("게시물 검색");
				String no = text1.getText();
				int no2 = Integer.parseInt(no);

				BbsDAO dao = new BbsDAO();
				BbsVO bag = dao.select(no2);
				if (bag != null) {
					text2.setText(bag.getTitle());
					text3.setText(bag.getContent());
					text4.setText(bag.getWriter());
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
		f.add(label6);
		f.add(label2); f.add(text1);
		f.add(label3); f.add(text2);
		f.add(label4); f.add(text3);
		f.add(label5); f.add(text4);
		f.add(b1); f.add(b2);
		f.add(b3); f.add(b4);
		
		label1.setFont(font);
		label6.setFont(font);
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
		
		f.getContentPane().setBackground(Color.lightGray);
		b1.setBackground(Color.blue);
		b1.setForeground(Color.white);
		b2.setBackground(Color.red);
		b2.setForeground(Color.white);
		b3.setBackground(Color.orange);
		b3.setForeground(Color.white);
		b4.setBackground(Color.magenta);
		b4.setForeground(Color.white);
		
		
		f.setVisible(true);

	}

}
