package com.multi.mvc902Chatbot;

import java.util.Date;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {
	
	@MessageMapping("/chat") // 클라이언트가 메시지를 보낼 주소
	@SendTo("/topic/messages") // 클라이언트가 구독할 경로, 해당 경로를 구독한 클라이언트에게 받은 메시지를 보냄
	public OutputMessage send(Message msg) {
		System.out.println("msg >> from : " + msg.getFrom() + " ||| text : " + msg.getText());
		Date date = new Date();
		return new OutputMessage(msg.getFrom(), msg.getText(), date.getHours() + " : " + date.getMinutes());
	}
	
	@MessageMapping("/chat2") // 클라이언트가 메시지를 보낼 주소
	@SendTo("/topic/messages2") // 클라이언트가 구독할 경로, 해당 경로를 구독한 클라이언트에게 받을 메시지를 보냄
	public OutputMessage2 send2(Message msg) {
		System.out.println("msg2 >> from : " + msg.getFrom() + " ||| text : " + msg.getText());
		String menu = null;
		
        switch (msg.getText()) {
        case "1":
            menu = "챗 봇>> 10) 운동화      11) 모자          12) 가방";
            break;
        case "2":
            menu = "챗 봇>> 20) 배송조회   21) 주문완료상품조회";
            break;
        case "20":
            menu = "챗 봇>> DB에서 가지고 온 배송 상황 목록 \n" +
                        "상품명: 르꼬뿌      배송상황: 물건 준비중";
            break;
        case "10":
            menu = "챗 봇>> 100) 나이커   200) 르꼬뿌            300) 라코스또";
            break;
        case "100":
            menu = "챗 봇>> 1000) 나이커 운동화 세부 메뉴    1) 다시 처음 메뉴";
            break;
        case "1000":
            menu = "챗 봇>> 1001)나이커빨강(1만원)  1002)나이커파랑(2만원)   1003)나이커보라(3만원)   100)이전 메뉴로";
            break;
        default:
            menu = "챗 봇>>선택한 번호는 없는 메뉴입니다. 다시 입력해주세요.";
            break;
        }
		
		return new OutputMessage2(msg.getFrom(), msg.getText(), menu);
	}
	
	@MessageMapping("/chat3") // 클라이언트가 메시지를 보낼 주소
	@SendTo("/topic/messages3") // 클라이언트가 구독할 경로, 해당 경로를 구독한 클라이언트에게 받을 메시지를 보냄
	public OutputMessage2 send3(Message msg) {
		System.out.println("msg2 >> from : " + msg.getFrom() + " ||| text : " + msg.getText());
		String menu = null;
		
		switch (msg.getText()) {
		case "0":
			menu = "챗 봇>> 1)공연 및 축제문의  2)예매 문의  3)회원관리  4)기타  0)초기화면";
			break;
		case "1":
			menu = "챗 봇>> 1)요즘 인기있는 공연, 축제  2)후기관련  3)휠체어석";
			break;
		case "2":
			menu = "챗 봇>> 1)결제방법  2)티켓수령안내  3)취소/환불";
			break;
		case "3":
			menu = "챗 봇>> 1)회원가입  2)회원탈퇴  3)회원정보 변경  4)아이디/비밀번호 분실";
			break;
		case "11":
			menu = "챗 봇>> 공연, 축제 메뉴에서 인기순으로 검색하시면 해당 정보를 확인하실 수 있습니다.";
			break;
		case "12":
			menu = "챗 봇>> 행사포스터 클릭 후 하단에서 확인하실 수 있습니다." + 
					"해시태그 검색 메뉴에서 SNS에 올라온 실시간 후기들도 확인하실 수 있습니다.";
			break;
		case "13":
			menu = "챗 봇>> 해당 공연 공연장에 문의해 주시길 바랍니다.";
			break;
		case "21":
			menu = "챗 봇>> 결제 방식은 신용카드, 무통장입금이 있습니다.";
			break;
		case "22":
			menu = "챗 봇>> 공연 당일 현장 교부처에서 예약번호 및 본인 확인 후 티켓을 수령하실 수 있습니다." + 
					"상단 예매확인/취소 메뉴에서 예매내역을 프린트하여 가시면 편리합니다..";
			break;
		case "23":
			menu = "챗 봇>> My티켓 > 예매/취소내역에서 직접 취소 또는 고객센터(0000-0000)를 통해서 예매를 취소할 수 있습니다.";
			break;
		default:
			menu = "챗 봇>> 선택한 번호는 없는 메뉴입니다. 초기화면으로 돌아갑니다.";
			msg.setText(String.valueOf(0));
			break;
		}
		
		return new OutputMessage2(msg.getFrom(), msg.getText(), menu);
	}
	
	
}
