package com.cloudsea.department.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * A standard department entity object holding the department details.
 * 
 * @author shahbaz03
 *
 */
@Document(collection = "department")
public class Department {

	@Id
	private String id;

	private String name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department() {
	}

	public Department(String name) {
		this.name = name;
	}

}
