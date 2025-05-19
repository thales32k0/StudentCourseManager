package com.meuprojeto.studentcoursemanager.repository;

import com.meuprojeto.studentcoursemanager.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
