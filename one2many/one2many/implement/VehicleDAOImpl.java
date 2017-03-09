package one2many.implement;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import one2many.interfaces.VehicleDAO;
import one2many.model.Vehicle;
import one2many.util.HibernateUtil;

public class VehicleDAOImpl implements VehicleDAO{
	
	Session session = HibernateUtil.getHibernateSession();

	public Vehicle insertVehicle(Vehicle a) {
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
