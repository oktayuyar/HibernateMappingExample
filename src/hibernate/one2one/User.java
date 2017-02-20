package hibernate.one2one;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.TableGenerator;

import hibernate.one2one.Adress;

@Entity
public class User {
	@TableGenerator(name="ADR_GEN",allocationSize=1)
	@Id 
	@GeneratedValue(generator="ADR_GEN")
	private int id;
	
	private String name;
	private String surname;
	private String phone;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="adress_id")
	private Adress adress;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public Adress getAdress() {
		return adress;
	}
	public void setAdress(Adress adress) {
		this.adress = adress;
	}
	
	
}