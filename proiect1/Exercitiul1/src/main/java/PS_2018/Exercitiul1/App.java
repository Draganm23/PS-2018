package PS_2018.Exercitiul1;

import PS_2018.Exercitiul1.model.Cart;
import PS_2018.Exercitiul1.model.Laptop;
import PS_2018.Exercitiul1.model.Produs;
import PS_2018.Exercitiul1.model.SmartPhone;
import PS_2018.Exercitiul1.model.TV;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Produs p1 = new Laptop("ASUS Rog 751", 5000.00, 17.3, "Windows");
        Produs p2 = new SmartPhone("Samsung A8", 2300.00, true);
        Produs p3 = new TV("LG", 2000.00, true, true, false);
        
        Cart c = new Cart();
        
        c.addProduct(p1,5);
        c.addProduct(p2, 10);
        c.addProduct(p3, 3000);
        
        System.out.println(c);
    }
}
