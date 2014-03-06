package note;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import java.util.*;

public class NotesAction extends ActionSupport{
	private List<Notes> nlist;
	private String nid;
	private String ncontent;
	private String nuser;
	
	public void setNid(String nid){
		this.nid=nid;
	}
	public void setNcontent(String ncontent){
		this.ncontent=ncontent;
	}
	public void setNuser(String nuser){
		this.nuser=nuser;
	}
	
	public List<Notes> getNlist(){
		return nlist;
	}
	
	public String select(){
		NotesDao ndao=NotesDao.getInstance();
		nlist=ndao.selectAll();
		return "success";
	}
	public String insert(){
		NotesDao ndao=NotesDao.getInstance();
		ndao.insert(nuser, ncontent);
		return "success";

	}
	public String delete(){
		NotesDao ndao=NotesDao.getInstance();
		ndao.delete(nid);
		return "success";

	}
}
