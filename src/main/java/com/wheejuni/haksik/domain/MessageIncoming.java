package com.wheejuni.haksik.domain;


public class MessageIncoming {

	public enum IncomingMessageType {
		TEXT("text"), PHOTO("photo");

		private String type;

		IncomingMessageType(String type) {
			this.type = type;
		}

		public String getType() {
			return this.type;
		}
	}

	private String content;

	private String type;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
