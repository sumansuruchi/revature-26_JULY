package stream;



public class Strem implements Comparable<Strem> {
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

	

	public Strem(int id, String item, double cost, int qty) {
		super();
		this.id = id;
		Item = item;
		this.cost = cost;
		this.qty = qty;
		
	}

	public Strem() {
		
	}
	public String toString() {
		return "Strem [id=" + id + ", providerName=" +Item + ", cost=" + cost + ", rating=" + qty + "]";
	}
	










	public int compareTo(Strem o) {
		Integer i1=this.id;
		Integer i2=o.id;
		return i1.compareTo(i2);

	}
}

