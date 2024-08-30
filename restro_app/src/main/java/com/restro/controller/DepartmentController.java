package com.restro.controller;

import com.responseType.QueryStatus;
import com.restro.dto.DepartmentDTO;
import com.restro.dto.DepartmentProjection;
import com.restro.dto.EmployeeDTO;
import com.restro.entity.Department;
import com.restro.entity.Employee;
import com.restro.entity.Restaurant;
import com.restro.exception.RestaurantNotFound;
import com.restro.repository.DepartmentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@Transactional
@CrossOrigin
public class DepartmentController {

    @Autowired
    DepartmentRepository departmentRepository;

	//TODO: Add department
	@PostMapping("departments")
	public Department saveDepartment(@RequestBody Department department) {
		return departmentRepository.save(department);
	}

	//TODO :automatic view
	// TODO: return all department using projection
	@GetMapping("departmentview")
	public List<DepartmentProjection> getDepartmentProjection (){
		return departmentRepository.findBy();
	}

		@DeleteMapping("departments/{departmentId}")
	    public QueryStatus deletedepartment(@PathVariable int departmentId) {
		Integer dept = departmentRepository.deleteByDepartmentId(departmentId);
		if(dept == 1)
			return new QueryStatus (true);
		throw new RestaurantNotFound();
	}

	// TODO: Get all departments using class
	@GetMapping("departments")
	public List<DepartmentDTO> getDepartments() {
		List<Department> departments =(List<Department>)departmentRepository.findAll();
		List<DepartmentDTO> departmentDTOS=new ArrayList<>();

		for(Department department: departments)
		{
			List<EmployeeDTO> employeeDTOS=new ArrayList<>();
			List<Employee> employees= department.getEmp();

			for(Employee employee:employees)
			{
				EmployeeDTO employeeDTO= new EmployeeDTO(employee.getEmployeeId(), employee.getEmployeeName(), employee.getEmailId(), employee.getMobileNumber(),employee.getJobId(),employee.getHiredate(),  employee.getSalary(), employee.getDesignation(), employee.getSkills(),null);
				employeeDTOS.add(employeeDTO);
			}
			DepartmentDTO departmentDTO= new DepartmentDTO(department.getDepartmentId(),
					department.getDepartmentName(),employeeDTOS);
			departmentDTOS.add(departmentDTO);
		}
		return departmentDTOS;
	}

	//TODO find department by Id
	@GetMapping("department/find/{departmentId}")
	public DepartmentProjection getDepartmentById (@PathVariable int departmentId){
		DepartmentProjection department =departmentRepository.findByDepartmentId(departmentId);
		if(department==null)
		{
			throw new RestaurantNotFound();
		}
		return department;
	}
	//TODO find department by name
	@GetMapping("department/find/name/{departmentName}")
	public List<DepartmentProjection> getDepartmentByName(@PathVariable String departmentName){
		List<DepartmentProjection> deparment = departmentRepository.findByDepartmentName(departmentName);
		if(deparment==null)
			throw new RestaurantNotFound();
		return  deparment;

	}


}
