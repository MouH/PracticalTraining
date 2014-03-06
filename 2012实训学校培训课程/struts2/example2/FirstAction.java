package action;
import com.opensymphony.xwork2.Action;

public class FirstAction implements Action{
	String uname;
	public void setUname(String uname){
		this.uname=uname;
	}
	public String getUname(){
		return uname;
	}
	public String execute(){
		System.out.println(uname);
		return Action.SUCCESS;
	}
}
