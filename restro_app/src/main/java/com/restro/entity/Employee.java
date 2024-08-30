package com.restro.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name="employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer employeeId;
	private String employeeName;
	private String emailId;
	private String mobileNumber;
	private LocalDate hiredate;
	private Integer jobId;
	private Double salary;
	private String designation;
	private String skills;
	private String password;
    
	@ManyToOne
	@JoinColumn(name="departmentId")
	private Department department;
	
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer employeeId, String employeeName, String emailId, String mobileNumber, LocalDate hiredate,
			Integer jobId, Double salary, String designation, String skills, Department department) {
		
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
		this.hiredate = hiredate;
		this.jobId = jobId;
		this.salary = salary;
		this.designation = designation;
		this.skills = skills;
		this.department = department;
	}

	public Employee(Department department, String designation, String emailId, Integer employeeId, String employeeName, LocalDate hiredate, Integer jobId, String mobileNumber, String password, Double salary, String skills) {
		this.department = department;
		this.designation = designation;
		this.emailId = emailId;
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.hiredate = hiredate;
		this.jobId = jobId;
		this.mobileNumber = mobileNumber;
		this.password = password;
		this.salary = salary;
		this.skills = skills;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
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

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	
	

	
	public Department getDepartment() {
		return department;
	}



	public void setDepartment(Department department) {
		this.department = department;
	}



	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", emailId=" + emailId
				+ ", mobileNumber=" + mobileNumber + ", hiredate=" + hiredate + ", jobId=" + jobId + ", salary="
				+ salary + ", designation=" + designation + ", department=" + department + ", skills=" + skills + "]";
	}
	
	

	
	
	

}
