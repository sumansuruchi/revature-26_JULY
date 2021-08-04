package set;
import java.util.*;

import Arraylist.Produt;



public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Set<Product> productList = new HashSet<>();
		
productList.add(new Product(1, "Rice", 100, 4, 3));
productList.add(new Product(2, "peddy", 1000, 5.9, 5));
productList.add(new Product(3, "jute", 2099, 9.6, 6));
productList.add(new Product(4, "maize", 11100, 1.4, 1));
productList.add(new Product(5, "Nuts", 6000, 4.9, 2));
productList.add(new Product(6, "Fruits", 3000, 9.1, 9));

		
		
		ProductMain p = new ProductMain();
		System.out.println("Product List");
		p.printProduct(productList);
		
	}
	
	public void printProduct(Set<Product> productList) {
		for(Product p: productList) {
			System.out.println(p);
		}
	}

}

