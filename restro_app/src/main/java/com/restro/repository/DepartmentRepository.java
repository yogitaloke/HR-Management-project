package com.restro.repository;

import com.restro.dto.DepartmentProjection;
import org.springframework.data.repository.CrudRepository;

import com.restro.entity.Department;

import java.util.List;

public interface DepartmentRepository extends CrudRepository<Department, Integer> {
    Integer deleteByDepartmentId(Integer departmentId);
    List<DepartmentProjection> findBy();
    DepartmentProjection findByDepartmentId(Integer departmentId);
    List<DepartmentProjection> findByDepartmentName(String departmentName);


}
