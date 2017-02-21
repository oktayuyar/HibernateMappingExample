package one2many.implement;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import one2many.interfaces.UserDAO;
import one2many.model.User;
import one2many.util.HibernateUtil;

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
