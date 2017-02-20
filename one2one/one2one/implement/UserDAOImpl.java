package one2one.implement;

import java.util.List;
import java.util.Iterator;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import one2one.interfaces.UserDAO;
import one2one.model.User;
import one2one.util.HibernateUtil;

public class UserDAOImpl implements UserDAO{

	Session session = HibernateUtil.getHibernateSession();

	public User insertUser(User u) {
		try{
			System.out.println("eklenen kullanıcının adı ve soyadı :"+u.getName()+" "+u.getSurname());
			session.beginTransaction();
			session.persist(u);
			session.getTransaction().commit();
			}
		    catch (HibernateException e) {
		    	if (session.getTransaction()!=null) session.getTransaction().rollback();
		    	e.printStackTrace(); 
			  }		
			return u;
	}

}
