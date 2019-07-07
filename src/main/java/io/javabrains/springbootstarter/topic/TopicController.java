package io.javabrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return Arrays.asList(
				//this returns a list of objects
				new Topic("Spring", "Spring Framework", "Spring Framework Description"),
				new Topic("Java", "Core Java", "Core Java Description"),
				new Topic("Javascript", "Javascript Framewordk", "Javascript Description")
				
			);
	}
}
