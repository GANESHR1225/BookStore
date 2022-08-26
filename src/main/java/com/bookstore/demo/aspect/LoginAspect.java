package com.bookstore.demo.aspect;

import org.aspectj.lang.JoinPoint;
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
	
	@Around ("pointcut()")
	public void beforelogin() {
		System.out.println(" going to login into system**********");
		/* logger.info(" Logged in", jp.getClass()); */
	}
	
	//Here we need to pass expression so that spring AOP can knows where to target customized methods
	@Pointcut(value ="execution(* com.bookstore.demo.controller.*.*(..))")
	public void pointcut() {
		
	}
}
