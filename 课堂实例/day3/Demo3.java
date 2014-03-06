package day3;

import java.util.HashSet;
import java.util.Set;

public class Demo3 {

	
	public static void main(String[] args) {
		//Set集合:不重复
		//Set接口,HashSet是实现类
		Set<String> set = new HashSet<String>();
		set.add("java");
		set.add("php");
		set.add("asp");
		set.add("java");
		System.out.println(set);
		Set<User>users = new HashSet<User>();
		User u1 = new User("tom",16);
		User u2 = new User("alice",18);
		User u3 = new User("alice2",19);
		User u4 = new User("tom",16);
		users.add(u1);
		users.add(u2);
		users.add(u3);
		users.add(u4);
		System.out.println(users);

	}

}
