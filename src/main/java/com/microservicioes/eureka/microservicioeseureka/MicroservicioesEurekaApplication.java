package com.microservicioes.eureka.microservicioeseureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MicroservicioesEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioesEurekaApplication.class, args);
	}

}
