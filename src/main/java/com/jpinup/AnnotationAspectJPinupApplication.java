package com.jpinup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
@SuppressWarnings({ "unused", "resource" })
public class AnnotationAspectJPinupApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnnotationAspectJPinupApplication.class, args);
		// SpringApplication.run(AnnotationAspectJPinupApplication.class, args);
		// Also Runs without Spring Boot
		System.out.println("************");
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		System.out.println("++++++++++++++++++++++++++++++++++++");
		System.out.println(context.getBean(AnnotationAspectJPinupApplication.Employee.class, "empId1").name);
	}

	class Employee {
		public Employee(String name) {
			this.name = name;
		}

		String name;
	}

}
