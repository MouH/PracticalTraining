package action;
import java.util.*;

import com.opensymphony.xwork2.Action;
public class BookAction implements Action{
	ArrayList<Book> blist;
	
	public void setBlist(ArrayList<Book> blist){
		this.blist =blist;
	}
	public ArrayList<Book> getBlist(){
		return blist;
	}
	public String execute(){
		blist=new ArrayList<Book>();
		blist.add(new Book("Struts 2���","����","50"));
		blist.add(new Book("��������","�ȶ�����","20"));
		blist.add(new Book("��˹̹����","��Ľ��","30"));
		return Action.SUCCESS;
	}
}
