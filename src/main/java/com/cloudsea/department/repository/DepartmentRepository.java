package com.cloudsea.department.repository;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

import com.cloudsea.department.model.Department;
import com.cloudsea.services.db.MutiTenantMongoConfiguration;

@RepositoryRestResource(collectionResourceRel = "department", path = "department")
@Import(value = { MutiTenantMongoConfiguration.class })
public interface DepartmentRepository extends PagingAndSortingRepository<Department, String> {

}

@Configuration
class SpringDataRestBasePathConfig {

	@Bean
	public RepositoryRestConfigurer repositoryRestConfigurer() {
		return new RepositoryRestConfigurerAdapter() {
			@Override
			public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
				config.setBasePath("/cloudsea");
			}
		};
	}
}
