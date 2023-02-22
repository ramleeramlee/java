package 인터페이스;

public class AppleComputer implements Computer{


	@Override
	public void 사이즈() {
		System.out.println("24인치");
		
	}

	@Override
	public void 색깔() {
		System.out.println("화이트");
		
	}

	@Override
	public void 출시() {
		System.out.println("2020");
		
	}

}
