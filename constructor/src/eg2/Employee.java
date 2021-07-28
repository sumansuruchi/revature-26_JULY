package eg2;

public class Employee {
private int id;
private String name;
private int age;
private String city;
private String degination;
public Employee(int id, String name) {
	this.id=id;
	this.name=name;
}
public Employee(int id, String name,int age,String city) {
	this(id,name);
	this.age=age;
	this.city=city;
}
public Employee(int id, String name,int age,String city,String degination) {
	this(id,name,age,city);
	
	this.degination=degination;
}
public void printemployee() {
	System.out.println("Id :"+id);
	System.out.println("Name :"+name);
	System.out.println("Age :"+age);
	System.out.println("city :"+city);
	System.out.println("degination :"+degination);
	
	
}
}
