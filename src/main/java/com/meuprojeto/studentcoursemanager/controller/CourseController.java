package com.meuprojeto.studentcoursemanager.controller;

import com.meuprojeto.studentcoursemanager.model.Course;
import com.meuprojeto.studentcoursemanager.repository.CourseRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    private final CourseRepository courseRepository;

    public CourseController(CourseRepository courseRepository){
        this.courseRepository = courseRepository;
    }

    @GetMapping
    public List<Course> getAll(){
        return courseRepository.findAll();
    }

    @PostMapping
    public Course create(@RequestBody Course course) {
        return courseRepository.save(course);
    }

    @GetMapping("/{id}")
    public Course getById(@PathVariable Long id) {
        return courseRepository.findById(id).orElseThrow();
    }

    @PutMapping("/{id}")
    public Course update(@PathVariable Long id, @RequestBody Course updated) {
        Course course = courseRepository.findById(id).orElseThrow();
        course.setName(updated.getName());
        return courseRepository.save(course);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        courseRepository.deleteById(id);
    }
}
