package 네트워크;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) throws IOException {
		// 1. 승인용 소켓
		// 2. 서버가 계속 대기할 수 있게 무한루프
		// 3. 요청이 있으면 승인, 통신할 수 있는 소켓을 만들어주자.
		ServerSocket sc = new ServerSocket(8769);
		System.out.println("승인용 서버 소켓이 시작됨.");
		System.out.println("클라이언트 연결을 기다리는 중...");
		
		int count = 0;
		while (true) {
			// 승인된 소켓 
			Socket socket = sc.accept();
			count++;
			System.out.println(count + " : 승인 완료! 소켓 생성됨.");
			
			// 해당 소켓에서 출력스트림 가져오기
			OutputStream op = socket.getOutputStream();
			// 형식화된 표현을 텍스트 출력 스트림으로 찍어낸다.
			PrintWriter pw = new PrintWriter(op);
			// 보내는 방법 1
			pw.write(count + " : 서버에서 보냄.");
			pw.println();
			// 보내는 방법 2
//			pw.println("서버에서 보냄.");
			pw.flush();
		}
	}

}
