package 스태틱;

public class 나의일지 {

	public static void main(String[] args) {
		Day day1 = new Day("자바공부", 8, "우리집"); //4개
		System.out.println(Day.count);
		System.out.println(Day.sum);
		//static이 붙은 메서드나 변수는 객체생성하지 않아도
		//클래스이름으로 바로 접근해서 사용 가능
		
		Day day2 = new Day("산책", 1, "수성못");
		System.out.println(Day.count);
		System.out.println(Day.sum);
		
		Day day3 = new Day("쇼핑", 2, "백화점");
		System.out.println(Day.count);
		System.out.println(Day.sum);
		//총 12개 다이나믹 생성, 멤버변수 
		//==> 객체생성할 때마다 다이나믹하게 무더기영역(heap)에 생긴 변수
		//인스턴스 변수라고 부른다
		
		System.out.println(day1);
		System.out.println(day2);
		System.out.println(day3);
	}

}
