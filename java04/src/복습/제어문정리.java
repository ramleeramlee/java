package 복습;

import java.util.Scanner;

public class 제어문정리 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("시작값>> ");
//		int start = sc.nextInt();
//		System.out.print("종료값>> ");
//		int end = sc.nextInt();
//		
//		int sum = 0;
//		for (int i = start; i <= end; i++) {
//			sum = sum + i;
//		}
//		System.out.println("최종더한값은 " + sum);
		
		
		System.out.print("시작값>> ");
		int start1 = sc.nextInt();
		System.out.print("종료값>> ");
		int end1 = sc.nextInt();
		System.out.print("점프값>> ");
		int jump = sc.nextInt();
		
		int sum1 = 0;
		for (int i = start1; i <= end1; i = i + jump) {
			sum1 = sum1 + i;
			if (sum1 >= 100) {
				System.exit(0);
			}
			
		}
		System.out.println("최종더한값은 " + sum1);
		
		sc.close(); 
	}

}
