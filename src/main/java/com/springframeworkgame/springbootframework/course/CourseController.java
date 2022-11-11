package com.springframeworkgame.springbootframework.course;

import com.springframeworkgame.springbootframework.course.bean.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    //we want to explose a simple api

    // http:///localhost:8080/course
    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        return Arrays.asList(new Course(1, "Spring Boot application", "Will Okans"),
                new Course(2, "Spring Boot framework", "Ada Jones"));
    }

    @GetMapping("/courses/1")
    public Course getCourse(){
        return new Course(3, "Spring Second Method 1", "Jack O'Niel");
    }
}
