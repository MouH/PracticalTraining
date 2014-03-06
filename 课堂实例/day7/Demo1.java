package day7;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ambow.vsts.entity.User;
import com.ambow.vsts.util.HibernateUtil;

public class Demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//hibernate查询
		Session session = new HibernateUtil().getSession();
		Transaction tran = session.beginTransaction();
		//查询
		//String hql = "select name,email from User";
		//?的位置从0算起
		//String hql = "from User u where u.name like ?";
		//参数可以命名参数
		String hql = "from User u where u.name like :name";
		//获得查询对象,链式写法
		//Query query = session.createQuery(hql);
		//prep.sexXxx(index,值)
		//query.setString(0, "k%");
		//获得查询结果,用户对象集合
		//List<User> users = query.list();
		
		List<User> users =	session.createQuery(hql).
				setString("name", "k%").
				list();
		
		
		
		tran.commit();
		session.close();

		//测试代码
		for(User u : users) {
			System.out.println(u.getUser_id()+","+u.getName());
		}
		
		
		
		
		
		
		//测试代码
//		for(Object u:users) {
//			Object[] o = (Object[]) u;
//			//System.out.println(u.getUser_id()+","+u.getName());
//			System.out.println(o[0]+","+o[1]);
//					
//		}
		

	}

}
