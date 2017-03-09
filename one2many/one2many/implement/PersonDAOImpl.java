package one2many.implement;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import one2many.interfaces.PersonDAO;
import one2many.model.Person;
import one2many.util.HibernateUtil;

public class PersonDAOImpl implements PersonDAO{

	Session session = HibernateUtil.getHibernateSession();

	public Person insertPerson(Person u) {
		try{
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
