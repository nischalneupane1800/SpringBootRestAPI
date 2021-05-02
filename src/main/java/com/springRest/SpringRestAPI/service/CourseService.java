package com.springRest.SpringRestAPI.service;

import com.springRest.SpringRestAPI.entities.Course;

import java.util.List;

public interface CourseService {
    public List<Course> getCourse();
    public Course getCourse(long courseId);
    public Course addCourse(Course course);
    public Course updateCourse(Course courseId);
    public Course deleteCourse(long courseId);
}
