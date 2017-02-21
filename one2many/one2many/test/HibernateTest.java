package one2many.test;

import one2many.model.User;
import one2many.model.Address;
import one2many.implement.UserDAOImpl;

public class HibernateTest {
	
	public static void main(String[] args) {
		
		Address address1 = new Address();
        address1.setCity("Hatay");
        address1.setRoad("Ataturk Cad");
        address1.setStreet("ozgurluk sokak");

        Address address2 = new Address();
        address2.setCity("Izmir");
        address2.setRoad("Modern Evler Cad.");
        address2.setStreet("Gul Sokak");
				
		UserDAOImpl userDAOImpl=new UserDAOImpl();
		User user1 =new User();
		user1.setName("oktay");
		user1.setSurname("uyar");
		user1.setPhone("05373658934");
		user1.setAddress(address1);
		userDAOImpl.insertUser(user1);
		
		User user2 =new User();
		user2.setName("ahmet");
		user2.setSurname("uyar");
		user2.setPhone("05373658934");
		user2.setAddress(address2);
		userDAOImpl.insertUser(user2);		

	}
}
