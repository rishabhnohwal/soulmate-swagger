package com.stackroute.soulmate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
@ComponentScan(basePackages = {"com.stackroute.soulmate"})
public class SoulmateApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoulmateApplication.class, args);
		log.info("Spring boot app v1.0");
	}

}
