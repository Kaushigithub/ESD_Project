package com.academicerp.studentpayment.controller;

import com.academicerp.studentpayment.model.Student;
import com.academicerp.studentpayment.model.User;
import com.academicerp.studentpayment.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("http://localhost:3000")
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/student")
    List<Student> getStudentById(){
        return studentRepository.findAll();
    }

    @GetMapping("/student/{id}")
   Optional<Student> getStudentById(@PathVariable Long id) {
        return studentRepository.findById(id);

    }

    @PostMapping("/auth")
    Student authenticate(@RequestBody User user) {

        Student sd =  studentRepository.findByUsername(user.getUsername());
        System.out.println(sd.getUsername());
        if(sd != null){
            if(user.getPassword().equals(sd.getPassword())){
                return sd;
            }
        }
        return null;
    }
}
