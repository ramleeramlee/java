package 배열;

public class 연습문제 {

	public static void main(String[] args) {
		
		int[] week = {1,2,3,4,5,6,7}; 
		System.out.println(week[0]); 
		System.out.println(week[1]); 
		
		System.out.println("전체 데이터 수: " + week.length); 
		
		week[2] = 10; 
		week[4] = 12; 
		System.out.println(week[2]);
		System.out.println(week[4]);
		
		
	
		int[] tour = new int[4];
		tour[0] = 20;
		tour[2] = 30;
		System.out.println(tour[0]);
		System.out.println(tour[2]);
		
		System.out.println("전체 데이터 수: " + tour.length); 

	}

}
