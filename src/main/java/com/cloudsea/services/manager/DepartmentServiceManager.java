package com.cloudsea.services.manager;

import java.util.List;

import com.cloudsea.services.model.Department;

/**
 * Interface to all the Department Manager Methods
 * 
 * @author shahbaz03
 *
 */
public interface DepartmentServiceManager {
	
	List<Department> getAllDepartment();
	
	Department getDepartmentById(String deptId);
	
	Department getDepartmentByName(String deptName);
	
	void saveDepartment(Department department);
	
	void updateDepartment(Department department);

}
