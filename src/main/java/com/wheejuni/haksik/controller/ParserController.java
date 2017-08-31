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
import com.wheejuni.haksik.repositories.MealRepository;
import com.wheejuni.haksik.utils.DateUtils;

@RestController("/api")
public class ParserController {
	
	@Autowired
	public MealRepository mealRepo;
	
	MealParser mp = new MealParser();
	
	
	private static final String PROCESSED_TIME = DateUtils.getTimeStamp();
	


	@PostMapping("/parser")
	public ParseMessage getParseCommand(@RequestBody Meal meal) {
		
		System.out.println("Something has invoked POST request to parser.");
		System.out.println(meal);
		mealRepo.save(meal);
		return new ParseMessage(true, PROCESSED_TIME, meal.getCafname());

	}
	
	public MealRepository getMealRepo() {
		return this.mealRepo;
	}

}
