package com.wheejuni.haksik.repositories;

import org.springframework.data.repository.CrudRepository;

import com.wheejuni.haksik.domain.Meal;

public interface MealRepository extends CrudRepository<Meal, Long>{
	
	Meal findById(long id);
	Meal findByCornerName(String cornername);
	
}
