package 부품만들기;

public class 강아지 {
	// 성질 : 멤버변수 (가격, 모양)
	//public은 아무데서나(다른 패키지에서도) 접근 가능 설정(접근제어자)
	public int price; //멤버변수는 자동초기화!!  int price = 0;과 같은 의미
	public String color; // 기본형이 아닌 경우(참조형) 모두 null로 초기화
	
	// 동작 : 멤버메서드 (함수와 동일), 동적인 기능을 수행 (인터넷하다, 카톡하다)
	public void 훈련하다() {
		//기능 처리하는 방법을 나열
		System.out.println("앉아!!");
		System.out.println("기다려!!");
	}
	public void 산책하다() {
		System.out.println("공원산책하다");
		System.out.println("달리기하다");
	}
	
}
