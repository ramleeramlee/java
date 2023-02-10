package 배열기본;

import java.util.Random;

public class 많은양만들어보기2 {

	public static void main(String[] args) {
		// 
		int[] jumsu2 = new int[1000];
		
		Random r = new Random();
		
		for (int i = 0; i < jumsu2.length; i++) {
			jumsu2[i] = r.nextInt(19) + 2;
		}
		for (int x : jumsu2) {
			System.out.println(x);
		}
		
		int count = 0;
		int sum = 0;
		for (int i = 0; i < jumsu2.length; i++) {
			if (jumsu2[i] >= 15) {
				count++;
				sum = sum + jumsu2[i];
			}
		}
		System.out.println(count);
		System.out.println(sum);
		
		
	}

}
