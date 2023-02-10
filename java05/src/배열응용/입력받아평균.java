package 배열응용;

import javax.swing.JOptionPane;

public class 입력받아평균 {

	public static void main(String[] args) {
		// 입력을 여러번 여러개 받아서
		// 저장공간에 넣고 싶을 때 ==> 배열을 사용
		//1. 배열만들기
		int[] jumsu = new int[5];
		
		// 배열에 값을 넣을 땐ㄴ index가 필요 ==>i가 있는 for문 사용해야함
		for (int i = 0; i < jumsu.length; i++) {
			String data = JOptionPane.showInputDialog("숫자 입력");
			//숫자로 변환한 값을 배열의 해당 인덱스 값으로 넣는다
			jumsu[i] = Integer.parseInt(data);
		}
		for (int x : jumsu) {
			System.out.print(x + " ");
		}
		System.out.println();
		
		int sum = 0;
		for (int x : jumsu) {
			sum = sum + x; // sum += x;
		}System.out.println(sum);
		
		double avg = (double)sum / jumsu.length;
		System.out.println("전체평균: " + avg);
		
		
		int sum2 = 0;
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] >= 300) {
				sum2 = sum2 + jumsu[i];
			}
		}
		System.out.println("300이상 되는 합계: " + sum2);
		
		//jumsu[0]에서 0은 jumsu변수에 들어있는 주소가 가르키는 0번 인덱스 공간
		//즉 0은 ==> 위치값, 인덱스를 의미한다
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] >= 300) {
				//특정한 index에 있는 값이 300이상인 위치를 프린트
				System.out.println("300이상인 값이 저장된 인덱스 : " + i);
			}
		}
		
		
		
	}

}
