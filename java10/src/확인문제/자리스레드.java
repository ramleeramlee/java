package 확인문제;

public class 자리스레드 extends Thread {
	@Override
	public void run() {
		String[] seat = {"오른쪽", "왼쪽","오른쪽", "왼쪽",
				"오른쪽", "왼쪽","오른쪽", "왼쪽","오른쪽", "왼쪽",
				"오른쪽", "왼쪽","오른쪽", "왼쪽","오른쪽", "왼쪽",
				"오른쪽", "왼쪽","오른쪽", "왼쪽","오른쪽", "왼쪽"};
				
		for (int i = 0; i < seat.length; i++) {
			System.out.println("자리>> " + seat[i]);
			try {
				Thread.sleep(1000); 
			} catch (Exception e) {
				System.out.println("cpu 연결 문제 생김");
			}
		}
	}
}
