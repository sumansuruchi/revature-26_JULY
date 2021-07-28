package eg1;

public class Demo1 {

	private int x;
	private int y;
	
	public Demo1(String name) {
		System.out.println("hello calculator(string) name is"+name);
		
	}
	public Demo1(int x,int y)
	{
		this.x=x;//variable shawoding
		this.y=y;
	}
	public int add() {
		return x+y;
		
	}
	public int sub() {
		return x-y;
		
	}
	public int multiply() {
		return x*y;
	}
}
