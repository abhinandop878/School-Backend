package com.nestDigital.schoolBackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class SchoolModel {
    @Id
    @GeneratedValue
    private int id;
    private int rollNo;
    private String studentName;
    private String standard;
    private String dob;
    private String parentName;
    private String parentMobileNo;
    private String address;

    public SchoolModel() {
    }

    public SchoolModel(int id, int rollNo, String studentName, String standard, String dob, String parentName, String parentMobileNo, String address) {
        this.id = id;
        this.rollNo = rollNo;
        this.studentName = studentName;
        this.standard = standard;
        this.dob = dob;
        this.parentName = parentName;
        this.parentMobileNo = parentMobileNo;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getParentMobileNo() {
        return parentMobileNo;
    }

    public void setParentMobileNo(String parentMobileNo) {
        this.parentMobileNo = parentMobileNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
