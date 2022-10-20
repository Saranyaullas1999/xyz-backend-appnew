package com.nestdigital.xyzbackendappnew.Model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class StudentModel {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int rollno;
    private String admno;
    private String college;
    private String department;
    private String bloodgroup;
    private String dob;
    private String parentname;
    private String email;
    private String guardianname;
    private String address;

    public StudentModel() {
    }

    public StudentModel(int id, String name, int rollno, String admno, String college, String department, String bloodgroup, String dob, String parentname, String email, String guardianname, String address) {
        this.id = id;
        this.name = name;
        this.rollno = rollno;
        this.admno = admno;
        this.college = college;
        this.department = department;
        this.bloodgroup = bloodgroup;
        this.dob = dob;
        this.parentname = parentname;
        this.email = email;
        this.guardianname = guardianname;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getAdmno() {
        return admno;
    }

    public void setAdmno(String admno) {
        this.admno = admno;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getBloodgroup() {
        return bloodgroup;
    }

    public void setBloodgroup(String bloodgroup) {
        this.bloodgroup = bloodgroup;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getParentname() {
        return parentname;
    }

    public void setParentname(String parentname) {
        this.parentname = parentname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGuardianname() {
        return guardianname;
    }

    public void setGuardianname(String guardianname) {
        this.guardianname = guardianname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
