package 상속;

public class 예외처리1 {

	public static void main(String[] args) {
		// 실행 할 때 에러가 발생해서 프로그램이 멈추는 것을 막기 위한 것
		
		System.out.println("1. 나는 프린트 될 거야.");
		
		try {
			//문제가 발생할 것을 코드로 넣어주는 부분
			System.out.println("2. 문제 발생 코드>> " + 10/0);
		} catch (Exception e) {
			//예외상황이 발생하면, 프로그램을 멈추지 말고 잡아서 어떻게 처리 할 지 코드 넣어주는 부분
			System.out.println("에러발생");
//			e.printStackTrace(); 
			System.out.println(e.getMessage());
		}
		
		System.out.println("3. 나는 과연 프린트될까요??");
	}

}
