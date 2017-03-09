package one2one.implement;

import java.util.List;
import java.util.Iterator;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import one2one.interfaces.PersonDAO;
import one2one.model.Person;
import one2one.util.HibernateUtil;

public class PersonDAOImpl implements PersonDAO{

	Session session = HibernateUtil.getHibernateSession();

	public Person insertPerson(Person u) {
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
