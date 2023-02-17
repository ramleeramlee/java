package 상속기본;

public class FlyCar사용 {

	public static void main(String[] args) {
		FlyCar fly = new FlyCar();
		
		fly.color ="화이트";
		fly.fly = true;
		fly.fly();
		fly.run();
		
		System.out.println(fly);
	}

}
