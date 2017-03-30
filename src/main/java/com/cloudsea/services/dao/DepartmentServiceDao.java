package com.cloudsea.services.dao;

import java.util.List;

import com.cloudsea.services.model.Department;

/**
 * Interface to all Department Dao methods
 * 
 * @Todo Can add more methods later
 * 
 * @author shahbaz03
 *
 */
public interface DepartmentServiceDao {
	void save(Department department);
	
	List<Department> getAllDepartments();
	
	Department getDepartmentById(String deptId);
	
	Department getDepartmentByName(String deptName);

	void update(Department department);

}
