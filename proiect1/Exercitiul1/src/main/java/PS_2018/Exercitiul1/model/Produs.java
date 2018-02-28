package PS_2018.Exercitiul1.model;

import PS_2018.Exercitiul1.model.interfaces.Buyable;

public abstract class Produs implements Buyable {
	private String name;
	private Double price;
	
	public Produs(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public String toString() {
		return name;
	}
}
