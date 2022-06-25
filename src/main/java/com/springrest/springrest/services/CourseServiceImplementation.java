package com.springrest.springrest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entity.Course;

@Service
public class CourseServiceImplementation implements CourseService {

    @Autowired
    private CourseDao coursedao;

    CourseServiceImplementation() {

    }

    @Override
    public List<Course> getCourses() {

        return coursedao.findAll();
    }

    @Override
    public Course getcourse(int id) {
        Optional<Course> c = coursedao.findById(id);
        return c.get();

    }

    @Override
    public Course addcourse(Course course) {
        return coursedao.save(course);

    }

    @Override
    public Course updatecourse(Course course) {
        coursedao.save(course);
        return course;
    }

    @Override
    public void deletecourse(int id) {
        Optional<Course> c = coursedao.findById(id);
        coursedao.delete(c.get());
    }

}
