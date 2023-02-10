package 배열응용;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class 연습문제2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] b = new int[5];
		for (int i = 0; i < b.length; i++) {
			System.out.print("정수를 입력>> ");
			b[i] = sc.nextInt();
			
		}
		System.out.println(b[0] + b[2]);
		
		
		String[] b1 = new String[3];
		for (int i = 0; i < b1.length; i++) {
			System.out.print("입력>> ");
			b1[i] = sc.next();
		}
		
		System.out.println(b1[0] + "보다는 " + b1[1]);
		
		
		sc.close();
}

}
