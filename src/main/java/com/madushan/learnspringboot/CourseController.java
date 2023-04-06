package com.madushan.learnspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    // @GetMapping is also correct
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(
                new Course(
                        1,
                        "Learn AWS",
                        "in 1 hour"
                ),
                new Course(
                        2,
                        "Cloud Computing",
                        "in 10 hour"
                )
        );
    }
}
