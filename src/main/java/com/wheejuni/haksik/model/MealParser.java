package com.wheejuni.haksik.model;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import com.wheejuni.haksik.domain.Cafeteria;
import com.wheejuni.haksik.domain.Cafeteria.CafName;
import com.wheejuni.haksik.domain.Meal;
import com.wheejuni.haksik.repositories.CafeteriaRepository;
import com.wheejuni.haksik.repositories.MealRepository;
import com.wheejuni.haksik.utils.DateUtils;

public class MealParser {

	@Autowired
	CafeteriaRepository cafeRepo;

	@Autowired
	MealRepository mealRepo;

	public ArrayList<Cafeteria> setCafs() {
		String today = DateUtils.getDate();
		ArrayList<Cafeteria> cafList = new ArrayList<>();

		cafList.add(new Cafeteria(CafName.SEOUL_INMUN, today));
		cafList.add(new Cafeteria(CafName.SEOUL_GYOSU, today));
		cafList.add(new Cafeteria(CafName.GLOBAL_GUKJE, today));
		cafList.add(new Cafeteria(CafName.GLOBAL_HUFSDORM, today));
		cafList.add(new Cafeteria(CafName.GLOBAL_HUSAENG_FAC, today));
		cafList.add(new Cafeteria(CafName.GLOBAL_HUSAENG_STUDENTS, today));
		cafList.add(new Cafeteria(CafName.GLOBAL_LINGUA, today));

		return cafList;

	}

	public void saveCafs() {
		if (cafeRepo == null) {
			throw new RepositoryFailException("레포지토리 확인 바랍니다.");
		}
		ArrayList<Cafeteria> cafList = setCafs();
		if (cafList == null) {
			System.out.println("하나에 코드를! 둘에 잘짜자!");
		}
		for (Cafeteria cafe : cafList) {
			if (cafe == null) {
				System.out.println("하나에 코딩을! 둘에 잘하자! 하나! 코딩을~ 둘! 잘하자~");
			}
			cafeRepo.save(cafe);
		}
	}

	public boolean saveMeals(Meal meal) {

		try {
			String date = DateUtils.getDate();
			String cafName = meal.getCafname();

			Cafeteria caf = cafeRepo.findByNameAndDate(cafName, date);
			meal.setCafeteria(caf);
			mealRepo.save(meal);
			return true;
		} catch (Exception e) {
			e.printStackTrace(System.err);
			return false;
		}
	}

}
