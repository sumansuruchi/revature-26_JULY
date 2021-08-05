package gg2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class HotelMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Hotel> list = new ArrayList<>();
		list.add(new Hotel(1,"rice",40.00,2));
		list.add(new Hotel(2,"dal",50.00,4));
		list.add(new Hotel(3,"curry",60.00,2));
		list.add(new Hotel(4,"paneer",240.00,1));
		list.add(new Hotel(5,"curd",40.00,4));
		
		Collections.sort(list, (Hotel p1, Hotel p2) -> {
			String s1 = p1.getItem();
			String s2 = p2.getItem();
			return s1.compareTo(s2);
		});
		HotelMain h = new HotelMain();
		h.printMainProducts(list);
	}
		public void printMainProducts(List<Hotel> list) {
			System.out.println("---------------------------------------");
			System.out.println("#  Name    Price   Qty.  Total");
			System.out.println("---------------------------------------");
			int  i = 1;
			for(Hotel p: list) {
				Hotel.printProducts(i++, p);
			}
			System.out.println("---------------------------------------");
			Double totalBill = list.stream().map(e -> e.getCost()*e.getQty()).reduce(0.0, (sum, bill) -> sum + bill);
			System.out.println("Total                    " + totalBill);
			System.out.println("5% GST                   " + totalBill*0.05);
			System.out.println("---------------------------------------");
			System.out.println("Final Bill               " + (totalBill*1.05));
			System.out.println("---------------------------------------");


	}

}
