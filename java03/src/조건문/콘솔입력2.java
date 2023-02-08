package 조건문;

import java.util.Scanner;

public class 콘솔입력2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나에 대한 정보");
		
		System.out.println("=====================");
		
		System.out.print("이름 입력>> ");
		String b = sc.next();
		System.out.print("나이 입력>> ");
		int b1 = sc.nextInt();
		System.out.print("취미 입력>> ");
		String b2 = sc.next();
		
		System.out.println("=====================");
		
		
		System.out.println("나의 이름은 " + b);
		System.out.println("나의 나이는 " + b1 + "세");
		System.out.println("나의 취미는 " + b2 + "입니다.!");
		
		sc.close();
	}

}
