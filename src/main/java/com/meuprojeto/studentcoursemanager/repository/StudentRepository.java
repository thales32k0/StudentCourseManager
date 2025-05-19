package com.meuprojeto.studentcoursemanager.repository;

import com.meuprojeto.studentcoursemanager.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}

