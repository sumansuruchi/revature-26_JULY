package eg1;

public class Checkprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,11,121,131,454,66,81};
		Checkprime(arr);

	}
	public static void Checkprime(int arr[]) {
		
		
		for (int i = 0; i <= arr.length; i++) {
			boolean flag=true;
			for(int j=2;j<arr[i];++j)
			{
				if(arr[i]%j==0)
				{
					flag=false;
					break;
				}
			}
			if(flag)
			{
				System.out.println(arr[i]+"is a prime no");
			}
	}
	}
}


