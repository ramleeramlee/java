package 제어문;

import javax.swing.JOptionPane;

public class 문제풀이1 {

	public static void main(String[] args) {
		// 프로그램을 어떤 순서대로 짜야할까?
		// 1.입력 : 데이터를 가지고 온다
		// 2.처리 : 특정한 작업 수행
		// 3.출력 : 처리한 내용을 보여주세요
		// 자바는 자주 사용하는 부품은 대문자로 바로 쓸 수 있다
		// 외부에서 대화창같은 것으로 입력받은 경우는 무조건 컴퓨터는 String(문자열)로 인식
		
		//입력(input)
		String date = JOptionPane.showInputDialog("오늘은 무슨 요일인가요?");
		String date2 = JOptionPane.showInputDialog("수업 끝나고 무엇을 하실 예정인가요?");
		// Jop + 컨트롤 스페이스바 == Joptionpane
		
		//처리
		String result = "오늘 " + date + "에 수업 후 나는 " + date2 + "할 예정";
		
		//출력
		System.out.println(result);
	}

}
