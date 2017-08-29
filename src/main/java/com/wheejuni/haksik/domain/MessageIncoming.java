package com.wheejuni.haksik.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

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
	
	@JsonProperty("content")
	private String content;
	
	@JsonProperty("type")
	private String type;
	
	@JsonProperty("user_key")
	private String userKey;

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
