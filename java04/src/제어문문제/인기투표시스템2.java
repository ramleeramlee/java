package 제어문문제;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 인기투표시스템2 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 1000);
		f.getContentPane().setBackground(Color.lightGray); 
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		ImageIcon icon = new ImageIcon("아이유.jpg");
		ImageIcon icon1 = new ImageIcon("뉴진스.jpg");
		ImageIcon icon2 = new ImageIcon("윤하.jpg");
		
		Font font = new Font("굴림", 1, 40);
		Font font1 = new Font("굴림", 1, 20);
		
		JLabel text1 = new JLabel(); 
		text1.setText("K-pop 인기 투표");
		text1.setFont(font);
		
		JButton b1 = new JButton();
		b1.setIcon(icon);
		
		JLabel text2 = new JLabel(); 
		text2.setText("아이유-라일락");
		text2.setFont(font);
		
		JLabel text3 = new JLabel(); 
		text3.setText("");
		text3.setFont(font1);
		
		JButton b2 = new JButton();
		b2.setIcon(icon1);
		
		JLabel text4 = new JLabel(); 
		text4.setText("뉴진스-Ditto");
		text4.setFont(font);
		
		JLabel text5 = new JLabel(); 
		text5.setText("");
		text5.setFont(font1);
		
		JButton b3 = new JButton();
		b3.setIcon(icon2);
		
		JLabel text6 = new JLabel(); 
		text6.setText("윤하-사건의 지평선");
		text6.setFont(font);
		
		JLabel text7 = new JLabel(); 
		text7.setText("");
		text7.setFont(font1);

		f.add(text1);
		
		f.add(b1);
		f.add(text2);
		f.add(text3);
		
		f.add(b2);
		f.add(text4);
		f.add(text5);
		
		f.add(b3);
		f.add(text6);
		f.add(text7);

		b1.addActionListener(new ActionListener() {
			int iu = 0; //여기에 있어야 클릭했을 때 0으로 변하지 않는다
			@Override
			public void actionPerformed(ActionEvent e) {
				iu++;
				text3.setText(iu + "표");		
			}
		});
		
		b2.addActionListener(new ActionListener() {
			int nj = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				nj++;
				text5.setText(nj + "표");	
			}
		});
		
		b3.addActionListener(new ActionListener() {
			int youn = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				youn++;
				text7.setText(youn + "표");
				
			}
		});
		
		

		
		f.setVisible(true);
		
		}

			
		
	}



