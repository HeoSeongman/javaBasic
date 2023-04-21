package com.multi.mvc902Chatbot;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig extends AbstractWebSocketMessageBrokerConfigurer {

	//https://hyeooona825.tistory.com/89
	//채팅방 이름 설정
	@Override
	public void configureMessageBroker(MessageBrokerRegistry config) {
		config.enableSimpleBroker("/topic");
		//메시지 브로커를 활성화하고 브로커를 대상으로 하는 필터에 topic 이라는 접두사를 구성함
		config.setApplicationDestinationPrefixes("/app");
		//서버 측 도착 경로에 대한 접두사를 설정
	}
	
	//채팅 내용을 보낼 주소(endPoint == url)
	@Override
	public void registerStompEndpoints(StompEndpointRegistry registry) {
		//chat: 실시간 채팅용 
		registry.addEndpoint("/chat"); //자바 소켓 통신 가능 
		registry.addEndpoint("/chat").withSockJS(); //자바 스크립트 소켓 통신 
		
		//chat2: 챗봇용 
		registry.addEndpoint("/chat2"); //자바 소켓 통신 가능 
		registry.addEndpoint("/chat2").withSockJS(); //자바 스크립트 소켓 통신
		
		//chat3: myStage 챗봇용 
		registry.addEndpoint("/chat3"); //자바 소켓 통신 가능 
		registry.addEndpoint("/chat3").withSockJS(); //자바 스크립트 소켓 통신 
	}

}
