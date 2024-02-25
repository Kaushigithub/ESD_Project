package com.academicerp.studentpayment.repository;

import com.academicerp.studentpayment.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment , Long> {
}
