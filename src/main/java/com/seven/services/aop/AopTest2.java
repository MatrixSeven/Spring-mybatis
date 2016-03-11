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
 * 组合注入  anno+POINTCUT表达式
 * ClassName: AopTest2 <br/> 
 * date: 2016年3月10日 下午1:53:47 <br/> 
 * @author seven
 */
public class AopTest2 {
	private static final String POINTCUT = "execution(* com.seven.services.imp.*.*(..))";
	private static final String LOCKER = "pointCut()";
	private static final String ANNO = "&&@annotation(com.seven.anno.MyAnnoTest)";
	private Logger logger = Logger.getLogger(AopTest2.class);

	public AopTest2() {
		logger.info(this.getClass().getName() + "成功加载");

	}

	@Pointcut(POINTCUT)
	private void pointCut() {
	}

	@After(LOCKER)
	public void after() {
		System.out.println("我来注入");
	}

	@Before(LOCKER)
	public void before() {
		System.out.println("注入完成");
	}

	@Around(LOCKER+ANNO)
	public Object aroundInit(ProceedingJoinPoint p) {
		Object b = null;
		try {
			MyAnnoTest anno=MethodSignature.class.cast(p.getSignature()).getMethod().getAnnotation(MyAnnoTest.class);
			if(anno.method()==MethodSignature.class.cast(p.getSignature()).getMethod().getName()){
				
				
			}
			
			System.out.println("参数："+Arrays.toString(p.getArgs()));
			b = p.proceed();
			
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return b;
	}

}
