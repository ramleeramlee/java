package 복습;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 나의그래픽 {

	public static void main(String[] args) {
		JFrame f = new JFrame("나의 이벤트 처리");
		f.setSize(300, 200);
		
		JButton b = new JButton("나를 눌러");
		
		b.addActionListener(new ActionListener() { //ActionListener() 여기부터 익명클래스
				//클래스가 되었기 때문에 new를 붙일 수 있었다
				//new를 쓰면 따로 클래스를 만들 지 않고 바로 밑에 붙여쓸 수 있는 장점
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//인터페이스에 반드시 actionPerformed()를 쓰라고 규칙이 정해져 있기 때문에
				//이름을 바꾸면 안된다.
				System.out.println("클릭되었음");
			}
		});
		f.add(b);
//		
		f.setVisible(true);
//		

	}

}
