package 부품사용하기;

import 부품만들기.강아지;
import 부품만들기.전화기;

public class 강아지사용하기 {

	public static void main(String[] args) {
		
		강아지 p1 = new 강아지();
		p1.price = 1000;
		p1.color = "흰색";
		p1.훈련하다();
		System.out.println("p1의 가격 : " + p1.price);
		System.out.println("p1의 색깔 : " + p1.color);
		
		
		강아지 p2 = new 강아지();
		p2.price = 2000;
		p2.color = "검은색";
		p2.산책하다();
		System.out.println("p2의 가격 : " + p2.price);
		System.out.println("p2의 색깔 : " + p2.color);

	}

}
