package com.academicerp.studentpayment.controller;

import com.academicerp.studentpayment.model.Payment;
import com.academicerp.studentpayment.model.Student;
import com.academicerp.studentpayment.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PaymentController {

    @Autowired
    PaymentRepository paymentRepository;

    @GetMapping("/payments")
    List<Payment> getPayments(){
        return paymentRepository.findAll();
    }
}
