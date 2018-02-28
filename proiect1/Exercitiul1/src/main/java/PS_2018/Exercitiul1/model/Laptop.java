package PS_2018.Exercitiul1.model;

public class Laptop extends Produs {
	
	private String operatingSystem;
	private Double screenSize;
	
	public Laptop(String name, Double price, Double screenSize, String operatingSystem) {
		super(name, price);
		this.operatingSystem = operatingSystem;
		this.screenSize = screenSize;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public Double getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(Double screenSize) {
		this.screenSize = screenSize;
	}

	public Double getPrice(int quantity) {
		Double actualPrice = this.getPrice();
		if(quantity >= 10) {
			actualPrice -= 10 * actualPrice / 100;
		} 
		return quantity * actualPrice;
	}

	
	
	
}
