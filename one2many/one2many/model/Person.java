package one2many.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.TableGenerator;

import one2many.model.Vehicle;

@Entity
public class Person {
	@TableGenerator(name="PER_GEN",allocationSize=1)
	@Id 
	@GeneratedValue(generator="PER_GEN")
	private int id;
	
	private String name;
	private String surname;
	private String phone;
	
	@OneToMany(cascade= CascadeType.ALL)
	private Collection<Vehicle>  vehicle =new ArrayList<Vehicle>();
	
	public Collection<Vehicle> getVehicle() {
		return vehicle;
	}

	public void setVehicle(Collection<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}