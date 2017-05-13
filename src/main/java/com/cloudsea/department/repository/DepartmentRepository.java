package com.cloudsea.department.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.cloudsea.services.model.Department;

public interface DepartmentRepository extends PagingAndSortingRepository<Department, String> {

}
