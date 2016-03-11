package com.seven.services.aop;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * ע��ָ��ע���෽<br/>
 * ClassName: AopTest <br/> 
 * date: 2016��3��10�� ����1:53:03 <br/> 
 * @author seven
 */
@Aspect
@Component
public class AopTest {
	private static final String LOCKER = "pointCut()";
	private static final String POINTCUT = "@annotation(com.seven.anno.MyAnnoTest)";
	private Logger logger = Logger.getLogger(AopTest.class);

	public AopTest() {
		logger.info(this.getClass().getName() + "�ɹ�����");

	}

	@Pointcut(POINTCUT)
	private void pointCut() {
	}

	@After(LOCKER)
	public void after() {
		System.out.println("����ע��");
	}

	@Before(LOCKER)
	public void before() {
		System.out.println("ע�����");
	}

//	@Around(LOCKER)
	public Object aroundInit(ProceedingJoinPoint p) {
		Object b = null;
		try {
			System.out.println("������"+Arrays.toString(p.getArgs()));
			b = p.proceed();
			
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return b;
	}

}
