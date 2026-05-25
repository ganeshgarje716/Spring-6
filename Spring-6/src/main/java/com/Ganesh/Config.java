package com.Ganesh;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.Ganesh.entity.Employee;

@Configuration
@ComponentScan
public class Config {
	
	
	@Bean
	@Primary
	public Employee getEmp() {
		
		Employee emp=new Employee();
		
		return emp;
	}

}
