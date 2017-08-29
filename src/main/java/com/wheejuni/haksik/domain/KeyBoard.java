package com.wheejuni.haksik.domain;

import java.util.ArrayList;
import java.util.List;

import com.wheejuni.haksik.domain.Cafeteria.CafName;
import com.wheejuni.haksik.domain.Meal.MealType;

public class KeyBoard {

	public enum KeyboardType {
		TXT("text"), BTN("buttons");
		private String type;

		KeyboardType(String type) {
			this.type = type;
		}

		public String getKeyType() {
			return this.type;
		}

	}

	public enum CampusSelectKeys {
		SEOUL("서울캠퍼스"), GLOBAL("글로벌캠퍼스"), PREV("이전 단계로");

		private String button;

		CampusSelectKeys(String button) {
			this.button = button;
		}

		public String getButton() {
			return this.button;
		}
	}

	String type;
	List<String> buttons = new ArrayList<>();

	public static KeyBoard returnDefaultKeyboard() {
		KeyBoard defaultkeys = new KeyBoard();
		defaultkeys.type = KeyboardType.BTN.getKeyType();
		defaultkeys.buttons.add(CampusSelectKeys.SEOUL.getButton());
		defaultkeys.buttons.add(CampusSelectKeys.GLOBAL.getButton());

		return defaultkeys;
	}

	public static KeyBoard returnSeoulKeyboard() {
		KeyBoard seoulKeys = new KeyBoard();
		seoulKeys.type = KeyboardType.BTN.getKeyType();
		seoulKeys.buttons.add(CafName.SEOUL_INMUN.getCafName());
		seoulKeys.buttons.add(CafName.SEOUL_GYOSU.getCafName());
		seoulKeys.buttons.add(CampusSelectKeys.PREV.getButton());
		return seoulKeys;
	}
	
	public static KeyBoard returnGlobalKeyboard() {
		KeyBoard globalKeys = new KeyBoard();
		globalKeys.type = KeyboardType.BTN.getKeyType();
		globalKeys.buttons.add(CafName.GLOBAL_GUKJE.getCafName());
		globalKeys.buttons.add(CafName.GLOBAL_HUSAENG_FAC.getCafName());
		globalKeys.buttons.add(CafName.GLOBAL_HUSAENG_STUDENTS.getCafName());
		globalKeys.buttons.add(CafName.GLOBAL_LINGUA.getCafName());
		globalKeys.buttons.add(CafName.GLOBAL_HUFSDORM.getCafName());
		globalKeys.buttons.add(CampusSelectKeys.PREV.getButton());
		return globalKeys;
	}
	
	public static KeyBoard returnMealChoice() {
		KeyBoard mealChoice = new KeyBoard();
		mealChoice.type = KeyboardType.BTN.getKeyType();
		mealChoice.buttons.add(Meal.MealType.BREAKFAST.getMealType());
		mealChoice.buttons.add(MealType.LUNCH.getMealType());
		mealChoice.buttons.add(MealType.DINNER.getMealType());
		mealChoice.buttons.add(CampusSelectKeys.PREV.getButton());
		
		return mealChoice;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<String> getButtons() {
		return buttons;
	}

	public void setButtons(List<String> buttons) {
		this.buttons = buttons;
	}

}
