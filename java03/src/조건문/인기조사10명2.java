package 조건문;

import javax.swing.JOptionPane;

public class 인기조사10명2 {

	public static void main(String[] args) {
		//1.아이유 2.유재석 3.BTS
		
		int love = 0;
		int love2 = 0;
		int love3 = 0;
		
		for (int i = 0; i < 10; i++) {
			String data = JOptionPane.showInputDialog("누굴 더 선호하나요? 1.아이유 2.유재석 3.BTS");
			
			if (data.equals("1")) {
				love++;
			}else if (data.equals("2")) {
				love2++;
			}else if (data.equals("3")) {
				love3++;
			}
		} 
		System.out.println("아이유 좋아하는 사람 " + love + "명");
		System.out.println("유재석 좋아하는 사람 " + love2 + "명");
		System.out.println("BTS 좋아하는 사람 " + love3 + "명");
		
		
	}

}
