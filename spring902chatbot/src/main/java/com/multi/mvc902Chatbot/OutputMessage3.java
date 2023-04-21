package com.multi.mvc902Chatbot;

import org.springframework.messaging.handler.annotation.SendTo;

//@SendTo("topic/messages")
public class OutputMessage3 {
	
	private String from;
	private String text;
	
	public OutputMessage3() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public OutputMessage3(String from, String text) {
		super();
		this.from = from;
		this.text = text;
	}

	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	
}
