package com.seven.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * 拦截SpringAOP，使用自定义Anno控制切面范围<br>
 * ClassName: MyAnnoTest <br/> 
 * date: 2016年3月10日 下午4:27:02 <br/> 
 * @author seven
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnoTest {
	/**
	 * 接口实现类
	 * @return
	 */
	Class<?> clazz() default Object.class;
	/**
	 * 拦截方法
	 * @return
	 */
	String method() default "NULL";
	
}
