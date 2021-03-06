package one2many.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private final static SessionFactory sf = new Configuration()
	        .configure("hibernate.cfg2.xml").buildSessionFactory();
	
    private volatile static Session session = sf.openSession();
    
	private HibernateUtil() {
	}

	public static Session getHibernateSession() {
	      if(session == null) {
	    	  session = (Session) new HibernateUtil();
	       }
	       return session;
	}
}
