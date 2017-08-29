package com.wheejuni.haksik.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wheejuni.haksik.domain.Meal;
import com.wheejuni.haksik.domain.Meal.MealType;

public class MealTest {
	
	public static final String LINE_SEPARATOR = System.getProperty("line.separator");

	@Test
	public void init() {
		System.out.println(returnNewMeal());
		assertEquals("볶음밥" + LINE_SEPARATOR + 
				"11:00~13:00" + LINE_SEPARATOR
				+ "(단무지)", returnNewMeal().toString());
	}
	
	Meal returnNewMeal() {
		return new Meal("볶음밥", "단무지", "3000원", "11:00", "13:00", MealType.LUNCH);
	}

}
