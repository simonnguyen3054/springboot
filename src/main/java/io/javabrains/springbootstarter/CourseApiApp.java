package io.javabrains.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//annotation
@SpringBootApplication
public class CourseApiApp {

	public static void main(String[] args) {
		//call a static method to run the application
		SpringApplication.run(CourseApiApp.class, args);
		
	}

}
