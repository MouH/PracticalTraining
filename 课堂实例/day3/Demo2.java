package day3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo2 {

	public static void main(String[] args) {
		//Collection接口的用法
		//范型编程
		Collection<String> coll = new ArrayList<String>();
		coll.add("PHP");
		coll.add("java");
		coll.add("C++");
		System.out.println(coll.size());
		//遍历集合中的元素
		//方法1for-each
//		for(String s:coll) {
//			System.out.println(s);
//		}
		//方法2:Iterator迭代器
		Iterator<String> iter = coll.iterator(); 
		while(iter.hasNext()) {
			String s = iter.next();
			System.out.print(s+",");
		}
		
	}

}
