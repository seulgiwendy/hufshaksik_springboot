package com.wheejuni.haksik.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cafeteria {

	public enum CafName {
		SEOUL_INMUN("인문관식당"), SEOUL_GYOSU("교수회관식당"), GLOBAL_GUKJE("국제사회교육원식당"), GLOBAL_HUSAENG_FAC(
				"후생관 교직원식당"), GLOBAL_HUSAENG_STUDENTS(
						"후생관 학생식당"), GLOBAL_LINGUA("어문관식당"), GLOBAL_HUFSDORM("HufsDorm 식당");

		private String cafname;

		CafName(String cafname) {
			this.cafname = cafname;
		}

		public String getCafName() {
			return this.cafname;
		}
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long cafid;

	@OneToMany(mappedBy = "cafeteria")
	private List<Meal> menulist;

	@Column(unique = false, nullable = false)
	String name;

	@Column(unique = false, nullable = false)
	String date;

	public Cafeteria(CafName name, String date) {
		this.name = name.getCafName();
		this.date = date;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public List<Meal> getMenulist() {
		return menulist;
	}

	@Override
	public String toString() {
		StringBuffer sbf = new StringBuffer();
		String welcome = "오늘의 " + this.name + " 메뉴입니다.";
		sbf.append(welcome);
		sbf.append("\n");
		for (int i = 0; i < welcome.length(); i++) {
			sbf.append("=");
		}
		sbf.append("\n\n\n\n");

		for (Meal meal : menulist) {
			sbf.append(meal.toString());
			sbf.append("\n\n");
		}

		return sbf.toString();
	}

}
