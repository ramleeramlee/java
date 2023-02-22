package 인터페이스;

public class BananaComputer implements Computer{

	@Override
	public void 사이즈() {
		System.out.println("27인치");
		
	}

	@Override
	public void 색깔() {
		System.out.println("블랙");
		
	}

	@Override
	public void 출시() {
		System.out.println("2022");
		
	}

}
