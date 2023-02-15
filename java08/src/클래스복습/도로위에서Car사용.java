package 클래스복습;

public class 도로위에서Car사용 {

	public static void main(String[] args) {
		Car car = new Car();
		//객체생성
		//객체1개 생성할 때 마다 2개씩 램에 저장공간이 생김
		car.color = "검정색";
		System.out.println(car.color);
		car.run();
		
		Car car2 = new Car();
		car2.color = "빨간색";
		System.out.println(car2.color);
		car2.run();
		car.up();
	}

}

