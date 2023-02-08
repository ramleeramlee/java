package 조건문;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class 콘솔입력4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String id = JOptionPane.showInputDialog("아이디를 입력하세요");
		String pw = JOptionPane.showInputDialog("비번을 입력하세요");
		
		if (id.equals("root") && pw.equals("1234")) {
			System.out.println("로그인 성공!");
		}else {
			System.out.println("로그인 실패!");
		}
		
		System.out.print("사과 구매 갯수 ");
		int b = sc.nextInt();
		System.out.print("사과 한 개당 가격 ");
		int b1 = sc.nextInt();
		System.out.print("딸기 구매 갯수 ");
		int b2 = sc.nextInt();
		System.out.print("딸기 한 개당 가격 ");
		int b3 = sc.nextInt();
		
		
		System.out.println("사과 구매 가격은 " + (b * b1) + "원 입니다.");
		System.out.println("딸기 구매 가격은 " + (b2 * b3) + "원 입니다.");
		System.out.println("전체 구매 가격은 " + ((b * b1) + (b2 * b3)) + "원 입니다.");
		
		
		
		

		sc.close(); 
	}

}
