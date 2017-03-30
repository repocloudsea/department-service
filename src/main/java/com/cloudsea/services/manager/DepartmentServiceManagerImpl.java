package com.cloudsea.services.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cloudsea.services.dao.DepartmentServiceDao;
import com.cloudsea.services.model.Department;

/**
 * It holds all the business logic for the department object
 * 
 * @author shahbaz03
 *
 */
@Component
public class DepartmentServiceManagerImpl implements DepartmentServiceManager {
	@Autowired
	private DepartmentServiceDao dao;

	@Override
	public List<Department> getAllDepartment() {
		return dao.getAllDepartments();
	}

	@Override
	public Department getDepartmentById(String deptId) {
		return dao.getDepartmentById(deptId);
	}

	@Override
	public Department getDepartmentByName(String deptName) {
		return dao.getDepartmentByName(deptName);
	}

	@Override
	public void saveDepartment(Department department) {
		dao.save(department);

	}

	@Override
	public void updateDepartment(Department department) {
		dao.update(department);

	}

}
