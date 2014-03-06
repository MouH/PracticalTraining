package qjt;
/**
 * 对调查信息进行处理的程序
 * */
public class Process {
	public int malenum;    //参加调查的男性人数
	public double averageAge;     //参加调查的平均年龄
	public int femalenum;  //参加调查的女性人数
	private int agesum;
	
	public Process(){
		malenum=0;
		femalenum=0;
		averageAge=0;
		agesum=0;
	}
	
	public synchronized void processOneVote(VoteBean vb){
		String sex=vb.getSex();
		int age=vb.getAge();
		agesum+=age;
		if(sex.equals("male")){
			malenum++;
		}else
			femalenum++;
		averageAge=agesum/(malenum+femalenum);
		
	}
}


















