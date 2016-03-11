package com.seven.services.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component("myServicesAop")
@Aspect
public class MyServicesAop {

	public static final String EDP = "execution(* com.seven.services.imp.*.*(..))";
	public static final String Lock = "lock()";

	@Pointcut(EDP)
	public void lock() {
	}

	@Before(Lock)
	public void before() {
		System.out.println("调用方法前注入方法");
	}

	@After(Lock)
	public void after() {
		System.out.println("调用方法后注入方法");
	}

	@Around(Lock)
	public Object aroundInit(ProceedingJoinPoint p) {

		Object b = null;
		p.getArgs();
		try {
			b = p.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return b;
	}
}
