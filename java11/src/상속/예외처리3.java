package 상속;

import java.io.FileWriter;
import java.io.IOException;

public class 예외처리3 {

	public static void main(String[] args) {
		int[] num = new int[3];
		
		try {
			num[3] = 2;// 문제가 생길 여지가 있는 코드 // 실행x, 실행예외!!
		} catch (Exception e) {
			System.out.println("배열에 문제있음");
//			e.printStackTrace();
		}
		System.out.println(num.length); //배열의 개수
		

}
}
