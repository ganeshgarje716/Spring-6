package com.Ganesh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Ganesh.Service.OrderService;
import com.Ganesh.entity.Employee;

public class Test {
	
	
	public static void main(String[] args) {
		
		
		ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		
//		Employee e = (Employee)context.getBean("getEmp2");
//		
//		System.out.println(e.id);
		
//        Employee e = context.getBean(Employee.class);
//		
//		System.out.println(e.id);
		
		OrderService service = context.getBean(OrderService.class);
		service.processOrder();
		
	}

}
