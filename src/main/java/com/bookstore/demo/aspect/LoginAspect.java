package com.bookstore.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
/*import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;*/
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
@EnableAspectJAutoProxy 

public class LoginAspect {

	//private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Before("pointcut()")
	public void beforelogin(JoinPoint jp) {
		System.out.println(" going to login into system**********");
		System.out.println(" Logged in"+ jp.getSignature()); 
	}
	
	//Here we need to pass expression so that spring AOP can knows where to target customized methods
	@Pointcut(value ="execution(* com.bookstore.demo.controller.*.login(..))")
	public void pointcut() {
		
	}
}
