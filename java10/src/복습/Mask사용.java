package 복습;

public class Mask사용 {

	public static void main(String[] args) {
		Mask mask1 = new Mask("하얀색", 1000, 3); //객체생성
		
		//멤버변수값을 매번줘야한다
		//--> 객체생성이 멤버변수값을 자동으로 무조건 넣어주는 처리를 하고싶다
//		mask1.color = "하얀색";
//		mask1.price = 1000;
//		mask1.count = 3;
//		
//		System.out.println(mask1.color);
//		System.out.println(mask1.price);
//		System.out.println(mask1.count);
		System.out.println(mask1);
		
		

	}

}
