package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entity.Course;

public interface CourseService {
    public List<Course> getCourses();
    public Course getcourse();
    public Course addcourse();
    public Course updatecourse();
}
