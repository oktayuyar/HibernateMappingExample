package one2one.implement;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import one2one.interfaces.AddressDAO;
import one2one.model.Address;
import one2one.util.HibernateUtil;

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
