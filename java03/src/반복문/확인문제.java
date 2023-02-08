package 반복문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 확인문제 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(250, 300);
		f.getContentPane().setBackground(Color.green);

		JButton b = new JButton();
		b.setText("   별10개    ");
		JButton b1 = new JButton();
		b1.setText("   커피*5  ");
		JButton b2 = new JButton();
		b2.setText("커피*우유3");
		JButton b3 = new JButton();
		b3.setText("    1:짱!   ");

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		Font font = new Font("고딕", 1, 30);
		b.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);

		b.setBackground(Color.magenta);
		b.setForeground(Color.black);
		b1.setBackground(Color.cyan);
		b1.setForeground(Color.black);
		b2.setBackground(Color.magenta);
		b2.setForeground(Color.black);
		b3.setBackground(Color.cyan);
		b3.setForeground(Color.black);

		f.add(b);
		f.add(b1);
		f.add(b2);
		f.add(b3);

		// 1. 버튼에다가 액션기능을 추가하겠다고 설정
		// 2. 클릭액션이 있을 때 어떤 부붐이 액션처리를 어떻게 할지 코딩한다
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 처리 내용을 여기에 쓰면 된다.
				System.out.println("b을 클릭");
				for (int i = 0; i < 10; i++) {
					System.out.print("*");
				}
				System.out.println();
			}
		});
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 처리 내용을 여기에 쓰면 된다.
				System.out.println("b1을 클릭");
				for (int i = 0; i < 5; i++) {
					System.out.print("커피*");
				}
				System.out.println();
			}
		});
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 처리 내용을 여기에 쓰면 된다.
				System.out.println("b2을 클릭");
				for (int i = 0; i < 3; i++) {
					System.out.println("커피*우유");
				}
			}
		});
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 처리 내용을 여기에 쓰면 된다.
				System.out.println("b3을 클릭");
				for (int i = 0; i < 3; i++) {
					System.out.println((i+1) + " : 짱!");
			}
			}
		});

		f.setVisible(true);
	}

}
