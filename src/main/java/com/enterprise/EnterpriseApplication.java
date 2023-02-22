package com.enterprise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//@Configuration
//@ComponentScan
//@EnableAutoConfiguration
//@EntityScan("com.enterprise")

@SpringBootApplication
//@EnableJpaRepositories("com.enterprise.model.*")
//@EnableAutoConfiguration(exclude =
//		{JpaRepositoriesAutoConfiguration.class})
//@ComponentScan("com.enterprise.controller.*")
//@EntityScan(basePackages = {"com.enterprise.model"})
//@Configuration
//@EntityScan(basePackages = {"com.enterprise.model"})
public class EnterpriseApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnterpriseApplication.class, args);
	}

}
