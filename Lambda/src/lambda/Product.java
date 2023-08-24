package lambda;
import java.util.*;
public class Product{
	int id;
	String name;
	float price;
	public Product(int id,String name,float price) {
		this.id=id;
		this.name=name;
		this.price=price;
	}

	public static void main(String[] args) {
		List<Product>list=new ArrayList<Product>();
        list.add(new Product(1,"Keyboard",198));
        list.add(new Product(2,"Laptop",5500f));
        list.add(new Product(3,"Mouse",300));
        
        System.out.println("Sorting on the basic of name ...");
        
        Collections.sort(list,(P1,P2)->{
        	
        	return P1.name.compareTo(P2.name);
        		
        });
        for(Product md:list) {
        	System.out.println(md.id+":"+md.name+":"+md.price);
        }
     
	}

}
