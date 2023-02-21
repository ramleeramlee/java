package 스태틱;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Counter {
	
	static int count;
	
	public static void main(String[] args) {
		JFrame f = new JFrame("나의 카운터 프로그램");
		f.setSize(400, 300);
		f.getContentPane().setBackground(Color.lightGray);
		
		Font font = new Font("굴림", Font.BOLD, 20);
		Font font2 = new Font("궁서", Font.BOLD, 150);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JLabel number = new JLabel("0");
		number.setFont(font2);
		number.setForeground(Color.red);
		
		JButton b1 = new JButton("1더하기");
		b1.setFont(font);
		b1.setBackground(Color.pink);
		b1.setForeground(Color.black);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				count++;
				number.setText(count + "");
				
			}
		});
		
		JButton b2 = new JButton("0으로 초기화");
		b2.setFont(font);
		b2.setBackground(Color.blue);
		b2.setForeground(Color.white);
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				count = 0;
				number.setText(count + "");
				
			}
		});
		
		JButton b3 = new JButton("1빼기");
		b3.setFont(font);
		b3.setBackground(Color.pink);
		b3.setForeground(Color.black);
		
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				count--;
				number.setText(count + "");
				
			}
		});
		

		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(number);

		
		f.setVisible(true);

	}

}
