package com.test.base;

import org.junit.After;
import org.junit.Before;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public abstract class TestSpringBase {
	
//	public BeanFactory context=null;
	protected ClassPathXmlApplicationContext context=null;
	@Before
	public void before() {
//		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		context=new ClassPathXmlApplicationContext("applicationContext.xml");
		context.start();
	}
	@After
	public void after() {
		context.destroy();
	}
	
	public <T> T  getBean(Class<T> t){
		return context.getBean(t);
	}
	@SuppressWarnings("unchecked")
	public <T> T getBean(String name){
		return (T) context.getBean(name);
	}

}
