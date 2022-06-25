package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entity.Course;

public interface CourseService {
    public List<Course> getCourses();

    public Course getcourse(int id);

    public Course addcourse(Course course);

    public Course updatecourse(Course course);

    public void deletecourse(int id);
}
