package eg1;

public class Datatypes {

	public static void main(String[] args) {
		int x=100;
		System.out.println("x = "+x);
		float f1=23.44f;
		System.out.println("value of f1 = "+f1);
		long cono=1234567890111l;
		System.out.println("value of conp = "+cono);
		boolean b=false;
		System.out.println("value of b ="+b);
		int n=10000;
		long r=n;//implict
		System.out.println("r = "+r);
		double d=n;//implict
		System.out.println("d = "+ d);
		float f=n;//implicit
		System.out.println("f = "+ f);
		float z=12.234f;
		System.out.println("z ="+z);
		double c=z;
		System.out.println("c = "+c);
		int o=100;
		char t=(char)o;//explict
		System.out.println("t = "+t);
		double d1=23.23;
		o=(int) d1; //explict
		System.out.println("o ="+o);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);

	}

}
