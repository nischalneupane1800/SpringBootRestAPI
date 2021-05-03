package com.springRest.SpringRestAPI.dao;

import com.springRest.SpringRestAPI.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDao extends JpaRepository<Course,Long> {

}
