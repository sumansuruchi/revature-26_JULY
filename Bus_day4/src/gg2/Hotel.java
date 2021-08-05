package gg2;



public class Hotel implements Comparable<Hotel> {
	private int id;
	private String Item;
	private double cost;
	private int qty;
	

	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	public String getItem() {
		return Item;
	}

	public void setItem(String item) {
		Item = item;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	

	public Hotel(int id, String item, double cost, int qty) {
		super();
		this.id = id;
		Item = item;
		this.cost = cost;
		this.qty = qty;
		
	}

	public Hotel() {
		
	}
	public String toString() {
		return "Hotel [id=" + id + ", providerName=" +Item + ", cost=" + cost + ", rating=" + qty + "]";
	}
	public static void printProducts(int i, Hotel product) {
		System.out.printf("%d  %-7s %-8.2f %-4d %.2f\n",i, product.Item, product.cost, product.qty,  product.cost*product.qty);
	}










	public int compareTo(Hotel o) {
		Integer i1=this.id;
		Integer i2=o.id;
		return i1.compareTo(i2);

	}
}
