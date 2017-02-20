package one2one.test;

import one2one.model.Adress;
import one2one.model.User;

import one2one.implement.UserDAOImpl;

public class HibernateTest {
	
	public static void main(String[] args) {
		
		Adress address1 = new Adress();
        address1.setCity("Hatay");
        address1.setRoad("Ataturk Cad");
        address1.setStreet("ozgurluk sokak");

        Adress address2 = new Adress();
        address2.setCity("Izmir");
        address2.setRoad("Modern Evler Cad.");
        address2.setStreet("Gul Meydani Sokak");
				
		UserDAOImpl userDAOImpl=new UserDAOImpl();
		User user1 =new User();
		user1.setName("oktay");
		user1.setSurname("uyar");
		user1.setPhone("05373658934");
		user1.setAdress(address1);
		userDAOImpl.insertUser(user1);
		
		User user2 =new User();
		user2.setName("ahmet");
		user2.setSurname("uyar");
		user2.setPhone("05373658934");
		user2.setAdress(address2);
		userDAOImpl.insertUser(user2);		

	}
}
