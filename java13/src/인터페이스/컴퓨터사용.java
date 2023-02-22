package 인터페이스;

public class 컴퓨터사용 {

	public static void main(String[] args) {
//		AppleComputer a = new AppleComputer();
//		// Computer a = new AppleComputer(); 도 같다
//		BananaComputer b = new BananaComputer();
//		
//		a.사이즈();
//		a.색깔();
//		a.출시();
//		b.사이즈();
//		b.색깔();
//		b.출시();
		
		Computer com = new Computer() {
			//익명클래스(computer인터페이스를 구체적으로 구현한 
			//이름없는 클래스를 가지고 객체생성함
			@Override
			public void 사이즈() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void 색깔() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void 출시() {
				// TODO Auto-generated method stub
				
			}
			
		};

	}
}

