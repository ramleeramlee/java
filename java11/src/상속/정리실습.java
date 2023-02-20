package 상속;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class 정리실습 extends Thread {
	int x, y;
	JLabel label;
	
	public 정리실습 (String file, int x, int y) {
		this.x = x;
		this.y = y;
		ImageIcon icon = new ImageIcon(file);
		label = new JLabel();
		label.setIcon(icon);
		label.setBounds(x, y, 100, 100);
	
	} 
	@Override
	public void run() {
		Random r = new Random();
		for (int i = 0; i < 100; i++) {
			int move = r.nextInt(25);
			x = x + move;
			label.setBounds(x, y, 100, 100);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
	
}
