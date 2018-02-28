package PS_2018.Exercitiul1.model;

public class SmartPhone extends Produs {
	
	private boolean waterProof;
	
	public SmartPhone(String name, Double price, boolean waterProof) {
		super(name, price);
		this.waterProof = waterProof;
	}

	public boolean isWaterProof() {
		return waterProof;
	}

	public void setWaterProof(boolean waterProof) {
		this.waterProof = waterProof;
	}

	public Double getPrice(int quantity) {
		Double price = this.getPrice();
		if(quantity > 20) {
			price -= 5*price/100;
		}
		return price * quantity;
	}
	
	

}
