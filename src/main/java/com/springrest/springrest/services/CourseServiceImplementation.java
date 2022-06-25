package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entity.Course;

@Service
public class CourseServiceImplementation implements CourseService {

    List<Course> list;

    CourseServiceImplementation() {
        list = new ArrayList<>();
        list.add(new Course(1, "java", "this is java"));
        list.add(new Course(1, "java", "this is java"));
        list.add(new Course(1, "java", "this is java"));
    }

    @Override
    public List<Course> getCourses() {

        return list;
    }

    @Override
    public Course getcourse() {
        
        return null;
    }

    @Override
    public Course addcourse() {
       
        return null;
    }

    @Override
    public Course updatecourse() {
        
        return null;
    }

}
