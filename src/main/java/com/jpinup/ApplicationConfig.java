package com.jpinup;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

	@Bean
	public String karan() {
		return "Hello Mr. Kaw";
	}

	@Bean
	public AnnotationAspectJPinupApplication.Employee empId1() {
		return new AnnotationAspectJPinupApplication().new Employee(karan());
	}
}
