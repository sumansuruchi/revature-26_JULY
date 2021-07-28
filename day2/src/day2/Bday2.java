package day2;

import java.util.Scanner;


public class Bday2 {

	public static void main(String[] args) {
		Aday2 p1=new Aday2();
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter Name");
	

		String name= sc.nextLine(); 
		System.out.println("enter id");
		int id=sc.nextInt();
		p1.setName(name);
		p1.setId(id);
		System.out.println("Name : " + p1.getName());

		System.out.println("Id : "+ p1.getId());

	}

}
