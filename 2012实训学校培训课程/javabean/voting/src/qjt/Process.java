package qjt;
/**
 * �Ե�����Ϣ���д���ĳ���
 * */
public class Process {
	public int malenum;    //�μӵ������������
	public double averageAge;     //�μӵ����ƽ������
	public int femalenum;  //�μӵ����Ů������
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


















