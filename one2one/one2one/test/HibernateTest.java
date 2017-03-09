package one2one.test;

import one2one.implement.PersonDAOImpl;
import one2one.model.Address;
import one2one.model.Person;

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
				
		PersonDAOImpl personDAOImpl=new PersonDAOImpl();
		Person person1 =new Person();
		person1.setName("oktay");
		person1.setSurname("uyar");
		person1.setPhone("05373658934");
		person1.setAddress(address1);
		personDAOImpl.insertPerson(person1);
		
		Person person2 =new Person();
		person2.setName("ahmet");
		person2.setSurname("uyar");
		person2.setPhone("05373658934");
		person2.setAddress(address2);
		personDAOImpl.insertPerson(person2);
	}
}
