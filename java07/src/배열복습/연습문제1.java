package 배열복습;

public class 연습문제1 {

	public static void main(String[] args) {
		String s = " 011-245-1234 ";
		// 스트링에 들어있는 문자열을 분리시키고 싶을 때 split(기준), 기준==구분자
		// 분리된 결과는 배열에 들어감
		String s2 = s.trim(); // 공백제거
		System.out.println(s2.length()); // 12

		String[] s3 = s2.split("-");
		System.out.print(s3[0]);
		System.out.print(s3[1]);
		System.out.println(s3[2]);

		if (s3[0].equals("011")) {
			System.out.println("SK");
		} else if (s3[0].equals("019")) {
			System.out.println("LG");
		} else {
			System.out.println("Apple");
		}

		if (s3[1].length() >= 4) {
			System.out.println("최신폰");
		} else {
			System.out.println("올드폰");
		}
		
		int total = s3[0].length() + s3[1].length() + s3[2].length();
		System.out.println(total);
		if (total >= 10) {
			System.out.println("유효한 전화번호");
		} else {
			System.out.println("유효하지않은 전화번호");
		}
		
		
		
//		String[] s2 = s.split(",");
//		System.out.println(s2.length);
//		System.out.println(s2[0]);
//		
//		String ss = "감자 고구마 양파";
//		String[] s22 = ss.split(" ");
//		System.out.println(s22[2]);
//		
//		String s3 = "    홍길동"; //4
//		System.out.println(s3.trim());
//		String s4 = s3.trim();
//		System.out.println(s4.length()); //글자수 확인
//		
//		String s5 = s3.replace("    ", "");
//		System.out.println(s5.length());
		
		
	}

}
