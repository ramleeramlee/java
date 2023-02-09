package 제어문문제;

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class 회원가입화면 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(350, 600);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		ImageIcon icon = new ImageIcon("네이버.jpg");
		
		JLabel text5 = new JLabel();
		text5.setIcon(icon);
		
		JLabel text1 = new JLabel(); //글씨
		text1.setText("아이디");
		
		JLabel text2 = new JLabel(); //
		text2.setText("패스워드");
		
		JLabel text3 = new JLabel(); //
		text3.setText("이름");
		
		JLabel text4 = new JLabel(); //
		text4.setText("전화번호");
		
		JButton b1 = new JButton();
		b1.setText("회원가입");
		
		
		
		//글자 넣는 곳..
		JTextField input1 = new JTextField(10);
		JTextField input2 = new JTextField(10);
		JTextField input3 = new JTextField(10);
		JTextField input4 = new JTextField(10);
		
		
		Font font = new Font("굴림", 1, 30);
		text1.setFont(font);
		input1.setFont(font);
		text2.setFont(font);
		input2.setFont(font);
		text3.setFont(font);
		input3.setFont(font);
		text4.setFont(font);
		input4.setFont(font);
		b1.setFont(font);
		
		text1.setForeground(Color.blue); 
		input1.setBackground(Color.white); 
		input1.setForeground(Color.black); 
		text2.setForeground(Color.blue);
		input2.setBackground(Color.white); 
		input2.setForeground(Color.black); 
		text3.setForeground(Color.blue);
		input3.setBackground(Color.white); 
		input3.setForeground(Color.black); 
		text4.setForeground(Color.blue);
		input4.setBackground(Color.white); 
		input4.setForeground(Color.black); 
		
		b1.setBackground(Color.pink); 
		b1.setForeground(Color.white); 
		

		f.add(text5);
		f.add(text1);
		f.add(input1);
		f.add(text2);
		f.add(input2);
		f.add(text3);
		f.add(input3);
		f.add(text4);
		f.add(input4);
		f.add(b1);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = input1.getText();
				String pw = input2.getText();
				String name = input3.getText();
				String phone = input4.getText();
				
				JOptionPane.showMessageDialog(f, input1);
				
			}
		});
		
		
			
		
		f.setVisible(true);
		
		
	}

}
