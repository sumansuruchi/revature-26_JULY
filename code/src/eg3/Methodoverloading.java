package eg3;

public class Methodoverloading {

	static int add(int a,int b){return a+b;}  
	static int add(int a,int b,int c){return a+b+c;}  
	}  
	class TestOverloading1{  
	public static void main(String[] args){  
	System.out.println(Methodoverloading.add(1,12));  
	System.out.println(Methodoverloading.add(10,11,15));  
	}
	}  



