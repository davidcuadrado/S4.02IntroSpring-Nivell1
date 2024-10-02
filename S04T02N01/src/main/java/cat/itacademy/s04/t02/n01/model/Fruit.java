package cat.itacademy.s04.t02.n01.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Fruit {

	@Id
	private int id;
	private String name;
	private int kiloQuantity;

	
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

	public int getKiloQuantity() {
		return kiloQuantity;
	}

	public void setKiloQuantity(int kiloQuantity) {
		this.kiloQuantity = kiloQuantity;
	}

}
