package 상속기본;

public class 커피전문점 {

	public static void main(String[] args) {
		매니저 m = new 매니저();
		m.address = "수성구";
		m.name = "홍길동";
		m.rrn = "880101";
		m.bonus = 50;
		m.test();
		System.out.println(m);
	}

}
