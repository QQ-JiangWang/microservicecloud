package com.longrise.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.longrise.springcloud"})
@ComponentScan("com.longrise.springcloud")
public class DeptApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeptApplication.class, args);
	}

}
