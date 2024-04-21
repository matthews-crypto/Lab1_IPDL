package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class DemoApplication {
	private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		logger.info("Demo App started successfully, Goto http://localhost:8080/master_student_name");
	}

}
@RestController
@RequestMapping("/master_student_name")
class DemoController{
	@Value("${fullname:Mathieu Khadim ANOMAN}")
	private String fullname;

	@GetMapping
	String getFullname(){
		return "Work done by " + this.fullname +" !";
	}
}