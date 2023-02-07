package 조건문;

import javax.swing.JOptionPane;

public class IF문7 {

	public static void main(String[] args) {
		String pw = JOptionPane.showInputDialog("암호를 대시오"); 
		
		if (pw.equals("pass")) {
			System.out.println("들어오세요");
		} else {
			System.out.println("나가세요");
		}
		
		String food = JOptionPane.showInputDialog("당신이 먹고 싶은 저녁 메뉴는(자장면,라면,회)중에서 선택"); 
		
		if (food.equals("자장면")) {
			System.out.println("중국집으로 가요");
		} else if (food.equals("라면")) {
			System.out.println("분식집으로 가요");
		} else if (food.equals("회")) {
			System.out.println("횟으로 가요");
		} else {
			System.out.println("그냥 안먹어요");
		}
		
		String date = JOptionPane.showInputDialog("정수1을 입력하세요");
		String date2 = JOptionPane.showInputDialog("정수2을 입력하세요");
		
		//정수로 변환 Integer.parseInt()
		int date11 = Integer.parseInt(date);
		int date22 = Integer.parseInt(date2);
		
		if (date11 > date22) {
			System.out.println("첫번째 입력값이 더 큼");
		} else if (date11 < date22) {
			System.out.println("두번째 입력값이 더 큼");
		} else {
			System.out.println("두 수가 동일함");
		}
		
		String no = "A100EX";
		char ch = no.charAt(0); //'A'
		switch (ch) {
		case 'A':
			System.out.println("기획부");
			break;
		case 'B':
			System.out.println("총무부");
			break;
		case 'C':
			System.out.println("개발부");
			break;
		default:
			System.out.println("해당부서없음");
		}
		
	}
		
		
		
		
		}
	

