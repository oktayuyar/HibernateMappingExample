package one2one.test;

import one2one.model.Adress;
import one2one.model.User;
import one2one.util.HibernateUtil;

import org.hibernate.Session;

public class HibernateTest {
	
	public static void main(String[] args) {
		Session session = HibernateUtil.getHibernateSession();
		session.beginTransaction();
		
		Adress address1 = new Adress();
        address1.setCity("Hatay");
        address1.setRoad("Ataturk Cad");
        address1.setStreet("ozgurluk sokak");

        Adress address2 = new Adress();
        address2.setCity("Izmir");
        address2.setRoad("Modern Evler Cad.");
        address2.setStreet("Gul Meydani Sokak");

        User user1 =new User();
		user1.setName("oktay");
		user1.setSurname("uyar");
		user1.setPhone("05373658934");
		user1.setAdress(address1);
		
        User user2 =new User();
        user2.setName("ahmet");
        user2.setSurname("tumkaya");
        user2.setPhone("05053951235");
        user2.setAdress(address2);
        
        session.save(user1);
        session.save(user2);
        
        session.getTransaction().commit();
	}
}
