package io.javabrains.springbootstarter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.javabrains.springbootstarter.service.Topic;
import io.javabrains.springbootstarter.service.TopicService;

@RestController
@Component
public class TopicController {
	
	@Autowired
	TopicService topicservice;
	
	@RequestMapping("/Topics")
	public List<Topic> getAllTopics()
	{
		return topicservice.getAllTopics();
	}
}
	
			
