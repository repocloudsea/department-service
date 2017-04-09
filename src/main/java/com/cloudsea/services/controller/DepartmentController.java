package com.cloudsea.services.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cloudsea.services.CompanyContextHolder;
import com.cloudsea.services.manager.DepartmentServiceManager;
import com.cloudsea.services.model.Department;

/**
 * A rest layer to all the Department related operations.
 * 
 * @author shahbaz03
 *
 */
@RestController
public class DepartmentController {
	@Autowired
	private DepartmentServiceManager manager;

	/**
	 * A simple rest end point to retrieve all the departments Every request
	 * coming must have the company id in the @RequestHeader which must be set
	 * in the CompanyContextHolder.
	 * 
	 */
	@RequestMapping(value = "/departments", method = RequestMethod.GET)
	public ResponseEntity<List<Department>> getAllDepartment(@RequestHeader("company") String companyId) {
		CompanyContextHolder.setCompany(companyId);
		List<Department> departments = manager.getAllDepartment();
		CompanyContextHolder.removeCompany();
		return new ResponseEntity<List<Department>>(departments, HttpStatus.OK);
	}

	@RequestMapping(value = "/department/id/{id}", method = RequestMethod.GET)
	public ResponseEntity<Department> getDepartmentById(@PathVariable String id,
			@RequestHeader("company") String companyId) {
		CompanyContextHolder.setCompany(companyId);
		Department department = manager.getDepartmentById(id);
		CompanyContextHolder.removeCompany();
		return new ResponseEntity<Department>(department, HttpStatus.OK);
	}

	@RequestMapping(value = "/department/name/{name}", method = RequestMethod.GET)
	public ResponseEntity<Department> getAllDepartmentByName(@PathVariable String name,
			@RequestHeader("company") String companyId) {
		CompanyContextHolder.setCompany(companyId);
		Department department = manager.getDepartmentByName(name);
		CompanyContextHolder.removeCompany();
		return new ResponseEntity<Department>(department, HttpStatus.OK);
	}

	@RequestMapping(value = "/addDepartment", method = RequestMethod.POST)
	public ResponseEntity<?> addUser(@RequestBody Department department, @RequestHeader("company") String companyId) {
		CompanyContextHolder.setCompany(companyId);
		manager.saveDepartment(department);
		CompanyContextHolder.removeCompany();
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
