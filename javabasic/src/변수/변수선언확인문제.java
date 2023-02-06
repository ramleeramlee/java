package 변수;

public class 변수선언확인문제 {

	public static void main(String[] args) {
		int age = 30; // 정수변수
		double tall = 163.8; // 실수변수(실수에 정수도 포함)
		char gender = '여'; // 1글자만 적을 땐 '' 사용
		boolean merry = false; //false
		//기본데이타x -- 너무 많이 쓰기 때문에 기본형처럼 기본형데이터처럼 사용 가능!
		String name = "홍길동";
		//스트링, 실!!, 문자열!!
		
		System.out.println("나의 나이는 " + age);
		System.out.println("나의 키는 " + tall);
		System.out.println("나의 성별은 " + gender);
		System.out.println("나의 결혼여부는 " + merry);
		System.out.println("나의 이름은 " + name);
	}

}
