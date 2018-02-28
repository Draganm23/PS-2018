package PS_2018.Exercitiul1.model;

import java.util.HashMap;
import java.util.Map;

public class Cart {
	
	private Map<Produs, Integer> products;
	
	public Cart() {
		products = new HashMap<>();
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(Produs p : products.keySet()) {
			sb.append(p.toString() + " : " );
			sb.append(products.get(p));
			sb.append("\n");
		}
		
		return sb.toString();
	}
	
	public void addProduct(Produs p, Integer q) {
		products.put(p, q);
	}
	
}
