package com.first.studentcrudapi.repository;

import com.first.studentcrudapi.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}