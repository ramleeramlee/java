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

public class 오늘의미션 {
	static int count; // 0으로 초기화, 전역변수
	final static int PRICE = 5000; // final은 변경불가
	// 상수변수를 쓸 때는 잘보이라고 변수명을 모두 대문자로!!

	public static void main(String[] args) {

		JFrame f = new JFrame("음식주문시스템");
		f.setSize(800, 800);
		f.getContentPane().setBackground(Color.lightGray);

		Font font = new Font("바탕", Font.PLAIN, 30);
		Font font2 = new Font("바탕", Font.PLAIN, 50);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		JButton one = new JButton("연어");
		JButton two = new JButton("새우");
		JButton three = new JButton("모둠");
		one.setFont(font);
		two.setFont(font);
		three.setFont(font);
		one.setBackground(Color.orange);
		two.setBackground(Color.yellow);
		three.setBackground(Color.white);

		JLabel textLabel = new JLabel("총 개수: ");
		textLabel.setFont(font);
		JLabel countLabel = new JLabel("개");
		countLabel.setFont(font);
		JLabel imgLabel = new JLabel();
		ImageIcon icon = new ImageIcon("메인.jpg");
		imgLabel.setIcon(icon);
		JLabel result = new JLabel("결제금액 ");
		result.setFont(font);

		one.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("연어.jpg");
				imgLabel.setIcon(icon);
				count++;
				countLabel.setText(count + "개");
				result.setText("결제금액 " + (count * PRICE) + "원");

			}
		});
		two.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("새우.jpg");
				imgLabel.setIcon(icon);
				count++;
				countLabel.setText(count + "개");
				result.setText("결제금액 " + (count * PRICE) + "원");
			}
		});
		three.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("모둠.jpg");
				imgLabel.setIcon(icon);
				count++;
				countLabel.setText(count + "개");
				result.setText("결제금액 " + (count * PRICE) + "원");
			}
		});

		f.add(one);
		f.add(two);
		f.add(three);
		f.add(textLabel);
		f.add(countLabel);
		f.add(imgLabel);
		f.add(result);

		f.setVisible(true);

	}

}
