package com.academicerp.studentpayment.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Date;

@Entity
public class Payment {
    @Id
    private Long pid;
    String description;

    int amount;

    Date payment_date;

    @ManyToOne
    @JoinColumn(name = "student_id")
    Student student;

    @ManyToOne
    @JoinColumn(name = "bill_id")
    Bill bill;

    public Payment() {
    }

    public Payment(Long pid, String description, int amount, Date payment_date) {
        this.pid = pid;
        this.description = description;
        this.amount = amount;
        this.payment_date = payment_date;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
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

    public Date getPayment_date() {
        return payment_date;
    }

    public void setPayment_date(Date payment_date) {
        this.payment_date = payment_date;
    }
}
