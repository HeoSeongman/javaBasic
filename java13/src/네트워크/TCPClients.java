package 네트워크;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClients {
	
	public static void main(String[] args) throws Exception {
		// 서버랑 클라이언트랑
		// 양쪽에 송수신하는 소켓이 있어야함
		// 클라이언트에서 소켓을 만들면
		// 서버소켓으로 승인요청을 보냄
		for (int i = 0; i < 1000; i++) {
			Socket socket = new Socket("localhost", 8769);
//			System.out.println("클라이언트 승인 요청 보냄.");
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			String str = br.readLine();
			System.out.println(str);
			br.close();
		}
	}
}
