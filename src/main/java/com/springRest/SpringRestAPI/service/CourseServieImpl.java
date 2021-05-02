package com.springRest.SpringRestAPI.service;

import com.springRest.SpringRestAPI.entities.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServieImpl implements CourseService {
    List<Course> list;

    public CourseServieImpl(){
        list = new ArrayList<>();
        list.add(new Course(12,"Java Course","Learn Java"));
        list.add(new Course(13,"React Course","Learn React"));
    }

    @Override
    public List<Course> getCourse() {
        return list;
    }

    @Override
    public Course getCourse(long courseId) {
        Course course = null;
        for(Course c : list){
            if(c.getId() == courseId){
                course = c;
                break;
            }
        }
        return course;
    }

    @Override
    public Course addCourse(Course course) {
        list.add(course);
        return course;
    }

    @Override
    public Course updateCourse(Course course) {
        Course newCourse = null;
        for(Course c : list){
            if(c.getId() == course.getId()){
                c.setTitle(course.getTitle());
                c.setDescription(course.getDescription());
                newCourse = c;
                break;
            }
        }
        return newCourse;
    }

    @Override
    public Course deleteCourse(long courseId) {
        Course removedCourse = null;
        for(Course c : list){
            if(c.getId() == courseId){
                list.remove(c);
                removedCourse = c;
                break;
            }
        }
        return removedCourse;
    }
}
