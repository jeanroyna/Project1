package com.vmware.project1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Project1Application {

	public static void main(String[] args) {
		SpringApplication.run(Project1Application.class, args);

	}
}
