package com.wheejuni.haksik.domain;

public class MessageResponse {

	Message message;
	KeyBoard keyboard;
	
	public MessageResponse(Message message, KeyBoard keyboard) {
		this.message = message;
		this.keyboard = keyboard;
	}

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}

	public KeyBoard getKeyboard() {
		return keyboard;
	}

	public void setKeyboard(KeyBoard keyboard) {
		this.keyboard = keyboard;
	}
 
}
