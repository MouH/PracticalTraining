package qjt;
/**
 * 在线调查中，保存调查信息的JavaBean
 * */
public class VoteBean {
	private String province;
	private String sex;
	private int age;
	
	public void setProvince(String province){
		this.province=province;
	}
	public String getProvince(){
		return province;
	}
	
	public void setSex(String sex){
		this.sex=sex;
	}
	public String getSex(){
		return sex;
	}
	
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age=age;
	}
}
