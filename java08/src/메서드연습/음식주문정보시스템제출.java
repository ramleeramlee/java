package 메서드연습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 음식주문정보시스템제출 {
	
	
	static int count1;
	static int count2;
	static int count3;
	
	final static int PRICE1 = 2000; //커피
	final static int PRICE2 = 3000; //베이글
	final static int PRICE3 = 4000; //세트

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(800, 800);
		f.getContentPane().setBackground(Color.pink);
		
		Font font = new Font("굴림", Font.PLAIN, 50);
		Font font2 = new Font("굴림", Font.PLAIN, 30);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JButton c = new JButton("커피");
		JButton b = new JButton("베이글");
		JButton set = new JButton("세트");
		
		c.setFont(font);
		b.setFont(font);
		set.setFont(font);
		c.setBackground(Color.white);
		b.setBackground(Color.white);
		set.setBackground(Color.white);
		
		JLabel textLabel = new JLabel("총 수량: ");
		textLabel.setFont(font2);
		JLabel countLabel = new JLabel("개");
		countLabel.setFont(font2);
		JLabel imgLabel = new JLabel();
		ImageIcon icon = new ImageIcon("카페.jpg");
		imgLabel.setIcon(icon);
		JLabel result = new JLabel("결제금액 ");
		result.setFont(font2);
		
		c.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("커피.jpg");
				imgLabel.setIcon(icon);
				count1++;
				countLabel.setText(count1 + "개");
				
				
				f.setTitle("커피: " + count1 + "개, 베이글: " + count2 + "개, 세트: " + count3 + "개");
				int total = (count1 * PRICE1) + (count2 * PRICE2) + (count3 * PRICE3);
				result.setText("결제금액 " + total + "원");
			}
		});
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("베이글.jpg");
				imgLabel.setIcon(icon);
				count2++;
				countLabel.setText(count2 + "개");
			
				
				f.setTitle("커피: " + count1 + "개, 베이글: " + count2 + "개, 세트: " + count3 + "개");
				int total = (count1 * PRICE1) + (count2 * PRICE2) + (count3 * PRICE3);
				result.setText("결제금액 " + total + "원");
			}
		});
		set.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("세트.jpg");
				imgLabel.setIcon(icon);
				count3++;
				countLabel.setText(count3 + "개");
				
				
				f.setTitle("커피: " + count1 + "개, 베이글: " + count2 + "개, 세트: " + count3 + "개");
				int total = (count1 * PRICE1) + (count2 * PRICE2) + (count3 * PRICE3);
				result.setText("결제금액 " + total + "원");
			}
		});
		
		
		
		f.add(c);
		f.add(b);
		f.add(set);
		f.add(textLabel);
		f.add(countLabel);
		f.add(imgLabel);
		f.add(result);
		
	
		
		f.setVisible(true);
	}
	}
