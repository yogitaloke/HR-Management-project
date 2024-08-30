package com.restro.controller;

import com.responseType.QueryStatus;
import com.restro.dto.DepartmentProjection;
import com.restro.dto.EmployeeDTO;
import com.restro.dto.EmployeeProjection;
import com.restro.entity.Department;
import com.restro.entity.Employee;
import com.restro.exception.LoginNotFoundException;

import com.restro.exception.RestaurantNotFound;
import com.restro.repository.EmployeeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Transactional
@CrossOrigin
public class EmployeeController {
    @Autowired
    EmployeeRepository employeeRepository;


    //automatic view
    //return all employee using projection
    @GetMapping("employeeview")
    public List<EmployeeProjection> getEmployeeProjection (){
        return employeeRepository.findBy();
    }

//    @PostMapping("employee")
//	public Employee saveEmployee(@RequestBody Employee employee) {
//		return employeeRepository.save(employee);
//	}

    @GetMapping("employee")
    public List<Employee> getEmployees() {
        return (List<Employee>) employeeRepository.findAll();
    }

    @DeleteMapping("employees/{employeeId}")
    public QueryStatus deleteEmployee(@PathVariable int employeeId) {
        Integer dept = employeeRepository.deleteByEmployeeId(employeeId);
        if(dept == 1)
            return new QueryStatus (true);
        throw new RestaurantNotFound();
    }

//    //new get all employee
//    @GetMapping("employee/{departmentId}")
//    public List<Employee> getEmployeeByDepartmentId(@PathVariable Integer departmentId)
//    {
//        return (List<Employee>) employeeRepository.fi
//    }

    // new save employee
    @PostMapping("employee")
    public EmployeeDTO saveEmployee(@RequestBody Employee employee) {
        Employee realEmployee = employeeRepository.save(employee);
        EmployeeDTO  employeeDTO =new EmployeeDTO(realEmployee.getEmployeeId(), realEmployee.getEmployeeName(), realEmployee.getEmailId(), realEmployee.getMobileNumber(),realEmployee.getJobId(), realEmployee.getHiredate(),  realEmployee.getSalary(), realEmployee.getDesignation(), realEmployee.getSkills(), null);
        return employeeDTO;
    }

    //TODO search employee using id
    @GetMapping("employee/find/{employeeId}")
    public EmployeeProjection findEmployeeById(@PathVariable Integer employeeId){
        EmployeeProjection employee = employeeRepository.findByEmployeeId(employeeId);
        if(employee==null)
            throw new RestaurantNotFound();
        return employee;
    }

//    //TODO find employee by name
//    @GetMapping("employee/find/name/{employeeName}")
//    public List<EmployeeProjection> getDepartmentByName(@PathVariable String departmentName){
//        List<DepartmentProjection> deparment = departmentRepository.findByDepartmentName(departmentName);
//        if(deparment==null)
//            throw new RestaurantNotFound();
//        return  deparment;
//
//    }

    @GetMapping("employee/finddept/{departmentId}")
    public List<EmployeeProjection> getEmployeeByDepartmentId(@PathVariable Integer departmentId){
        Department department =new Department();
        department.setDepartmentId(departmentId);
        return (List<EmployeeProjection>) employeeRepository.findByDepartment(department);
    }

    @PostMapping("employee/login")
    public EmployeeProjection getEmployeeLogin (@RequestBody Employee employee){
        EmployeeProjection employeeProjection = employeeRepository.findByEmailIdAndPassword(employee.getEmailId(),employee.getPassword());
        if(employeeProjection==null)
            throw new RestaurantNotFound();
        return employeeProjection;
    }


}
