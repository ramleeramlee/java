package 상속;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Playgame extends JFrame{

	public static void main(String[] args) {
		Playgame f = new Playgame();
	}
	public Playgame() {
		setTitle("토끼와 거북이");
		setSize(700, 500);
		setLayout(null);
		
		정리실습 r = new 정리실습("토끼.jpg", 100, 0); 
		정리실습 t = new 정리실습("거북이.jpg", 100, 200); 
		
		r.start();
		t.start();
		
		setVisible(true);
	}
	public class 정리실습 extends Thread {
		int x, y;
		JLabel label;
		
		public 정리실습 (String file, int x, int y) {
			this.x = x;
			this.y = y;
			ImageIcon icon = new ImageIcon(file);
			label = new JLabel();
			label.setIcon(icon);
			label.setBounds(x, y, 200, 200);
			add(label);
		
		} 
		@Override
		public void run() {
			Random r = new Random();
			for (int i = 0; i < 100; i++) {
				int move = r.nextInt(25);
				x = x + move;
				label.setBounds(x, y, 200, 200);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		}
		
	}

}
