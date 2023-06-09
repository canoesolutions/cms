package com.mkpits.cms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
@EnableJpaRepositories(basePackages = "com.mkpits.cms.*")
public class ContentMgmtSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContentMgmtSystemApplication.class, args);
	}

}
