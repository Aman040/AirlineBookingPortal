package com.utility;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import com.entity.Airlines;
import com.entity.Flights;
import com.entity.Users;



public class HiberanteUtlity {
	private static SessionFactory sf;
	static {
		sf=new AnnotationConfiguration()
				.addAnnotatedClass(Flights.class)
				.addAnnotatedClass(Users.class)
				.addAnnotatedClass(Airlines.class)
				.configure()
				.buildSessionFactory();
	}
	public static Session getSession() {
		Session session=sf.openSession();
		return session;
	}

}
