package com.springrest.springrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entity.Course;
import com.springrest.springrest.services.CourseService;

import java.util.*;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMethod;

@CrossOrigin
@RestController
public class Controller {

	@Autowired
	private CourseService courseservice;

	@RequestMapping("/course")
	public List<Course> getCourses() {
		return this.courseservice.getCourses();
	}

	@RequestMapping("/course/{id}")
	public Course getcourse(@PathVariable int id) {
		return this.courseservice.getcourse(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/course")
	public Course addcourse(@RequestBody Course newcourse) {
		return this.courseservice.addcourse(newcourse);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/course")
	public Course updatecourse(@RequestBody Course course) {
		return this.courseservice.updatecourse(course);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/course/{id}")
	public void deletecourse(@PathVariable int id) {
		this.courseservice.deletecourse(id);
	}

}
