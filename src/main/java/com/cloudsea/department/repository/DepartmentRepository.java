package com.cloudsea.department.repository;

import org.springframework.context.annotation.Import;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.cloudsea.commons.config.CloudSeaMongoConfiguration;
import com.cloudsea.department.model.Department;

@RepositoryRestResource(collectionResourceRel = "department", path = "department")
@Import(value = { CloudSeaMongoConfiguration.class })
public interface DepartmentRepository extends PagingAndSortingRepository<Department, String> {

}



