package com.restro.dto;

import com.restro.entity.Employee;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

public class DepartmentDTO {

    private Integer departmentId;
    private String departmentName;



    private List<EmployeeDTO> emp= new ArrayList<>();

    public DepartmentDTO() {
        // TODO Auto-generated constructor stub
    }


    public DepartmentDTO(Integer departmentId, String departmentName, List<EmployeeDTO> emp) {
        super();
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.emp = emp;
    }




    public DepartmentDTO(Integer departmentId, String departmentName) {
        super();
        this.departmentId = departmentId;
        this.departmentName = departmentName;
    }


    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }


    public List<EmployeeDTO> getEmp() {
        return emp;
    }


    public void setEmp(List<EmployeeDTO> emp) {
        this.emp = emp;
    }

    @Override
    public String toString() {
        return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + "]";
    }

}
