package com.seven.controller;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.seven.entity.Address;
import com.seven.services.TestServicesImp;
/**
 * 测试
 * ClassName: TestController <br/> 
 * date: 2016年3月10日 下午4:27:59 <br/> 
 * @author seven
 */
@Controller
@RequestMapping(value="/")
public class TestController {

	@Resource
	private TestServicesImp A;
	
	@RequestMapping(value="/index.do",method=RequestMethod.GET)
	@ResponseBody
	public String sends() {
		return A.getAddress().toString();
	}
	
	@RequestMapping("/seven.do")
	public void testAopInit() {
		A.Inits("seven");
	}
	public void testAopInit2() {
		A.Inits("seven",new Address());
	}
	

}
