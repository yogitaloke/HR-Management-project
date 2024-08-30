package com.restro.dto;

import com.restro.entity.Department;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalDate;

public class EmployeeDTO {

    private Integer employeeId;
    private String employeeName;
    private String emailId;
    private String mobileNumber;
    private LocalDate hiredate;
    private Integer jobId;
    private Double salary;
    private String designation;
    private String skills;



    private DepartmentDTO department;



    public EmployeeDTO() {
        // TODO Auto-generated constructor stub
    }

    public EmployeeDTO(Integer employeeId, String employeeName, String emailId, String mobileNumber, Integer jobId, LocalDate hiredate, Double salary, String designation, String skills, DepartmentDTO department) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.emailId = emailId;
        this.mobileNumber = mobileNumber;
        this.jobId = jobId;
        this.hiredate = hiredate;
        this.salary = salary;
        this.designation = designation;
        this.skills = skills;
        this.department = department;
    }

    public DepartmentDTO getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentDTO department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public LocalDate getHiredate() {
        return hiredate;
    }

    public void setHiredate(LocalDate hiredate) {
        this.hiredate = hiredate;
    }

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "department=" + department +
                ", employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", emailId='" + emailId + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", hiredate=" + hiredate +
                ", jobId=" + jobId +
                ", salary=" + salary +
                ", designation='" + designation + '\'' +
                ", skills='" + skills + '\'' +
                '}';
    }
}
