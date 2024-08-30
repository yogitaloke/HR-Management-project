package com.restro.repository;

import com.restro.dto.DepartmentProjection;
import com.restro.dto.EmployeeProjection;
import com.restro.entity.Department;
import org.springframework.data.repository.CrudRepository;

import com.restro.entity.Employee;

import java.util.List;


public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
    Integer deleteByEmployeeId(Integer employeeId);
  // List<Employee> findByDepartment( );
   List<EmployeeProjection> findBy();
   EmployeeProjection findByEmployeeId(Integer EmployeeId);
    List<EmployeeProjection> findByEmployeeName(String EmployeeName);
    List<EmployeeProjection> findByDepartment(Department department);
    EmployeeProjection findByEmailIdAndPassword(String emailId, String Password);

}
