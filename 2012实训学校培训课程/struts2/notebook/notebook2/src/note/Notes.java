package note;

public class Notes {
	private int nid;
	private String ncontent;
	private String ndate;
	private String nuser;
	
	public int getNid(){
		return nid;
	}
	public void setNid(int nid){
		this.nid=nid;
	}
	public String getNcontent(){
		return ncontent;
	}
	public void setNcontent(String ncontent){
		this.ncontent=ncontent;
	}
	public String getNdate(){
		return ndate;
		
	}
	public void setNdate(String ndate){
		this.ndate=ndate;
	}
	public String getNuser(){
		return nuser;
	}
	public void setNuser(String nuser){
		this.nuser=nuser;
	}
}
