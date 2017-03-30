package com.cloudsea.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


/**
 * Starter Class
 * 
 * @author Shahbaz.Alam
 *
 */
@SpringBootApplication
@ComponentScan("com.cloudsea.services")
public class DepartmentServiceApplication {
    public static void main(String[] args){
    	SpringApplication.run(DepartmentServiceApplication.class, args);
    }
    
}
