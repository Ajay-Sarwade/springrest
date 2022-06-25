package com.springrest.springrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entity.Course;
import com.springrest.springrest.services.CourseService;

import java.util.*;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
        return this.courseservice.getcourse();
	}

	@RequestMapping(method = RequestMethod.POST, value = "/course")
	public Course addcourse(@RequestBody Course newcourse) {
        return this.courseservice.addcourse();
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/course")
	public Course updatecourse(@RequestBody Course topic) {
		return this.courseservice.updatecourse();
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/course/{id}")
	public String deletecourse(@PathVariable int id) {

	}

}
