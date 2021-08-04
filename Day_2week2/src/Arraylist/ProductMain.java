package Arraylist;
import java.util.*;

public class ProductMain {
	public static void main(String[] args) {
		

	List<Produt> productList = new ArrayList<>();
	productList.add(new Produt(1, "Rice", 100, 4, 3));
	productList.add(new Produt(2, "peddy", 1000, 5.9, 5));
	productList.add(new Produt(3, "jute", 2099, 9.6, 6));
	productList.add(new Produt(4, "maize", 11100, 1.4, 1));
	productList.add(new Produt(5, "Nuts", 6000, 4.9, 2));
	productList.add(new Produt(6, "Fruits", 3000, 9.1, 9));
	
	
	ProductMain p = new ProductMain();
	
	System.out.println("Product List");
	p.printProduct(productList);
	
	Collections.sort(productList, (Produt p1, Produt p2)-> {
		String s1 = p1.getName();
		String s2 = p2.getName();
		return s1.compareTo(s2);
	});
	System.out.println("\nSorting Product list by their name");
	p.printProduct(productList);
	
	
	Collections.sort(productList, (Produt p1, Produt p2)-> {
		Double c1 = p1.getCost();
		Double c2 = p2.getCost();
		int res = c1.compareTo(c2);
		if(res==0) {
			Double r1 = p1.getRating();
			Double r2 = p2.getRating();
			return r2.compareTo(r1);
		}
		return res;
	});
	System.out.println("\nSorting Product list by their cost");
	p.printProduct(productList);

	Collections.sort(productList,(Produt p1, Produt p2)-> {
		Double r1 = p1.getRating();
		Double r2 = p2.getRating();
		return r2.compareTo(r1);
	});
	System.out.println("\nSorting Product list by their Ratings");
	p.printProduct(productList);
	
	Collections.sort(productList, (Produt p1, Produt p2)-> {
		Integer q1= p1.getQuantity();
		Integer q2 = p2.getQuantity();
		return q2.compareTo(q1);
	});
	System.out.println("\nSorting Product list by their Quantity");
	p.printProduct(productList);
}

public void printProduct(List<Produt> productList) {
	for(Produt p: productList) {
		System.out.println(p);
	}
}

}

