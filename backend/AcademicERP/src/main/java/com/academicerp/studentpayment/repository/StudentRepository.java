package com.academicerp.studentpayment.repository;

import com.academicerp.studentpayment.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface StudentRepository extends JpaRepository<Student , Long>{

    Student findByUsername(String username);
}
