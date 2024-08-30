package com.restro.dto;

import com.restro.entity.Department;

import java.time.LocalDate;

public interface EmployeeProjection {
    public Integer getEmployeeId();
    public String getEmployeeName();
    public String getEmailId();
    public String getMobileNumber();
    public LocalDate getHiredate();
    public Integer getJobId();
    public Double getSalary();
    public String getDesignation();
    public Department getDepartment();
    public String getSkills();

    interface Department{
        public Integer getDepartmentId();
    }

}
