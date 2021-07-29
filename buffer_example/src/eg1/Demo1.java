package eg1;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb1=new StringBuffer("hello");
		System.out.println("contents of sb1:"+    sb1      +"memory of sb1"+System.identityHashCode(sb1));
		sb1.append("hey");
		System.out.println("contents of sb1:"+    sb1      +"memory of sb1"+System.identityHashCode(sb1));
		
		sb1.delete(0, 2);
		System.out.println(sb1);
		sb1.reverse();
		
		System.out.println(sb1);
		sb1.deleteCharAt(1);
		System.out.println(sb1);
		
		sb1.insert(1, " i am new word here");
		System.out.println(sb1);
		System.out.println(sb1.length());
		
		StringBuffer sb2=new StringBuffer("hello");
		StringBuffer sb3=new StringBuffer("hello");
		if(sb2.toString().equals(sb3.toString())) {
			System.out.println("both are equal");
		}else {
			System.out.println("both are not equal");
		}

		System.out.println("hello".equals("hello"));
	}
		

	}


