package 배열;

public class 배열다루기 {

	public static void main(String[] args) {
	
//		int[] x = new int[10]; //legnth: 10
//		x[0] = 10;
//		x[1] = 20;
//		
//		for (int i = 0; i < 10; i++) {
//			System.out.print(x[i] + " ");
//		}
		
//		System.out.println(x[0]);
//		System.out.println(x[1]);
//		System.out.println(x[2]);
		
		char[] gender = {'남', '여', '여', '여'};
		for (int i = 0; i < gender.length; i++) {
			System.out.print(gender[i] + " "); 
		}
		System.out.println(); 
		
		String[] name = {"aaa ", "bbb ", "ccc ", "ddd "};
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i]); 
		}
		System.out.println(); 
		
		double[] eyes = new double[4];
		eyes[2] = 1.2;
		
		for (int i = 0; i < 4; i++) {
			System.out.print(eyes[i] + " ");
		}
		System.out.println(); 
		
		boolean[] food = new boolean[4];
		food[2] = true;
		
		for (int i = 0; i < 4; i++) {
			System.out.print(food[i] + " ");
		}
		
	
		
		
		
		
		
		
		
		
		
		
	}

}
