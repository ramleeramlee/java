package 상속응용;

import java.util.Date;

public class 이미지스레드 extends Thread {
	@Override
	public void run() {
		String[] images = {"1.jpg", "2.jpg", "3.jpg", "4.jpg",
							"1.jpg", "2.jpg", "3.jpg", "4.jpg",
							"1.jpg", "2.jpg", "3.jpg", "4.jpg",
							"1.jpg", "2.jpg", "3.jpg", "4.jpg",
							"1.jpg", "2.jpg", "3.jpg", "4.jpg"};
		for (int i = 0; i < images.length; i++) {
			System.out.println("이미지>> " + images[i]);
			
			
			try {
				Thread.sleep(5000); //5초재운다 //ms
			} catch (Exception e) {
				System.out.println("cpu 연결 문제 생김");
			}
		}
	}
}
