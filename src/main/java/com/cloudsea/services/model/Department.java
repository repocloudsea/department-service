package com.cloudsea.services.model;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

/**
 * A standard department entity object
 * holding the department details.
 * 
 * We can add more fields later.
 * 
 * @author shahbaz03
 *
 */
@Entity("department")
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
