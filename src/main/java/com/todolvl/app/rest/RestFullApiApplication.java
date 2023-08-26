package com.todolvl.app.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class RestFullApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestFullApiApplication.class, args);
	}

}
