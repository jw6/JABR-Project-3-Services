package com.revature.project3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.project3.beans.Story;
import com.revature.project3.service.StoryService;

@RestController
public class AddStoryCtrl {
	
	@Autowired
	StoryService service;
	
	// Adds a new story to the dataBase.
	@PostMapping("/addStory")
	public Story addStory(@RequestBody Story story) {
		return service.addStory(story);
	}
}
