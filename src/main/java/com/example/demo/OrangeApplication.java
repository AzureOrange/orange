package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@EnableWebMvc
public class OrangeApplication extends WebMvcConfigurerAdapter{

	public static void main(String[] args) {
		SpringApplication.run(OrangeApplication.class, args);
	}

}
