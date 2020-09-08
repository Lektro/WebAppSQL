package com.realdolmen.springmvc;

import com.realdolmen.springmvc.dbacces.SearchEmployees;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringMvcApplication {

	public static void main(String[] args) {
		SearchEmployees.searchAllEmployees();


		SpringApplication.run(SpringMvcApplication.class, args);
	}

}
