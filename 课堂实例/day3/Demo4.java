package day3;

import java.util.ArrayList;
import java.util.List;

public class Demo4 {

	public static void main(String[] args) {
		List<User>users = new ArrayList<User>(); 
		User u1 = new User("tom",16);
		User u2 = new User("alice",18);
		User u3 = new User("alice2",19);
		User u4 = new User("tom",16);
		users.add(u1);
		users.add(u2);
		users.add(u3);
		users.add(u4);
		//System.out.println(users);
		//有序
		User u = users.get(1);
		//System.out.println(u.getName()+","+u.getAge());
		//遍历方法,一般for语句
		for(int i = 0;i<users.size();i++) {
			u = users.get(i);
			System.out.println(u.getName()+","+u.getAge());
		}
		
		
		
		
		
		
		
		
	}

}
