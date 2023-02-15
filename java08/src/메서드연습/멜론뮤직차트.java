package 메서드연습;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 멜론뮤직차트 {
	static int index = 2; // 2부터 시작

	public static void main(String[] args) {
		String[] title = { "Ditto", "OMG", "Hype boy", "파이팅 해야지(Feat. 이영지)", "사건의 지평선" };
		String[] img = { "디토.jpg", "omg.jpg", "하입보이.jpg", "부석순.jpg", "윤하.jpg" };
		double[] jumsu = { 4.79, 4.7, 4.79, 4.9, 4.95 };

		JFrame f = new JFrame();
		f.setSize(516, 530);
		f.getContentPane().setBackground(Color.lightGray);

		Font font = new Font("바탕", Font.PLAIN, 30); // 객체생성을 하는데 특정한 입력값을 넣지 않으면 못만들게 할 수 있음
		Font font2 = new Font("바탕", Font.PLAIN, 30);
		Font font3 = new Font("바탕", Font.PLAIN, 25);

		// 배치부품(객체)를 바꾸어주지 않으면 경계레이아웃을 사용하도록 셋팅
		// BorderLayout
		JLabel top = new JLabel(title[2]);
		top.setHorizontalAlignment(0);
		top.setFont(font3);
		f.add(top, BorderLayout.NORTH); // 북쪽에 붙어라

		JLabel center = new JLabel();
		center.setFont(font);
		ImageIcon icon = new ImageIcon("하입보이.jpg");
		center.setIcon(icon);
		f.add(center, BorderLayout.CENTER);

		// String.valueof() : String으로 변환 int + ""와 같다
		JLabel under = new JLabel(String.valueOf(jumsu[2]));
		under.setHorizontalAlignment(0);
		under.setForeground(Color.blue);
		under.setFont(font);
		f.add(under, BorderLayout.SOUTH);

		// 1. 액션기능 넣기
		// 2. 클릭액션이 있을 때 처리할 부품 만들기
		// 3. 클릭액션이 있을 때 어떻게 처리할 지 내용 코딩하기

		JButton left = new JButton("<<<");
		left.setFont(font2);
		left.setBackground(Color.green);
		f.add(left, BorderLayout.WEST);

		left.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (index > 0) {
					// 현재 인덱스보다 하나 적은 값들로 top, center, under를 세팅한다
					top.setText(title[index - 1]);
					ImageIcon icon = new ImageIcon(img[index - 1]);
					center.setIcon(icon);
					under.setText(jumsu[index - 1] + "");
					index--; // index = index - 1; index-= 1;
				} else {
					JOptionPane.showMessageDialog(f, "첫 페이지 입니다.");
				}

			}
		});

		JButton right = new JButton(">>>");
		right.setFont(font2);
		right.setBackground(Color.green);
		f.add(right, BorderLayout.EAST);

		right.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (index < 4) {
					// 현재 인덱스보다 하나 적은 값들로 top, center, under를 세팅한다
					top.setText(title[index + 1]);
					ImageIcon icon = new ImageIcon(img[index + 1]);
					center.setIcon(icon);
					under.setText(jumsu[index + 1] + "");
					index++; // index = index - 1; index-= 1;
				}else {
					JOptionPane.showMessageDialog(f, "마지막 페이지입니다.");
				}

			}
		});

		// 프로그램 끝나면 자동으로 exit
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		f.setVisible(true);
	}

}
