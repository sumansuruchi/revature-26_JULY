package eg1;



public class Iheritenceexmable {

	public static void main(String[] args) {
		Square s = new Square();
		
		s.area();
		Rectangle r=new Rectangle();
		r.area();
		Trapezium t=new Trapezium();
		t.area();
    

        
	}
	
        
        


}
class Quadilateral{
	public int length=10;
	
	
}
class Square extends Quadilateral{
	void area(){
		int area=length*length;
		System.out.println("area of square"+area);
		
	}
}

class Rectangle extends Quadilateral{
	void area (){
		int breadth=20;
		int area=2*(length*breadth);
		System.out.println("area of rectangle"+area);
		
	}
}

class Trapezium extends Quadilateral{
	void area(){
		int a=10;
		int b=20;
		int area=((a+b)/2)*length;
		System.out.println("area of tarpizum:"+area);
		
	}
}

