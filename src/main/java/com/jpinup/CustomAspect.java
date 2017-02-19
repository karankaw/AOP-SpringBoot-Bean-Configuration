package com.jpinup;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CustomAspect {
	
	@Before("execution (* com.jpinup.AspectService.add(..))")
	public void addBefore(JoinPoint joinPoint){
		System.out.println("Before Method: " + joinPoint.getSignature().getName());
	}
	
	@Around("execution (* com.jpinup.AspectService.add(..))")
	public void addAround(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("Around Method Before: " + joinPoint.getSignature().getName());
		joinPoint.proceed();
		System.out.println("Around Method After: " + joinPoint.getSignature().getName());
	}
	
	

	
}
