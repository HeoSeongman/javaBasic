package 네트워크;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPReceiver {

	public static void main(String[] args) throws Exception {
		// 1. 받는 소켓이있어야한다. (port)
		DatagramSocket socket = new DatagramSocket(9001);
		// 2. 패킷으로 보냈기 때문에 빈 패킷을 만들어두먼
		//	  빈 패킷안에는 빈 byte[]이 있어야한다.
		byte[] data = new byte[256];
		DatagramPacket packet = new DatagramPacket(data, data.length);
		// 3. 소켓이 받아서 빈 패킷에 넣는다.
		socket.receive(packet);
		// 4. byte[]에 있는 String으로 바꾸어준다.
		System.out.println("받은 데이터는 => " + new String(data));
		// 5. 소켓 닫기
		socket.close();
	}

}
