package one2many.implement;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import one2many.interfaces.AddressDAO;
import one2many.model.Address;
import one2many.util.HibernateUtil;

public class AddressDAOImpl implements AddressDAO{
	
	Session session = HibernateUtil.getHibernateSession();

	public Address insertAddress(Address a) {
		try{
			session.beginTransaction();
			session.persist(a);
			session.getTransaction().commit();
			}
		    catch (HibernateException e) {
		    	if (session.getTransaction()!=null) session.getTransaction().rollback();
		    	e.printStackTrace(); 
			  }		
			return a;
	}
}
