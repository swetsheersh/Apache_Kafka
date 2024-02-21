package com.eureka.errekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ErrekaserverApplication {
	public static void main(String[] args) {
		SpringApplication.run(ErrekaserverApplication.class, args);
	}

}
