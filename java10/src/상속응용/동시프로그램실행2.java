package 상속응용;

public class 동시프로그램실행2 {

	public static void main(String[] args) {
		$스레드 a = new $스레드();
		스레드2 b = new 스레드2();
		스레드3 c = new 스레드3();
		
		a.start();
		b.start();
		c.start();

	}

}
