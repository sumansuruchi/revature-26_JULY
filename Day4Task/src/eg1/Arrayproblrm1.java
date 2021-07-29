package eg1;
import java.util.Arrays;

public class Arrayproblrm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Integer ar1[]= {12,33,11,23,4,11,12,11,12,11};
int n=2;
		
		System.out.println(ar1);
		
		System.out.println(Arrays.toString(ar1));
		System.out.println("nth element"  + Nthele(ar1,n));
		
		

	}
public static int Nthele(Integer[] ar1,int n){
	Arrays.sort(ar1);
	System.out.println("sorted array");
	return ar1[n-1];
	
}

}
