package com.wheejuni.haksik.model;

import org.springframework.beans.factory.annotation.Autowired;

import com.wheejuni.haksik.domain.Cafeteria;
import com.wheejuni.haksik.domain.KeyBoard;
import com.wheejuni.haksik.domain.Message;
import com.wheejuni.haksik.domain.MessageIncoming;
import com.wheejuni.haksik.domain.MessageResponse;
import com.wheejuni.haksik.repositories.CafeteriaRepository;
import com.wheejuni.haksik.repositories.MealRepository;
import com.wheejuni.haksik.utils.DateUtils;

public class IncomingMessageProcessor {

	@Autowired
	MealRepository mealRepo;

	@Autowired
	CafeteriaRepository cafeRepo;

	private MessageIncoming message;
	private String reqtime;

	public MessageIncoming getMessage() {
		return message;
	}

	public void setMessage(MessageIncoming message) {
		this.message = message;
	}

	public String getReqtime() {
		return reqtime;
	}

	public void setReqtime(String reqtime) {
		this.reqtime = reqtime;
	}

	public MessageResponse processMesasge() {
		Cafeteria targetCafName;
		targetCafName = cafeRepo.findByNameAndDate(this.message.getContent(), DateUtils.getDate());

		Message message = new Message();
		message.setText(targetCafName.toString());
		return new MessageResponse(message, KeyBoard.returnDefaultKeyboard());

	}

}
