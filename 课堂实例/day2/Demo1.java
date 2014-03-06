package day2;

public class Demo1 {
	//写一个方法，加int两个数，返回这个数
	public int  add(int x,int y) {
		return x + y;
	}
	
	public double  add(double x,double y) {
		return x + y;
	}
	public int  add(int x,int y,int z) {
		return x + y + z;
	}
	
	
	public static void main(String[] args) {
		new Demo1().add(10,20,10);

	}

}
