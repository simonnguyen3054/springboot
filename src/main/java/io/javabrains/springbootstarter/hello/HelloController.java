package io.javabrains.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //this annotation is for restful controller
public class HelloController {

	@RequestMapping("/hello") //another Spring MVC annotation. Takes a param to map to
	public String sayHi() {
		return "Hi!";
	}
}
