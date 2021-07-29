package eg1;

public class Palidromarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,11,121,131,454,66,81};
		findpalindrom(arr);

	
	}
	
	public static void findpalindrom(int arr[])
	{
		for(int i=0;i<arr.length;i++) {
			int x=arr[i];
			int sum=0;
			while(x>0)
			{
				int r=x%10;
				 sum=(sum*10)+r;
				x=x/10;
			}
			if(sum==arr[i]) {
				System.out.println(arr[i]+"is palindrome");
				
			}
			
		}
		
	}
}
