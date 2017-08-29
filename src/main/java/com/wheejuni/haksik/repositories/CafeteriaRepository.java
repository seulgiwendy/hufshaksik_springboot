package com.wheejuni.haksik.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.wheejuni.haksik.domain.Cafeteria;

public interface CafeteriaRepository extends CrudRepository<Cafeteria, Long> {
	
	Cafeteria findByNameAndDate(@Param("name")String name, @Param("date")String date);
	Cafeteria findByDate(String date);

}
