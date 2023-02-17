package 상속응용;

//동시에 실행시키고 싶은 부품인 Thread로 만들어주세요
//Thread클래스 상속하면 바로 만들어짐	
public class 증가스레드 extends Thread{ //run() : 동시에 실행 될 내용을 run에 넣기
	
	//동시에 실행 할 내용을 run()메서드 안에 넣기
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("증가>> " + i);
		}
	}

}
