package com.meuprojeto.studentcoursemanager.controller;

import com.meuprojeto.studentcoursemanager.model.Student;
import com.meuprojeto.studentcoursemanager.repository.CourseRepository;
import com.meuprojeto.studentcoursemanager.repository.StudentRepository;
import com.meuprojeto.studentcoursemanager.model.Course;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentRepository studentRepository;
    private final CourseRepository courseRepository;

    public StudentController(StudentRepository studentRepository, CourseRepository courseRepository){
        this.studentRepository = studentRepository;
        this.courseRepository = courseRepository;
    }

    @GetMapping
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @PostMapping
    public Student create(@RequestBody Student student) {
        return studentRepository.save(student);
    }

    @GetMapping("/{id}")
    public Student getById(@PathVariable Long id) {
        return studentRepository.findById(id).orElseThrow();
    }

    @PutMapping("/{id}")
    public Student update(@PathVariable Long id, @RequestBody Student updated) {
        Student student = studentRepository.findById(id).orElseThrow();
        student.setName(updated.getName());
        student.setEmail(updated.getEmail());
        return studentRepository.save(student);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        studentRepository.deleteById(id);
    }

    @PutMapping("/{id}/courses")
    public Student enrolCourses(@PathVariable Long id, @RequestBody Set<Long> courseIds) {
        Student student = studentRepository.findById(id).orElseThrow();
        Set<Course> courses = courseRepository.findAllById(courseIds).stream().collect(java.util.stream.Collectors.toSet());
        student.setCourses(courses);
        return studentRepository.save(student);
    }

}
