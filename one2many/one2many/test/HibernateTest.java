package one2many.test;

import one2many.model.Person;
import one2many.model.Vehicle;
import one2many.implement.PersonDAOImpl;
import one2many.implement.VehicleDAOImpl;

public class HibernateTest {
	
	public static void main(String[] args) {
		PersonDAOImpl userDAOImpl=new PersonDAOImpl();
		VehicleDAOImpl vehicleDAOImpl=new VehicleDAOImpl();
		
		Person person1 =new Person();
		person1.setName("Oktay");
		person1.setSurname("Uyar");
		person1.setPhone("05323453234");
	
		Vehicle vehicle1=new Vehicle();
		vehicle1.setBrand("Ferrari");
		vehicle1.setModel("F50");
		vehicle1.setColor("Kirmizi");
		
		Vehicle vehicle2=new Vehicle();
		vehicle2.setBrand("Volvo");
		vehicle2.setModel("S60");
		vehicle2.setColor("Gri");
		
		person1.getVehicle().add(vehicle1);
		person1.getVehicle().add(vehicle2);
		vehicle1.setPerson(person1);
		vehicle2.setPerson(person1);
		
		userDAOImpl.insertPerson(person1);
		vehicleDAOImpl.insertVehicle(vehicle1);
		vehicleDAOImpl.insertVehicle(vehicle2);
		
		
	}
}
