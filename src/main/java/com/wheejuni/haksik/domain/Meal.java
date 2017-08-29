package com.wheejuni.haksik.domain;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Meal {

	public enum MealType {

		BREAKFAST("조식"), LUNCH("중식"), DINNER("석식"), CUPBOB("컵밥"), ILPUM("일품");

		private String representation;

		private MealType(String representation) {
			this.representation = representation;
		}

		public String getMealType() {
			return this.representation;
		}

	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String menutitle;
	private String submenu;
	private String price;
	private String startTime;
	private String endTime;

	private String cafname;

	private String cornerName;

	@ManyToOne
	@JoinColumn(foreignKey = @ForeignKey(name = "fk_menus_cafeteria"))
	private Cafeteria cafeteria;

	public Meal(String menutitle, String submenu, String price, String startTime, String endTime, MealType mealtype) {
		this.menutitle = menutitle;
		this.submenu = submenu;
		this.price = price;
		this.startTime = startTime;
		this.endTime = endTime;
		this.cornerName = mealtype.getMealType();
	}

	public Cafeteria getCafeteria() {
		return cafeteria;
	}

	public void setCafeteria(Cafeteria cafeteria) {
		this.cafeteria = cafeteria;
	}

	public String getCafname() {
		return cafname;
	}

	public void setCafname(String cafname) {
		this.cafname = cafname;
	}

	public String getCornerName() {
		return cornerName;
	}

	public void setCornerName(String cornerName) {
		this.cornerName = cornerName;
	}

	public String getMenutitle() {
		return menutitle;
	}

	public void setMenutitle(String menutitle) {
		this.menutitle = menutitle;
	}

	public String getSubmenu() {
		return submenu;
	}

	public void setSubmenu(String submenu) {
		this.submenu = submenu;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	@Override
	public String toString() {
		StringBuffer returnStringBuilder = new StringBuffer();
		returnStringBuilder.append(this.cornerName + "==========");
		returnStringBuilder.append("\n");
		returnStringBuilder.append(this.menutitle);
		returnStringBuilder.append(" -> " + this.price);
		returnStringBuilder.append("\n");
		returnStringBuilder.append("(" + this.submenu + ")");
		returnStringBuilder.append(this.startTime + "~" + this.endTime);
		returnStringBuilder.append("\n");

		return returnStringBuilder.toString();

	}

}
