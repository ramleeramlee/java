package 조건문;

import javax.swing.JOptionPane;

public class 설문조사10명 {

	public static void main(String[] args) {
		// 10명에게 배부른가요?? 물어보고
		// 부르다고 한 사람, 안부르다고 한 사람 몇 명인지 카운트
		
		int full = 0;
		int noFull = 0;
		for (int i = 0; i < 10; i++) {
			String data = JOptionPane.showInputDialog("배부른가요? 1.배부름 2.배안부름");
			if (data.equals("1")) {
				full = full + 1; // 0+1 // full++; 와 같다 // 1 만 증가시킬때 사용
			}else if (data.equals("2")) {
				noFull++;
			} //else
		} //for
		
		System.out.println("배부른 사람 몇 명? " + full + "명");
		System.out.println("배안 부른 사람 몇 명? " + noFull + "명");
		
		
	}

}
