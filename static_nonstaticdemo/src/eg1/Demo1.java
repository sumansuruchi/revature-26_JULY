package eg1;

public class Demo1 {
	public Demo1() {

	System.out.println("hello i an  constructor i will be executed for every object creation");}
	public static void main(String[] args) {
		
System.out.println("helo from main");
iAmstatic();
Demo1 d=new Demo1();
d.iAmnonstatic();
Demo1 d1=new Demo1();

Calci.iAmstatic();
Calci c=new Calci();
c.iAmnonstatic();
	}
	public static void iAmstatic() {
		System.out.println("Hello i am a static method");
	}
	public  void iAmnonstatic() {
		System.out.println("Hello i am a  nonstatic method");
	}
	static {
		System.out.println("I am anynomus i will be execuyed once even before main");
	}
	{
		System.out.println("i am anonymus i wiil executed evry time you created object");
	}
}
