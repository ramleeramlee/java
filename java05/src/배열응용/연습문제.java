package 배열응용;

import java.util.Random;

import javax.swing.JOptionPane;

public class 연습문제 {

	public static void main(String[] args) {
		int[] jumsu = new int[10000];

		Random r = new Random(42);
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(451);
		}
		for (int i = 0; i < jumsu.length; i++) {
			System.out.println(i + ": " + jumsu[i]);
		}
		
		System.out.println("==================");

		int count = 0;
		int count1 = 0;
		for (int x : jumsu) {
			if (x == 450) {
				count++;
			}
			if (x == 0) {
				count1++;
			}
		}
			System.out.println("만점자: " + count);
			System.out.println("0점자: " + count1);
		
		
		int sum = 0;
		for (int x:jumsu){
			sum = sum + x;
		}
		System.out.println(sum);

		double avg = (double) sum / jumsu.length;
		System.out.println("평균: "+avg);
		
		int avgPM = 0;
		for (int x : jumsu) {
			if ((avg-50 <= x) && (x<= avg+50)) {
				 avgPM++;
			}
		}
		System.out.println("평균범위에 있는 수험생수는 " + avgPM + "명");


}

}
