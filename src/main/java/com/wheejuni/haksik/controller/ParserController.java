package com.wheejuni.haksik.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.wheejuni.haksik.domain.Meal;
import com.wheejuni.haksik.domain.MessageResponse;
import com.wheejuni.haksik.domain.ParseMessage;
import com.wheejuni.haksik.model.MealParser;
import com.wheejuni.haksik.utils.DateUtils;

@Controller("/api/parser")
public class ParserController {

	private static final String PROCESSED_TIME = DateUtils.getTimeStamp();

	@PostMapping("")
	public ParseMessage getParseCommand(@RequestBody Meal meal) {

		MealParser.saveCafs();
		return new ParseMessage(MealParser.saveMeals(meal), PROCESSED_TIME, meal.getCafname());

	}

}
