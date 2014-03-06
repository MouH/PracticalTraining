package day3;

public class Demo1 {

	public static void main(String[] args) {
		//定义数组
		int[] iarr = new int[10];
		Object[] oarr = new Object[10];
		//定义数组时的初始化
		int[] iarr1 = new int[]{1,2,3,4,5};
		int[] iarr2 = {1,2,3,4,5};
		//访问数组
		//System.out.println(iarr1[1]);
		//遍历数组
		//一般的for语句
//		for(int i=0;i<iarr2.length;i++) {
//			System.out.println(iarr2[i]);
//		}
		//for-each语句
		for(int i:iarr2){
			System.out.println(i);
		}
		
		

	}

}
