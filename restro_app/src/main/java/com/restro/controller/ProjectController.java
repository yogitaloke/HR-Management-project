//package com.restro.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.restro.entity.Department;
//import com.restro.entity.Employee;
//import com.restro.repository.DepartmentRepository;
//import com.restro.repository.EmployeeRepository;
//
//import jakarta.transaction.Transactional;
//
//@RestController
//@Transactional
//@CrossOrigin
//public class ProjectController {
//
//	@Autowired
//	EmployeeRepository employeeRepository;
//
//	@Autowired
//	DepartmentRepository departmentRepository;
//
//	@PostMapping("departments")
//	public Department saveDepartment(@RequestBody Department department) {
//		return departmentRepository.save(department);
//	}
//
//
//	@PostMapping("employee")
//	public Employee saveEmployee(@RequestBody Employee employee) {
//		return employeeRepository.save(employee);
//	}
//
//
//
//}
