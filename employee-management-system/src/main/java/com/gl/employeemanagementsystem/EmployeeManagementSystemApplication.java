package com.gl.employeemanagementsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.gl.employeemanagementsystem.entity,"
+"com.gl.com.gl.employeemanagementsystem.service,"
		+"com.gl.employeemanagementsystem.service.impl,"
+"com.glemployeemanagementsystem.controller,"
		+"com.gl.employeemanagementsystem.repository"
)
public class EmployeeManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementSystemApplication.class, args);
		
	}

}
