package com.wheejuni.haksik.domain;

public class ParseMessage {

	private boolean isSuccess;
	private String processedTime;
	private String requestedCafName;

	public ParseMessage(boolean isSuccess, String processedTime, String requestedCafName) {

		this.isSuccess = isSuccess;
		this.processedTime = processedTime;
		this.requestedCafName = requestedCafName;
	}

	public String getRequestedCafName() {
		return requestedCafName;
	}

	public void setRequestedCafName(String requestedCafName) {
		this.requestedCafName = requestedCafName;
	}

	public boolean isSuccess() {
		return isSuccess;
	}

	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public String getProcessedTime() {
		return processedTime;
	}

	public void setProcessedTime(String processedTime) {
		this.processedTime = processedTime;
	}

}
