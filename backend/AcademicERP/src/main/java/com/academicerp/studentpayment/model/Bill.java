package com.academicerp.studentpayment.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Bill {
    @Id
    private Long bill_id;

    private String description;

    private int amount;

    private Date bill_date;

    private Date deadline;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @OneToMany(mappedBy = "bill")
    private List<Payment> paymentList = new ArrayList<>();

    public Bill() {
    }

    public Bill(Long bill_id, String description, int amount, Date bill_date, Date deadline, List<Payment> paymentList) {
        this.bill_id = bill_id;
        this.description = description;
        this.amount = amount;
        this.bill_date = bill_date;
        this.deadline = deadline;
        this.paymentList = paymentList;
    }

    public Long getBill_id() {
        return bill_id;
    }

    public void setBill_id(Long bill_id) {
        this.bill_id = bill_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getBill_date() {
        return bill_date;
    }

    public void setBill_date(Date bill_date) {
        this.bill_date = bill_date;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public List<Payment> getPaymentList() {
        return paymentList;
    }

    public void setPaymentList(List<Payment> paymentList) {
        this.paymentList = paymentList;
    }

    //    public Student getStudent() {
//        return student;
//    }

//    public void setStudent(Student student) {
//        this.student = student;
//    }
}
