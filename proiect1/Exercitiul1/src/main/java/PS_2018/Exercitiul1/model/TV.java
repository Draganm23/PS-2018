package PS_2018.Exercitiul1.model;

public class TV extends Produs{
	private boolean is3D;
	private boolean color;
	private boolean curved;
	public TV(String name, Double price, boolean is3D, boolean color, boolean curved) {
		super(name, price);
		this.is3D = is3D;
		this.color = color;
		this.curved = curved;
	}
	public boolean isIs3D() {
		return is3D;
	}
	public void setIs3D(boolean is3d) {
		is3D = is3d;
	}
	public boolean isColor() {
		return color;
	}
	public void setColor(boolean color) {
		this.color = color;
	}
	public boolean isCurved() {
		return curved;
	}
	public void setCurved(boolean curved) {
		this.curved = curved;
	}
	public Double getPrice(int quantity) {
		Double price = this.getPrice();
		if(quantity > 3) {
			price -= 20 * price / 100;
		}
		return price * quantity;
	}
	
	

}
