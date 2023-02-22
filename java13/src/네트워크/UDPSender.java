package 네트워크;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPSender {

	public static void main(String[] args) throws Exception {
		// UDP용 소켓 생성
		DatagramSocket socket = new DatagramSocket();
		
		// 소켓을 이용해서 패킷을 보낸다.
		String str = "I am Java Programmer.";
		// 이름으로 ip 주소 가져오기
		InetAddress ip = InetAddress.getByName("127.0.0.1");
		// UDP용 패킷(데이터, 데이터의 크기, ip, port) 생성
		DatagramPacket packet = new DatagramPacket(str.getBytes(), str.length(), ip, 9001);
		
		// 패킷 보내기
		socket.send(packet);
		// 소켓 닫기
		socket.close();
	}

}
