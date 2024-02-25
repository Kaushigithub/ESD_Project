package com.academicerp.studentpayment.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Student {
    @Id
    private Long student_id;
    private int roll_no;

    private String name;

    private String username;

    private String password;
                                                                                                                                                                                    
    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<Bill> billList = new ArrayList<>();

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<Payment> paymentList = new ArrayList<>();

    public Student() {
    }

    public Student(Long student_id, int roll_no, String name, String username, String password, List<Bill> billList, List<Payment> paymentList) {
        this.student_id = student_id;
        this.roll_no = roll_no;
        this.name = name;
        this.username = username;
        this.password = password;
        this.billList = billList;
        this.paymentList = paymentList;
    }

    public Long getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Long student_id) {
        this.student_id = student_id;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Bill> getBillList() {
        return billList;
    }

    public void setBillList(List<Bill> billList) {
        this.billList = billList;
    }

    public List<Payment> getPaymentList() {
        return paymentList;
    }

    public void setPaymentList(List<Payment> paymentList) {
        this.paymentList = paymentList;
    }
}
