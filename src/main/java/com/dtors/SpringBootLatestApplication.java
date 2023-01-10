package com.dtors;

import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootLatestApplication {

	public static void main(String[] args) {

		StringUtils.isNumeric(null);
		SpringApplication.run(SpringBootLatestApplication.class, args);
	}

}
