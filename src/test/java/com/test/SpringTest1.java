package com.test;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.seven.controller.TestController;
import com.test.base.TestSpringBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class SpringTest1 extends TestSpringBase {
	private Logger logger=Logger.getLogger(SpringTest1.class);
	@Test
	public void test() {
//		System.out.println(getBean(TestController.class).sends());
		getBean(TestController.class).testAopInit2();
	}
}
