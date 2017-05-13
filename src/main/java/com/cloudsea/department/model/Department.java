package com.cloudsea.department.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * A standard department entity object
 * holding the department details.
 * 
 * We can add more fields later.
 * 
 * @author shahbaz03
 *
 */
@Document
public class Department {
	@Id
	private ObjectId id;
	private String name;
	
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
