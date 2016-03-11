package com.seven.services;

import java.util.List;

import com.seven.anno.MyAnnoTest;
import com.seven.entity.Address;
import com.seven.services.imp.A;
/**
 * ���ƽӿ�
 * ClassName: TestServicesImp <br/> 
 * date: 2016��3��10�� ����4:29:02 <br/> 
 * @author seven
 */
public interface TestServicesImp {

	public List<Address> getAddress();
	@MyAnnoTest(clazz=A.class,method="1")
	public void Inits(String a);
	@MyAnnoTest(clazz=A.class,method="seven")
	public void Inits(String a,Address address);
	
}
