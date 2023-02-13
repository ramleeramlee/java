package 배열응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 극장예매시스템1 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("극장예매시스템");
		f.setSize(500, 800);
		f.getContentPane().setBackground(Color.lightGray);
		//배치해주는 부품은 FlowLayout 사용
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow); //추가한 순서대로 f에 붙는다.
		
		//버튼 배열 만들어서 집어 넣을 배열 생성
		JButton[] btn = new JButton[100];
		//반복해서 배열에 버튼 만들어 넣어주세요
		//반복해서 f에 add해주세요
		Font font = new Font("굴림", Font.BOLD, 20);
		
		JLabel result = new JLabel("결과 보이는 곳");
		result.setForeground(Color.red);
		result.setFont(font);
		
		//예약 여부를 저장하는 배열을 만들어주자
		int[] seat = new int[btn.length];
		//각 자리에 저장된 값이 0이면 아직 예약안됨. 예약되면 1로 바꿈
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton(i + "");
			btn[i].setFont(font);
			f.add(btn[i]);
			
			
			//버튼에 액션기능 add하기
			//1. 액션기능추가
			//2. 클릭했을 때 어떤 부품이 담당할지 부품 생성
			//3. 클릭했을 때 어떻게 처리할지 코딩해주면 됨
			btn[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// 클릭했을 떄 어떻게 처리할지 
					// e.getActionCommand(); 클릭한 버튼의 글자를 가지고 와줌
					String text = e.getActionCommand();
					System.out.println(text);
					int no = Integer.parseInt(text);//"0" --> 0
					//이미 해당 좌석번호가 1로 저장되어있는지 확인하고, 1이 아니면 예약가능!!
					if (seat[no] == 1) {//이미 예약되어 1이 들어있음. 예약불가
						result.setText("예약불가");
						result.setForeground(Color.red);
					} else {//아직 예약이 안되어서 0이 들어있음. 예약가능
						seat[no] = 1; //예약좌석은 1로 변경
						result.setText(text + "번 예약완료");
						btn[no].setBackground(Color.red);
						btn[no].setEnabled(false);//버튼비활성화
						

					}
				
				}
			});
			
			
		}

		f.add(result);
		JButton total = new JButton("전체 예약 내역");
		total.setBackground(Color.blue);
		total.setForeground(Color.white);
		total.setFont(font);
		
		f.add(total);
		
		total.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 내용 넣기
				// 배열안에 저장된 수 몇개가 1인지 체크해서 카운트
				int count = 0;
				for (int x : seat) {
					if (x == 1) {
						count++;
					}
				}
				JOptionPane.showMessageDialog(f, (count * 10000) + "원 입니다.");
				// 영화예매비 1장당 1만원, 결제금액 출력
				
			}
		});
		
		f.setVisible(true);
	}

}
