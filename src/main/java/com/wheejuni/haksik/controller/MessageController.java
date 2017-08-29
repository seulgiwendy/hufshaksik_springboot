package com.wheejuni.haksik.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wheejuni.haksik.domain.Message;
import com.wheejuni.haksik.domain.MessageIncoming;
import com.wheejuni.haksik.domain.MessageResponse;
import com.wheejuni.haksik.model.IncomingMessageProcessor;
import com.wheejuni.haksik.utils.DateUtils;

@RestController("/message")
public class MessageController {



	@PostMapping("")
	public MessageResponse getIncomingMessage(@RequestBody MessageIncoming msg) {
		
		IncomingMessageProcessor messageProcessor = new IncomingMessageProcessor();
		
		messageProcessor.setMessage(msg);
		messageProcessor.setReqtime(DateUtils.getTimeStamp());
		
		
		return messageProcessor.processMesasge();

	}

}
