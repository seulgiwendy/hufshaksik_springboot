package com.wheejuni.haksik;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.wheejuni.haksik.repositories")
@ComponentScan(basePackages = {"com.wheejuni.haksik"})
public class HufshaksikSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(HufshaksikSpringbootApplication.class, args);
	}
}
