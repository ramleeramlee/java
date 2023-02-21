package 메서드연습;

public class 내가게3 {

	public static void main(String[] args) {
		계산기3 cal3 = new 계산기3();
		int price = 7000;
		int count1 = 5; //오전 손님 수
		int count2 = 4; //오후 손님 수
		
		//계산기3 이용
		int result = cal3.add(count1, count2);
		System.out.println("오늘 온 손님의 총 합은 " + result + "명 입니다.");
		
		int result2 = cal3.minus(count1, count2);
		System.out.println("손님 수 차이는 " + Math.abs(result2) + "명 입니다.");
		//math.abs --> 마이너스를 없애준다
		//math.ceil --> 올림
		//math.floor --> 내림
		//math.round --> 반올림
		//math.sqrt --> 루트
		//math.pow --> 제곱(x의 y승)
		
		int result3 = cal3.mul(count1, price);
		System.out.println("오전 결제금액은 " + result3 + "원 입니다.");
		
		int result4 = cal3.mul(count2, price);
		System.out.println("오후 결제금액은 " + result4 + "원 입니다.");
		
		int result5 = cal3.add(result3, result4);
		System.out.println("오늘 하루 총 결제금액은 " + result5 + "원 입니다.");
		
		int result6 = cal3.div(result5, result);
		System.out.println("1인당 결제금액은 " + result6 + "원 입니다.");
		
	}
	
}
