package com.seven.entity;
/**
 * Bean
 * ClassName: Address <br/> 
 * date: 2016年3月10日 下午4:28:41 <br/> 
 * @author seven
 */
public class Address {
	private String sheng;
	private String shi;
	private String qu;
	private String ids;

	public Address() {
	}
	
	public String getSheng() {
		return sheng;
	}
	public void setSheng(String sheng) {
		this.sheng = sheng;
	}
	public String getShi() {
		return shi;
	}
	public void setShi(String shi) {
		this.shi = shi;
	}
	public String getQu() {
		return qu;
	}
	public void setQu(String qu) {
		this.qu = qu;
	}
	public String getIds() {
		return ids;
	}
	public void setIds(String ids) {
		this.ids = ids;
	}

	@Override
	public String toString() {
		return "Address [sheng=" + sheng + ", shi=" + shi + ", qu=" + qu + ", ids=" + ids + "]";
	}
	
	
}
