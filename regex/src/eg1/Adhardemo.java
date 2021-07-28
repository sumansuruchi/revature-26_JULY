package eg1;

import java.util.Scanner;

public class Adhardemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner   s=new Scanner(System.in);
   System.out.println("Enter adhar");
   String src=s.nextLine();
   isAdhar(src);
   
	}

	public static void isAdhar(String src)
	{
		if(src.matches("[0-9]{5}"))
				{
			System.out.println("adhar is valid");
				}
		else {
			System.out.println("adhar is not valid");
		}
	}
}
