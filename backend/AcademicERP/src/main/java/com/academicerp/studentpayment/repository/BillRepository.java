package com.academicerp.studentpayment.repository;

import com.academicerp.studentpayment.model.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<Bill , Long> {
}
