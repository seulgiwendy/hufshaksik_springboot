package com.wheejuni.haksik.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wheejuni.haksik.domain.Meal;
import com.wheejuni.haksik.domain.MessageResponse;
import com.wheejuni.haksik.domain.ParseMessage;
import com.wheejuni.haksik.model.MealParser;
import com.wheejuni.haksik.utils.DateUtils;

@RestController("/api")
public class ParserController {

	private static final String PROCESSED_TIME = DateUtils.getTimeStamp();
	
	MealParser mealParser = new MealParser();

	@PostMapping("/parser")
	public ParseMessage getParseCommand(@RequestBody Meal meal) {
		
		System.out.println("Something has invoked POST request to parser.");
		System.out.println(meal);
		mealParser.saveCafs();
		return new ParseMessage(mealParser.saveMeals(meal), PROCESSED_TIME, meal.getCafname());

	}

}
