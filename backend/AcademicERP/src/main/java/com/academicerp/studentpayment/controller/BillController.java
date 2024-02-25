package com.academicerp.studentpayment.controller;

import com.academicerp.studentpayment.model.Bill;
import com.academicerp.studentpayment.model.Student;
import com.academicerp.studentpayment.repository.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@CrossOrigin("http://localhost:3000")
public class BillController {
    @Autowired
    BillRepository billRepository;

    @GetMapping("/bill/{id}")
    Optional<Bill> getStudentById(@PathVariable Long id) {
        return billRepository.findById(id);

    }
}
