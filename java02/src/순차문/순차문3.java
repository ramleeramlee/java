package 순차문;

import javax.swing.JOptionPane;

public class 순차문3 {

	public static void main(String[] args) {
		String height = JOptionPane.showInputDialog("당신의 키를 입력하세요");
		String weight = JOptionPane.showInputDialog("당신의 몸무게를 입력하세요");
		
		
		double data1 = Double.parseDouble(height);
		double data2 = Double.parseDouble(weight);
		
		double result = (data1 - data2) * 0.9;
		
		System.out.println(result);
		JOptionPane.showMessageDialog(null, result);
		
		
		
		
	}

}
