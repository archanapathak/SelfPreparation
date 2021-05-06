package com.Archana.practiceHelloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.Archana.controller")
public class PracticeHelloWorldApplication  extends SpringBootServletInitializer  {

	public static void main(String[] args) {
		SpringApplication.run(PracticeHelloWorldApplication.class, args);
	}
	
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		// TODO Auto-generated method stub
		//return super.configure(builder);
		return application.sources(PracticeHelloWorldApplication.class);  
	}
}
