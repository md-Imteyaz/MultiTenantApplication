package com.multitenant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.multitenant.*")
public class MultiTenantSchedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultiTenantSchedulerApplication.class, args);
	}

}
