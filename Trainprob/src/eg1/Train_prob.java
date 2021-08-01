package eg1;

public class Train_prob {
	private int id;
	private String traincode;
	private String station;
	private String arr;
	private String dept;
	
	

	public Train_prob(int id, String traincode, String station, String arr, String dept) {
		
		this.id = id;
		this.traincode = traincode;
		this.station = station;
		this.arr = arr;
		this.dept = dept;
	}
	public void print() {
		System.out.printf("%d %15s %15s %8s %8s\n",id,traincode,station,arr,dept);
		
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Yaswantpur Delhi Sari Rohilla Ac Duranto express (12213)");
		System.out.println("----------------------------------------------------");
		System.out.println("#      stationcode Stationame   arr       dept");
		System.out.println("----------------------------------------------------");
		Train_prob[] t= {
				new Train_prob(1,"Ypr","Yaswantpur","","23:40"),
				new Train_prob(2,"gtl","guntakal","03:45","03:50"),
				new Train_prob(3,"sc","Sekandarabad","08:55","9:00"),
				new Train_prob(4,"bpq","Balharsh","13:30","13:35"),
				new Train_prob(5,"jhs","jhasi","21:20","22:40"),
				new Train_prob(6,"hbg","habibganj","1:15","1:40"),
				new Train_prob(7,"Dee","delhi s rohilla","7:00","")
				
				
		};
		for(Train_prob t1:t)
		{
		t1.print();
		}
		
		System.out.println("----------------------------------------------------");

		

	}
	


}
