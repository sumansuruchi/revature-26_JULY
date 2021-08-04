package eg1;
import java.util.*;

public class Train {
	private int trainno;
	private String code;
	private String station;
	private String app;
	private  String depp;
	public   static void print(int trainno,String code ,String station,String arr,String depp )
	{
		System.out.printf("%1d %5s %5s %5s %5s\n",trainno,code,station,arr,depp);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("yaswntpur delhi sarai duranto express(12321)");
		System.out.println("---------------------------------------------");
		System.out.println("#  code  staion  arr  dept ");
		System.out.println("------------------------------");
		print(1,"ytr","yaswantpue","","23:40");
		print(2,"gtl","guntankal","3:40","3:45");
		print(3,"sc","sicandrabad","8:45","9:10");
		print(4,"bpq","balsarh","13:10","13:40");
		print(5,"hbj","habibganj","21:20","21:25");
		print(6,"jhs","jhasi","1:15","1:40");
		print(7,"dee","delhi","7:00","");
		System.out.println("-------------------------");
		
	



	}

}
