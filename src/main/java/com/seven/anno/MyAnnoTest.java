package com.seven.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * ����SpringAOP��ʹ���Զ���Anno�������淶Χ<br>
 * ClassName: MyAnnoTest <br/> 
 * date: 2016��3��10�� ����4:27:02 <br/> 
 * @author seven
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnoTest {
	/**
	 * �ӿ�ʵ����
	 * @return
	 */
	Class<?> clazz() default Object.class;
	/**
	 * ���ط���
	 * @return
	 */
	String method() default "NULL";
	
}
