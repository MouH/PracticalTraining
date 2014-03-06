package day1;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		int i = 10;
		final int j = 10;
//		if(i==1) {
//		}
		//int类型,或者能提升为int
		switch(i) {
		case j:
		case 2:
			break;
		default:
		}
		//for语句运行流程
//		for(;;) {
//			
//		}
		//中奖程序,控制台输入一个0-9整数,随机产生一个数,
		int d =(int) ((Math.random()) * 10);
		System.out.println(d);
		Scanner scanner = new Scanner(System.in);
		
		int i1 = scanner.nextInt();
		if(i1 == d) {
			System.out.println("中奖");
		}else if(i1<d){
			System.out.println("小了");
		}else {
			System.out.println("大了");
		}
		
		
		
	}

}
