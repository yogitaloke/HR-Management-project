package com.restro.dto;

import com.restro.entity.Employee;

import java.util.List;

public interface DepartmentProjection {
    public Integer getDepartmentId();
    public String getDepartmentName();
    public List<Employee> getEmp();

    interface Employee{
        public Integer getEmployeeId();
        public String getEmployeeName();
    }
}
