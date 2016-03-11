package com.seven.services.imp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.seven.anno.MyAnnoTest;
import com.seven.dao.Test;
import com.seven.entity.Address;
import com.seven.services.TestServicesImp;
/**
 * 测试
 * ClassName: A <br/> 
 * date: 2016年3月10日 下午4:29:17 <br/> 
 * @author seven
 */
@Service("testServicesImp")
public class A implements TestServicesImp{

	@Resource
	private Test Test;

	@Override
	public List<Address> getAddress(){
		return Test.getAddress();
	}
	
	@Override
	@MyAnnoTest
	public void Inits(String a){
		System.out.println(a);
	}

	@Override
	@MyAnnoTest
	public void Inits(String a, Address address) {
		System.out.println(a+address);
	}
}
