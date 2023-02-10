package 복습;

public class 배열만들기 {

	public static void main(String[] args) {
		//1. 배열 만들기 - 이미 값을 알고 있는 경우
		String[] hobby = {"run", "book", "swim","walk"};
		
		System.out.println(hobby);
		System.out.println("0: " + hobby[0]);
		System.out.println("1: " + hobby[1]);
		System.out.println(hobby.length);
		System.out.println(hobby[3]);
		System.out.println(hobby[hobby.length - 1]);
		
		//c타입의 for문
		for (int i = 0; i < hobby.length; i++) {
			// i ==> index의 역할, 0,1,2
			System.out.println(i + ": " + hobby[i]);
		}
		
		
		//2. 값을 모르는 경우 - 공간부터 만들어두자
		String[] jobs = new String[5];
		System.out.println(jobs);
		jobs[0] = "백엔드 프로그래머";
		jobs[1] = "카페주인";
		System.out.println(jobs[0]);
		System.out.println(jobs[1]);
		System.out.println(jobs[jobs.length - 1]);
		for (int i = 0; i < jobs.length; i++) {
			System.out.println(i + ": " + jobs[i]);
		}for (String x : jobs) {
			System.out.println(x);
		}
		
		
		String[] trip = {"오사카", "서울", "오키나와", "대만", "스위스"};
		for (int i = 0; i < trip.length; i++) {
			System.out.println(trip[i]);
		}
		
		
		char[] color = {'r','g','b','w','y'};
		for (int i = 0; i < color.length; i++) {
			System.out.println(color[i]);
		}
		
		
		
		
	}

}
