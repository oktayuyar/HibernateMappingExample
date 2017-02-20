package one2one.implement;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import one2one.interfaces.AdressDAO;
import one2one.model.Adress;
import one2one.util.HibernateUtil;

public class AdressDAOImpl implements AdressDAO{
	
	Session session = HibernateUtil.getHibernateSession();

	public Adress insertAdress(Adress a) {
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
