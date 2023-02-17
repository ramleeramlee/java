package 확인문제;

public class 번호스레드 extends Thread {
	@Override
	public void run() {
		for (int i = 1; i < 101; i++) {
			System.out.println("번호>> " + i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println("cpu 연결 문제 생김");
			}
		}
	}
}
