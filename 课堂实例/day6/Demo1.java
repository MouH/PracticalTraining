package day6;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ambow.vsts.entity.User;
import com.ambow.vsts.util.HibernateUtil;

public class Demo1 {
	public void save(Object obj) {
		Session session = new HibernateUtil().getSession();
		//打开一个事物
		Transaction tran = session.beginTransaction();
		//保存一个对象
		session.save(obj);
		tran.commit();
		session.flush();
		session.close();
	}
	public User getUserByID(long id) {
		Session session = new HibernateUtil().getSession();
		//打开一个事物
		Transaction tran = session.beginTransaction();
		//保存一个对象
		//User.class是User的类对象
		User u = (User)session.get(User.class,id);
		tran.commit();
		session.flush();
		session.close();
		return u;
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
//		User u = new User();
//		u.setName("alice2");
//		u.setEmail("a2@tom.com");
//		u.setPasswd("123457");
//		u.setAddress("ambow2");
//		u.setPhone("15712345678");
//		u.setReg_date(new java.util.Date());
//		new Demo1().save(u);
	
		User u = new Demo1().getUserByID(5);
		System.out.println(u.getName()+","+u.getUser_id());
	
	}
}
