package 배열;

public class 배열기초확인문제 {

	public static void main(String[] args) {
	
		int[] b = new int[5];
		System.out.println(b.length);
		
		b[0] = 100;
		System.out.println(b[0]);
		
		b[4] = 500;
		System.out.println(b[4]);
		
		b[2] = 200;
		System.out.println(b[2]);
		
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
		
		for (int i = 0; i < b.length; i++) {
			System.out.print(i + ": " + b[i] + " ");
		}
		
	}

}
