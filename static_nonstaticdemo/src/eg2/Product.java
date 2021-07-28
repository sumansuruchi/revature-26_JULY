package eg2;

public class Product {
	private int pid;
	private String name;
	private double price;//instance level
	private   static float discount=2.5f;//class level

	public static void main(String[] args) {

	Product p1=new Product();
	p1.pid=100;
	p1.name="av";
	p1.price=233333;
	System.out.println("\nprinting p1");
	p1.printProduct();
	discount=7.9f;
	Product p2=new Product();
	p2.pid=200;
	//p2.name="cv";
	//p2.price=233333;
	System.out.println("printing p1");
	p2.printProduct();
	

	}
	public void printProduct() {
		System.out.println("Product id :"+pid);
		System.out.println("Product name :"+name);
		System.out.println("Product price :"+price);
		System.out.println("product Discount :"+discount);
	}

}
