package com.techgatha.JokeRestServiceSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.techgatha.JokeRestServiceSpringBoot",
	"com.techgatha.JokeRestServiceSpringBoot.database",
	"com.techgatha.JokeRestServiceSpringBoot.service",
	"com.techgatha.JokeRestServiceSpringBoot.controller"})
public class JokeRestServiceSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(JokeRestServiceSpringBootApplication.class, args);
	}

}
