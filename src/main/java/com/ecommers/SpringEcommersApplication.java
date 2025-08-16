package com.ecommers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SpringEcommersApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEcommersApplication.class, args);
	}

}
