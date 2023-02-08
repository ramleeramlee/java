package 조건문;

import java.util.Scanner;

public class 콘솔입력3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나의 이름은? ");
		String b = sc.next();
		System.out.print("나의 키는? ");
		double b1 = sc.nextDouble();
		System.out.print("나의 몸무게는? ");
		double b2 = sc.nextDouble();
		System.out.print("나는 저녁을 먹었나요?(true/false) ");
		boolean b3 = sc.nextBoolean();
		System.out.print("나의 좌우명은? ");
		sc.nextLine(); //위에 엔터를 여기서 잡아준다
		String b4 = sc.nextLine();
		
		System.out.println("=====================");
		
		System.out.println("내 이름은 " + b + "입니다.");
		System.out.println("내 내년 키는 " + b1 + "입니다.");
		System.out.println("내 내년 몸무게는 " + b2 + "입니다.");
		System.out.println("나는 저녁을 " + b3 + "했습니다.");
		System.out.println("나의 좌우명은 " + b4 + "입니다.");
		
		sc.close(); 
	}

}
