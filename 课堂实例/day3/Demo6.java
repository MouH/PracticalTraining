package day3;

import java.io.IOException;

public class Demo6 {
	
	public static  void fun() throws IOException {
		//抛出一个异常对象
		throw new IOException();
	}
	
	
	

	public static void main(String[] args) {
//		String s = null;
//		s.length();
//		int[] iarr = {1,2,3};
//		System.out.println(iarr[iarr.length]);
//		System.out.println("ok");
		
		try {
			if(1==1)fun();
			System.out.println("1");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("catch");
			return ;
			//e.printStackTrace();
		} finally {
			System.out.println("ok");
		}
	}

}
