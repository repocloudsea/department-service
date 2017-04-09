package com.cloudsea.services.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cloudsea.services.CompanyContextHolder;
import com.cloudsea.services.db.MorphiaDatastore;
import com.cloudsea.services.model.Department;
import com.mongodb.MongoClient;

/**
 * It holds all the db operation methods.
 * 
 * @author shahbaz03
 *
 */
@Component
public class DepartmentServiceDaoImpl extends MorphiaDatastore implements DepartmentServiceDao {

	@Autowired
	private MongoClient mongoCLient;

	@Override
	public void save(Department department) {
		getDs(mongoCLient, CompanyContextHolder.getCompany()).save(department);
	}

	@Override
	public List<Department> getAllDepartments() {
		return getDs(mongoCLient, CompanyContextHolder.getCompany()).createQuery(Department.class)
				.asList();
	}

	@Override
	public Department getDepartmentById(String deptId) {
		return getDs(mongoCLient, CompanyContextHolder.getCompany()).createQuery(Department.class)
				.filter("deptId", deptId)
				.get();
	}

	@Override
	public Department getDepartmentByName(String deptName) {
		return getDs(mongoCLient, CompanyContextHolder.getCompany()).createQuery(Department.class)
				.filter("name", deptName)
				.get();
	}

	@Override
	public void update(Department department) {
		// will add the implementation laterO
	}

}
