package eg1;

public class Demo1 {

	public static void main(String[] args) {
		Integer i1 = 100;
		Integer i2 = 100;
		Integer i3 = 500;
		Integer i4=new Integer(100);
		System.out.println("i1 = "+ i1  +  "memory of i1: "+System.identityHashCode(i1));
		System.out.println("i2 = "+ i2  +  "memory of i2: "+System.identityHashCode(i2));
		System.out.println("i3 = "+ i3  +  "memory of i1: "+System.identityHashCode(i3));
		System.out.println("i4 = "+ i1  +  "memory of i1: "+System.identityHashCode(i4));
		System.out.println("(i1==i2) = "+ (i1==i2));
		System.out.println("(i1==i4) = "+ (i1==i4));
		
		System.out.println("i1.equals(i2) = "+ i1.equals(i2));
		System.out.println("i1.equals(i4) = "+ i1.equals(i4));
		System.out.println("i1.equals(i3) = "+ i1.equals(i3));
		
		
		int x=10000;
		i1=x;
		System.out.println("i1 = "+i1);
		i1=19999;
		x=i1;
		System.out.println("x ="+x);
		System.out.println(Integer .MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		String s="990900";
		Integer j=Integer.parseInt(s);
		System.out.println("j = "+j);
		j=98989;
		s=j+"";
		System.out.println("s ="+s);
		System.out.println(Integer.toBinaryString(10));
		System.out.println(Integer.toHexString(20));
		System.out.println(Integer.toOctalString(10));
		Integer m=100;
		System.out.println("m = "+m);
		System.out.println("m.compareTo(100) :"+m.compareTo(100));
		System.out.println("m.compareTo(90) :"+m.compareTo(90));
		System.out.println("m.compareTo(1000) :"+m.compareTo(1000));
		float f=m.floatValue();
		System.out.println("f = "+f);
		
		







	}

}
