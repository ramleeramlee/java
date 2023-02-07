package 조건문;

public class IF문2 {

	public static void main(String[] args) {
		//조건이 여러개일때
		int myNum = 99;
		
		if (myNum >= 80) {
			System.out.println("최우수");
		}else if (myNum >= 70) {
			System.out.println("우수");
		}else if (myNum >= 60) {
			System.out.println("보통");
		}else {
			System.out.println("미달");
		}	
		
		int myTour = 10;
		
		//long x, 실수(double) x, string o char o int o
		switch (myTour) {
		case 10: 
			System.out.println("VVIP");
			break; //switch문은 수동으로 break써주어야 한다
		case 6: 
			System.out.println("VIP");
			break;
		default:
			System.out.println("normal");
			
		}
		
		
		}
	}


