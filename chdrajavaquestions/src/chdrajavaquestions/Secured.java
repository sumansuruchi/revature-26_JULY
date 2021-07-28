package chdrajavaquestions;
import java.util.*;

public class Secured {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter url:");
		String src =sc.nextLine();
		isSecured(src);

	}
public  static void isSecured(String src)
{
	if(src.contains("https"))
	{
		System.out.println("Secured");
	}
	else
	{
		System.out.println("not sesure");
	}
}
}
