package com.springRest.SpringRestAPI.controller;

import com.springRest.SpringRestAPI.entities.Course;
import com.springRest.SpringRestAPI.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/courses")
    public List<Course> getCourse(){
        return this.courseService.getCourse();
    }

    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable String courseId){
        return this.courseService.getCourse(Long.parseLong(courseId));
    }

    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course){
        return this.courseService.addCourse(course);
    }

    @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course course){
        return this.courseService.updateCourse(course);
    }

    @DeleteMapping("/courses/{courseId}")
    public Course deleteCourse(@PathVariable String courseId){
        return this.courseService.deleteCourse(Long.parseLong(courseId));
    }
}
