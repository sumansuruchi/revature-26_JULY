package eg1;
import java.util.Arrays;


public class Arrayope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20 ,21,1 ,2, 4,5 ,6};
		System.out.println(arr);
		System.out.println();
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.binarySearch(arr, 100));
		System.out.println(Arrays.binarySearch(arr, 10));
		
		int arr1[]=Arrays.copyOf(arr, arr.length+5);
		System.out.println(Arrays.toString(arr1));
		
		int ar3[]=Arrays.copyOfRange(arr, 2, 4);
		System.out.println(Arrays.toString(ar3));
		Arrays.fill(ar3, -10);
		System.out.println(Arrays.toString(ar3));
		Arrays.fill(ar3, 0, 1, -90000);
		System.out.println(Arrays.toString(ar3));

	}

}
