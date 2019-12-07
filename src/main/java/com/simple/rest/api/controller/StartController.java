package com.simple.rest.api.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.simple.rest.api.models.Person;

@RestController
public class StartController {

	@RequestMapping("/person")
	public Person get(
			@RequestParam(value="name", defaultValue="") String name,
			@RequestParam(value="age", defaultValue="0") int age) {
		return new Person(name, age);
	}
	
	@RequestMapping("/people")
	public Person[] getMany(
			@RequestParam(value="name", defaultValue="") String name,
			@RequestParam(value="age", defaultValue="0") int age) {
		return new Person[] {
				new Person(name, age), 
				new Person(name, age), 
				new Person(name, age)
		};
	}
	
	@RequestMapping("/enter")
	public Person postGet(@RequestBody Person posted) {
		return new Person(posted.getName(), posted.getAge());
	}
	
}
