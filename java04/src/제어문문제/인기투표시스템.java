package 제어문문제;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class 인기투표시스템 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int iu = 0; int bts = 0; int nj = 0; //누적시키는 변수는 반복문안에 넣지 않는다
		
		System.out.println("인기투표 시스템\n============");
		
		while (true) {
			System.out.print("1.아이유 2.방탄 3.뉴진스 4.종료>> ");
			int choice = sc.nextInt();
			if (choice == 4) {
				System.out.println("시스템을 종료합니다");
				break;

			} else if (choice == 1) {
				iu++;
			} else if (choice == 2) {
				bts++;
			} else if (choice == 3) {
				nj++;
			} else {
				System.out.println("해당 번호가 없습니다");
			}
		}
			sc.close();
			
	
		System.out.println("아이유" + iu + "표, 방탄"  + bts + "표, 뉴진스 " + nj + "표");
		
		
		
		
		}

			
		
	}



