package com.cloudsea.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import springfox.documentation.spring.data.rest.configuration.SpringDataRestConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * Starter Class
 * 
 * @author Shahbaz.Alam
 *
 */
@SpringBootApplication
@ComponentScan("com.cloudsea.services")
@EnableSwagger2
@Import(SpringDataRestConfiguration.class)
public class DepartmentServiceApplication {
    public static void main(String[] args){
    	SpringApplication.run(DepartmentServiceApplication.class, args);
    }
    
}
