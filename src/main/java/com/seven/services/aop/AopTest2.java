package com.seven.services.aop;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import com.seven.anno.MyAnnoTest;

@Aspect
@Component
/**
 * ���ע��  anno+POINTCUT���ʽ
 * ClassName: AopTest2 <br/> 
 * date: 2016��3��10�� ����1:53:47 <br/> 
 * @author seven
 */
public class AopTest2 {
	private static final String POINTCUT = "execution(* com.seven.services.imp.*.*(..))";
	private static final String LOCKER = "pointCut()";
	private static final String ANNO = "&&@annotation(com.seven.anno.MyAnnoTest)";
	private Logger logger = Logger.getLogger(AopTest2.class);

	public AopTest2() {
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

	@Around(LOCKER+ANNO)
	public Object aroundInit(ProceedingJoinPoint p) {
		Object b = null;
		try {
			MyAnnoTest anno=MethodSignature.class.cast(p.getSignature()).getMethod().getAnnotation(MyAnnoTest.class);
			if(anno.method()==MethodSignature.class.cast(p.getSignature()).getMethod().getName()){
				
				
			}
			
			System.out.println("������"+Arrays.toString(p.getArgs()));
			b = p.proceed();
			
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return b;
	}

}
