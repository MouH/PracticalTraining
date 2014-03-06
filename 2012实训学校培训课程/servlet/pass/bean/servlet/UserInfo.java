package servlet;

public class UserInfo {
	private String name="";
	private String sex="";
	private String age="";
	
	public String getName(){
		return name;
	}
	public String getAge(){
		return age;
	}
	public String getSex(){
		return sex;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setSex(String sex){
		this.sex=sex;
	}
	public void setAge(String age){
		this.age=age;
	}
}
