package 네트워크프로그램;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) throws Exception {
		// 1. 승인용 소켓을 만들어주자
		// 2. 서버는 무한루프(계속 살아있게 하기)
		// 3. 요청이 있으면 승인을 해주고 통신할 수 있는 소켓을 만들어주자
		
		ServerSocket server = new ServerSocket(9100); //port (4글자 아무거나 넣으면 됨)
		System.out.println("승인용 서버 소켓 시작");
		System.out.println("클라이언트 연결을 기다리는 중");
		int count = 0;
		while (true) { //무한루프
			Socket socket = server.accept(); //Socket
			count++;
			System.out.println(count + ">> 승인완료! Socket생성됨!");
		}

	}

}
