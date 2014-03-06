package day3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Demo5 {
	public static void main(String[] args) {
		User u1 = new User("tom",16);	//"u1"--u1
		User u2 = new User("alice",18);	//"u2"--u2
		User u3 = new User("alice2",19);//"u3"--u3
		User u4 = new User("tom",16);   //"u4" --u4

		Map<String,User> m = new HashMap<String,User>();
		Map<User,String> m1 = new HashMap<User,String>();
		//一对key-value,放-put
		m.put("u1",u1);
		m.put("u2",u2);
		m.put("u3",u3);
		m.put("u4",u4);
		
		//System.out.println(m);
		//根据key,取值
		User u = m.get("u2");
		//System.out.println(u.getName()+","+u.getAge());
		//取出key的集合,取出value的值合
		Set<String> s1 = m.keySet();	//key的集合
		Collection<User> us = m.values();	//value的集合,User对象集合
		//遍历
		for(String key:s1) {
			User value =  m.get(key);
			System.out.println(key+","+
					value.getName()+","+value.getAge());
			
		}
		//Map.Entry
		//m.entrySet();
	}

}
