package 네트워크프로그램;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPSender {

	public static void main(String[] args) throws Exception {
		// UDP용 소켓이 있어야 함
		DatagramSocket socket = new DatagramSocket(); //전화기 역할
		
		// UDP용 패킷이 있어야 함(데이터, 데이터의 크기, ip, port)
		String s = "i am java programmer..";
		byte[] data = s.getBytes();
		InetAddress ip = InetAddress.getByName("127.0.0.1");
		//localhost 와 127.0.0.1 ==> 자기 pc의 ip
		DatagramPacket packet = new DatagramPacket(data, data.length, ip, 8888);
		
		// 소켓을 이용해서 패킷을 보낸다
		socket.send(packet);
		socket.close(); //전화기를 끊는다
		
		
		
		
		
		
		
	}

}
