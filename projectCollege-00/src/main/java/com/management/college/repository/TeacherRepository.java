package com.management.college.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.management.college.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {

}
