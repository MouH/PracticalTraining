package com.ambow.vsts.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory  sessionFactory;
	static {//只运行一次
		sessionFactory =
			new Configuration().configure()
					.buildSessionFactory();
	}
	//获得Session对象
	public Session getSession() {
		return sessionFactory.openSession();
	}
	
	
	
	public static void main(String[] args) {
		Session s = new HibernateUtil().getSession();
		System.out.println(s);

	}

}
