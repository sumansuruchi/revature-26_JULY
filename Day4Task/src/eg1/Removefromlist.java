package eg1;

public class Removefromlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {101,22,344,699,7237};
		Remove(arr);
	}
	public static void Remove(int arr[])
	{
		for(int i=0;i<arr.length;i++) {
			int x=arr[i];
			int sum=0;
			sum=x%10;
		while(!(x>0&&x<=9))
			{
			
				x=x/10;
			}
			if(x!=sum) {
				System.out.println(arr[i]);
				
			}
			
		}
		
	}

}
