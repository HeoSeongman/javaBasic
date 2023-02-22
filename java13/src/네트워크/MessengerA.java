package 네트워크;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MessengerA extends JFrame {
	
	DatagramSocket socket;
	JTextArea list;
	JTextField input;
	
	public MessengerA() throws Exception {
		// 1. 받는 소켓이있어야한다. (port)
		socket = new DatagramSocket(7777);
		
		list = new JTextArea();
		input = new JTextField();
		list.setBackground(Color.darkGray);
		input.setBackground(Color.darkGray);
		list.setForeground(Color.white);
		input.setForeground(Color.white);
		input.setCaretColor(Color.white);
		
		Font font = new Font("굴림체", Font.BOLD, 20);
		list.setFont(font);
		input.setFont(font);
		
		list.setEditable(false);
		list.setLineWrap(true);
		this.add(list, BorderLayout.CENTER);
		this.add(input, BorderLayout.SOUTH);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 500);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
		// JTextField는 엔터를 입력하면 이벤트가 발생
		input.addActionListener(action -> {
//			list.append(input.getText() + '\n');
			try {
				// 이름으로 ip 주소 가져오기
				InetAddress ip = InetAddress.getByName("127.0.0.1");
				// UDP용 패킷(데이터, 데이터의 크기, ip, port) 생성
				DatagramPacket packet = new DatagramPacket(input.getText().getBytes("UTF-8"), input.getText().getBytes("UTF-8").length, ip, 5555);
//				DatagramPacket packet = new DatagramPacket(input.getText().getBytes(), input.getText().length(), ip, 5555);
				// 패킷 보내기
				socket.send(packet);

				list.append("나 >> " + input.getText() + '\n');
				input.setText("");
			} catch (Exception e) {
				// TODO: handle exception
			}
		});
		
		// 창 종료 시 이벤트 발생(java07 -> 부품응용하기 -> 일기장쓰기)
		this.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("MessengerA 창 종료됨");
				// 5. 소켓 닫기
				socket.close();
			}
		});

	}
	
	public void process() {
		while (true) {
			try {
				// 2. 패킷으로 보냈기 때문에 빈 패킷을 만들어두먼
				//	  빈 패킷안에는 빈 byte[]이 있어야한다.
				byte[] data = new byte[256];
				DatagramPacket packet = new DatagramPacket(data, data.length);
				// 3. 소켓이 받아서 빈 패킷에 넣는다.
				socket.receive(packet);
				// 4. byte[]에 있는 String으로 바꾸어준다.
				System.out.println("MessengerA 가 받은 데이터 : " + new String(data));
//				list.append("상대방 >> " + new String(data, "UTF-8").trim() + '\n');
				list.append("상대방 >> " + new String(data).trim() + '\n');
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	
	public static void main(String[] args) throws Exception {
		MessengerA a = new MessengerA();
		a.process();
	}
	
}
