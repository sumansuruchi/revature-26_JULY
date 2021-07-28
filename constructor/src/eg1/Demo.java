package eg1;

public class Demo {

	public static void main(String[] args) {
		Demo1 c=new Demo1("java");

		System.out.println("add = "+c.add());
		c=new Demo1(10,20);
		System.out.println("add = "+c.add());
		System.out.println("sub = "+c.sub());
		System.out.println("multiply = "+c.multiply());

	}

}
